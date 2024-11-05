package sept.Practice;

public class Practice02_While_loop {
    public static void main(String[] args) {
        // Table of num n=9; print the table with while loop

        int n=9;

        System.out.println(n);

        int i=1;

        while(i<=10){
            System.out.println(n + "*" + i + "=" + (n*i));
            i++;
        }
    }
}
