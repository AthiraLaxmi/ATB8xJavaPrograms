package sept.Tasks;

import java.util.Scanner;

public class Task_20_04_FizzBuzz {
    public static void main(String[] args) {
        //FizzBuzz Problem
        //Write a program that prints numbers from 1 to n(100)
        //However, for multiples of 3 print 'Fizz' instead of the number
        //and for the multiples of 5 print 'Buzz'
        //for the numbers that are multiples of both 3 and 5 print 'FizzBuzz'

        //how to start:
        //Logic building

        //Step 1:
        //Input-> int - n -> n=100 - this should be done using Scanner class
        //Output - Return type is String -> Fizz, Buzz , FizzBuzz --- this means we need to use SOP

        //Step 2:
        //Rough Logic
        //To print 1-100--> For loop- > for(int i=1-100)
        //How to find multiple of i - using Modulus (%) function
        //i%3==Fizz, i%5==Buzz, i%3 && i%5==FizzBuzz

        //Write the real Logic

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number n=100");
        int n= sc.nextInt();

        for (int i = 1; i <=100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 3 ==0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");

            }else
                System.out.println(i);
            
        }



        }

    }

