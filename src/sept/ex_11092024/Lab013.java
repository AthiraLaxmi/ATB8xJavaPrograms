package sept.ex_11092024;

import java.net.SocketOption;

public class Lab013 {
    public static void main(String[] args) {
        //variable_name (identifiers)-- rules we have to follow
        // identifiers can contain alphabets, Digits and two special characters ($ and _)
        // First character of an identifier should be an alphabet or ($,_)
        //Keywords or reserved words cant be used as identifiers
        //boolean 123= true; is wrong (digts cant be used as the first character of an identifier)
        //space is not allowed in identifier (Athira Thundiyil is wrong instead can use Athira_Thundiyil/Athira$Thundiyil/AthiraThundiyil

        boolean $= true;
        boolean _=true;
        boolean abc= true;
        boolean _123= true;
        boolean $123= true;

        System.out.println ($123);


    }
}
