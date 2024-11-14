package sept.Tasks;

import java.util.Scanner;

public class Task_25_01 {
    public static void main(String[] args) {
        // Table of num n=10; print the table with for or while

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number\n");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
}

