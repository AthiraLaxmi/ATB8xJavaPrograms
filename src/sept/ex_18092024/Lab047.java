package sept.ex_18092024;

public class Lab047 {
    public static void main(String[] args) {
        //course fee= 100; GST=18.45;

        int course_fee=100;
        float GST=18.45f;

        //int total= course_fee+GST; //Narrowing -Implicit casting by JVM- Invalid
        float total= course_fee+GST;
        //System.out.println(total);

        //int total=course_fee+(int)GST; // Narrowing - Explicit casting - Invalid
        System.out.println(total);

    }
}
