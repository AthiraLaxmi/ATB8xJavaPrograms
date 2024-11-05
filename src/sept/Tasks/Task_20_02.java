package sept.Tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task_20_02 {
    public static void main(String[] args) {
        //write a program that classifies a triangle based on its side length
        //given three input values representing  the length of the sides, determine
        //if the triangle are equilateral (all sides are equal)
        //isosceles (exactly two sides are equal), or
        //scalene (no sides are equal)
        // Use the if-else condition  to classify the triangle
        //side1, side2,side3->

//        int side1=10;
//        int side2=20;
//        int side3= 30;
//        if (side1==side2 && side1==side3 && side2==side3){
//            System.out.println("equilateral");
//        }else if (side1==side2 || side2==side3){
//            System.out.println("isosceles");
//        }else{
//            System.out.println("scalene");
//        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the side 1 : ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of the side 2 : ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of the side 3 : ");
        double side3 = sc.nextDouble();

        //parent rule to check the negative condition

        if (side1 >= 1 && side2 >= 1 && side3 >= 1) {

            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("equilateral");

            } else if (side1 == side2 || side2 == side3) {
                System.out.println("isosceles");
            } else {
                System.out.println("scalene");
            }
        } else {
            System.out.println("Negative");
        }
    }
}




