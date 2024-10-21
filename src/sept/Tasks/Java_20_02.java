package sept.Tasks;

public class Java_20_02 {
    public static void main(String[] args) {
        //By using ternary operator maximum 3 numbers

        int a = 10;
        int b= 20;
        int c= 30;

        int max = (a>b) ? (a>c ? a:c): (b> c ?b:c);
        System.out.println(max);
    }
}
