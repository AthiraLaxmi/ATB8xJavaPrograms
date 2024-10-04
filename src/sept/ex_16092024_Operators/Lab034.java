package sept.ex_16092024_Operators;

public class Lab034 {
    public static void main(String[] args) {
        String first_name= "Athira";
        String last_name= "Thundiyil";

        System.out.println(first_name+last_name);

        //here in string its concatenate operator
        //in math it is add the value
        //QnA

        int a=10;
        int b=10;
        System.out.println(first_name+last_name+a+b); // here we used string first, so after a string if + comes it only concatenate
        System.out.println(first_name+last_name+(a+b)); // this solves the problem, we can use brackets to do the calculation here
        System.out.println(a+b+first_name+last_name); // here int comes first , so it will math first and then concatenate if applicable

    }
}
