package sept.ex_18092024;

public class Lab046 {
    public static void main(String[] args) {
        long phone_no = 9739783253l;
       // short s= phone_no; // Narrowing - implicit casting by JVM// invalid
        short s1= (short)phone_no;// Narrowing - Explicit casting-loss // Invalid
        System.out.println(s1);

    }
}
