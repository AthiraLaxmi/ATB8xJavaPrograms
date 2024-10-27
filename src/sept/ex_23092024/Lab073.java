package sept.ex_23092024;

public class Lab073 {
    public static void main(String[] args) {
        //JDK >13

        int itemCode =001;

        switch (itemCode){
            case 001-> System.out.println("It's a Laptop!");
            case 002-> System.out.println("It's a Desktop!");
            case 003,004 -> System.out.println("It's a Mobile phone!");
            default -> System.out.println("Hello!");
        }
    }
}
