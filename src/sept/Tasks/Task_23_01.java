package sept.Tasks;

public class Task_23_01 {
    public static void main(String[] args) {
        //Create as simple calculator that performs addition, subtraction, multiplication
        // division and modulus based on the user inputs using the switch statements
        //inputs num1. num2
        //output- num1+num2 -> print the output

        int num1 = 10; // first number
        int num2 = 20; // second number
        char operator = '*'; // operations can be changed to '+', '-', '*', '/', '%'

        //variable to store the result
        //int result= 0;

        //switch statement to perform the selected operation
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);

        break;
            case '-':
                System.out.println(num1 - num2);

        break;
            case '*':
                System.out.println(num1 * num2);

        break;
            case '/':
                System.out.println(num1 / num2);

        break;
            case '%':
                System.out.println(num1 % num2);

        }
        }
    }

