package sept.ex_20092024;

public class Lab068 {
    public static void main(String[] args) {
        //Grade Calculator
        //write a program that calculates and displays for a given numerical
        // the letter grade for given numerical score
        // e.g., A, B, C, D or F)
        // Based on the following grade scale:
        // A : 90-100
        // B : 80-89
        // C : 70-79
        // D : 60-69
        // F : 0-59

        //90-> A
        //87-> B
        //23-> F

        //Logic building - Java

        //1. Find the user inputs
        //score-> int score= 89;
        // return data type- grade-> char

        //2. Basic Logic
        // if (score>=90 && score<=100)-> return or print grade - A
        // else if (score <=89 && score >= 80)- return or print grade - B
        // else if (score <79 && score >=70)- return or print grade - C
        //else if (score <69 && score >=60)- return or print grade - D
        // else - return or print grade- F

        //3. Write the code

        char grade= 'F';
        int score= 89; // in the future will get this from the user inputs

        if (score >= 90 && score <=100) {
            grade = 'A';
        }
        else if (score >=80 && score <= 89) {
            grade = 'B';
        }
        else if (score >=70 && score <=79) {
            grade = 'C';
        }
        else if (score >=60 && score <=69) {
            grade = 'D';}
                else if (score <=0 || score > 100){
            System.out.println("!!!!");
                    grade= '0';
        }
        else {
            grade = 'F';
        }
            System.out.println("Your Grade is :" +grade);

        }


    }

