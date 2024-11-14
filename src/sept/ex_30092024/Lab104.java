package sept.ex_30092024;

public class Lab104 {
    public static void main(String[] args) {
        //calling-function
        //calling function should be inside the main
        //we can call the function n number of times

        for (int i = 0; i < 5; i++) {
            functionName();
            greet();
        }
    }

    public static void functionName(){
        System.out.println("This is VOID function");
    }

    //Defining part
    //No Return type and No Argument //Without Parameters and Without Return Type
    public static void greet(){
        System.out.println("Hiiii");
    }
}
