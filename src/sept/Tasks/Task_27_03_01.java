package sept.Tasks;

public class Task_27_03_01 {
    public static void main(String[] args) {
        //write a java program that calculates the sum of numbers from 1 to 100 using do while loop

        int sum = 0; //variable t hold the sum
        int i = 1; // starting point

        do{
          sum +=i; //add i to sum
            i ++; // increment i
        }while (i <=100); // Continue until i is greater than 100

        System.out.println(sum);

    }

}
