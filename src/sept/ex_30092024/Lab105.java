package sept.ex_30092024;

public class Lab105 {
    public static void main(String[] args) {
        //calling
        // 1. Without Parameter and Without Return Type
            function_type1();
        //2. without Parameters but With Return Type
        String name= function_type2();
        System.out.println(name);

        //3.With Parameters and Without Return Type
        function_type3("Athira");

        //4.With Parameters and With Return Type
        int result = function_type4(3,4);
        System.out.println(result);

    }
    //defining

    // 1.Without Parameter and Without Return Type
    public static void function_type1(){
           System.out.println("1.Without Parameter and Without Return Type");
       }
       public static String function_type2(){
            System.out.println("2.Without Parameters and With Return Type");
            return "Athira";
        }
       //3.With Parameters and Without Return Type

    public static void function_type3(String name){
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("You have shared -> " + name);
    }
    //4.With Parameters and With Return Type

      public static int function_type4(int a, int b){
          System.out.println("4.With Parameters and With Return Type");
          return a+b;
      }
    }

