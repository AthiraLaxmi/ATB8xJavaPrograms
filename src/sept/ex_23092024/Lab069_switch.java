package sept.ex_23092024;

public class Lab069_switch {
    public static void main(String[] args) {
        //Switch condition
        //Days 1- 7 -> 1 Mon, 2- Tue , .... 7 - Sun
        // if not giving break keyword all the statement in the loop will get executed.
        // if we write something out of the loop it will get executed

        int day= 1;
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");

        }
        System.out.println("End of the Day");
    }
}
