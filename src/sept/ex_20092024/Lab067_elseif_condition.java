package sept.ex_20092024;

public class Lab067_elseif_condition {
    public static void main(String[] args) {
        int num1=30;
        int num2=30;
        if(num1>num2){
            System.out.println(num1);
        }
        else if (num2>num1){
            System.out.println(num2);
        }else{
            System.out.println("Equal!");
        }
    }
}
//we can have more number of else if
