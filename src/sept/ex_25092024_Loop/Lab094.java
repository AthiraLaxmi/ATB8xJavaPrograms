package sept.ex_25092024_Loop;

public class Lab094 {
    public static void main(String[] args) {
        // print the values of even and odd numbers from 0 to 50

        int i;
        for (i = 0; i <=50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even ->" + i);

            continue;
        }
        System.out.println(i);
        }

    }
    }

