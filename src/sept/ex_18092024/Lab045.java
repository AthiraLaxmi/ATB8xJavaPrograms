package sept.ex_18092024;

public class Lab045 {
    public static void main(String[] args) {
        //Type Casting
        //widening - implicit, explicit - lossless
        //Narrowing - implicit, explicit - (with data type) loss

        //widening

        byte b=10;
        int a =b; // here we can store b into a because, int is bigger than byte.
        System.out.println(b);

        //narrowing

       int val=300;
       //byte b1= val; // invalid implicit casting will detect by JVM
        byte b2= (byte)val;
        System.out.println(b2); // invalid explicit casting - loss of data.
    }
}
