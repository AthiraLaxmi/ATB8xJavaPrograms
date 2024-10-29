package sept.ex_25092024_Loop;

import java.util.Scanner;

public class Lab099 {
    public static void main(String[] args) {
        // How to take user input

        Scanner sc = new Scanner(System.in); //new operation is used to create new object
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println(name);
    }
}
