package technology;

public class SmartPhone extends Computer{
    private String manufacturer = "Apple";

    public String isIPhone(String manufacturer){
        boolean isApple = false;
        if (manufacturer.toLowerCase().equals("apple")){
            isApple = true;
        }
        if (isApple) {
            return "This is an iPhone.";
        }else{
            return "This is not an iPhone.";
        }
    }

}
