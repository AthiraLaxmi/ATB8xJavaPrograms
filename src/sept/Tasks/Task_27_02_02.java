package sept.Tasks;

public class Task_27_02_02 {
    public static void main(String[] args) {
        int count = 0; //To keep track how many even numbers we have printed
        int number = 2;//Start from the first even number

        do {
            if (number % 2 == 0) { // check if number is even
                System.out.println(number); // print the current even number
                count++; //Increment the count of even number printed
            }
            number++; //move to the next number
        }while (number < 5) ; //continue until we have printed 5 even numbers
    }

}


