package sept.Tasks;

public class Task_27_02_01 {
    public static void main(String[] args) {
        int count=0;
        int number=2;

        while (count <5){
            if (number %2==0) {
                System.out.println(number);
                count++;

            }
            number++;
        }
    }
}
