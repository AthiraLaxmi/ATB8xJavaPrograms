package sept.ex_18092024;

public class Lab050_pre_increment_eg {
    public static void main(String[] args) {
        int a=10;
        int b= ++a;
        System.out.println(a);
        System.out.println(b);

        // line no | expression  |  a
        //  5      |             | 10
        //  6      | b= 11       | 11
        //  7      |  b=11       |  11
    }
}
