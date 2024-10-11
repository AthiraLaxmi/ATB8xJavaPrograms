package sept.ex_18092024;

public class Lab051_post_increment_eg {
    public static void main(String[] args) {
        int a = 10;
        int b= a++;

        System.out.println(a);
        System.out.println(b); // printing the value first then it will add the value
                               // so the printed values of b will be 10

        // line no | expression  |  a
        //  5      |             | 10
        //  6      |  b= 10       | 11
        //  7      |  b= 10       |  11
    }
}
