package sept.ex_23092024;

public class Lab072_Swith_realusecase {
    public static void main(String[] args) {
        //Web browser
        //user will give the browser name to run the code
        //chrome -> execute chrome
        //firefox -> execute firefox
        //edge -> execute edge

        String browser = "chrome";

        switch (browser) {
            case "chrome":
                ;
                System.out.println("Starting the chrome browser");
                //further code to start the chrome
                //Webdriver driver= new chrome();// selenium code
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                //Further code to start the firefox
                //Webdriver driver=new firfox(); //selenium code
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
