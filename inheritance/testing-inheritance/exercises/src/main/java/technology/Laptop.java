package technology;

public class Laptop extends Computer {
    private boolean isLight = false;
    private int weight = 3;

    public String weightCheck(int weight, boolean isLight){
        if (weight <= 5){
            isLight = true;
        }
        if (isLight) {
            return "This is a light laptop";
        } else {
            return "This will be a little heavy to carry";
        }
    }
}
