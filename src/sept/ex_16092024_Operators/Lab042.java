package sept.ex_16092024_Operators;

public class Lab042 {
    public static void main(String[] args) {
        int a=12;
        boolean b= !(a>10 || a <5); //F F
        // !(true || true); = !true= false
        System.out.println(b);

        // java follows something called as BODMAS
        // bracket of , Division, multiplication, addition and subtraction
    }
}
