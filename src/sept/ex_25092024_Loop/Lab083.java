package sept.ex_25092024_Loop;

public class Lab083 {
    public static void main(String[] args) {
        final boolean b1 = true;
        //b1 = false; - this is fixed now

//        for (int i = 0; b1; i++) {
//            System.out.println("Hello");
//            // it will print infinite as b1 is true
//        }

//        for(int i=0; ; ){
//            System.out.println("Hello");
//
//            // no condition no updation- this also will be infinite
//        }

        for (; ;){
            System.out.println("Hello");
        }
        // no initialization, no updation, no condition - also will be infinite




    }
}
