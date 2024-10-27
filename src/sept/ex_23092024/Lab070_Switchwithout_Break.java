package sept.ex_23092024;

public class Lab070_Switchwithout_Break {
    public static void main(String[] args) {
        //Switch condition
        //Days 1- 7 -> 1 Mon, 2- Tue , .... 7 - Sun
        // if not giving break keyword all the statement in the loop will get executed.
        // if we write something out of the loop it will get executed

        int day= 1;
        switch (day){
            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("Tue");

            case 3:
                System.out.println("Wed");

            case 4:
                System.out.println("Thu");

            case 5:
                System.out.println("Fri");

            case 6:
                System.out.println("Sat");

            case 7:
                System.out.println("Sun");

        }
        System.out.println("End of the Day");
    }
}

