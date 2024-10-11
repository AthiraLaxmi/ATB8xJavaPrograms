package sept.ex_18092024;

public class Lab053_eg2 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        //A -> a++ -> 10, a=11
        // + -> operator
        // B -> ++a -> 12


        //here a++ value will be 10 and will get add 1 to it
        //then the value of a became 11
        // so a++(10)  + ++a(11+1) // here the after adding 1 to a , a becomes 11
        //so a++(10) + ++a(11+1) = 22
    }
}
