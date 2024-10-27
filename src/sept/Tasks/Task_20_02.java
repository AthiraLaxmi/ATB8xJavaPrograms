package sept.Tasks;

public class Task_20_02 {
    public static void main(String[] args) {
        //write a program that classifies a triangle based on its side length
        //given three input values representing  the length of the sides, determine
        //if the triangle are equilateral (all sides are equal)
        //isosceles (exactly two sides are equal), or
        //scalene (no sides are equal)
        // Use the if-else condition  to classify the triangle
        //side1, side2,side3->

        int side1=10;
        int side2=20;
        int side3= 30;
        if (side1==side2 && side1==side3 && side2==side3){
            System.out.println("equilateral");
        }else if (side1==side2 || side2==side3){
            System.out.println("isosceles");
        }else{
            System.out.println("scalene");
        }
    }
}
