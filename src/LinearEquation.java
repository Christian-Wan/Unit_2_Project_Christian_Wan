public class LinearEquation {
    //Instance Variables
    private int xOne;
    private int yOne;
    private int xTwo;
    private int yTwo;
    private int xThree;


    //Constructor
    public LinearEquation(String coordinateOne, String coordinateTwo) {

    }
    //Methods
    public double slopeCalculate() {
        double slope = (yTwo - yOne) / (xTwo - xOne);
        return slope;
    }

    public double yInterceptCalculate() {
        double intercept = yOne - (slopeCalculate() * xOne);
        return intercept;
    }

    public String equationForm() {
        String equation =
    }
}
