public class LinearEquation {
    //Instance Variables
    private int xOne; //(Will store the value of the first x value)
    private int yOne; //(Will store the value of the first y value)
    private int xTwo; //(Will store the value of the second x value)
    private int yTwo; //(Will store the value of the second y value)


    //Constructor
    public LinearEquation(String coordinateOne, String coordinateTwo) { //(stores coordinates to instance variables)
        String firstX = coordinateOne.substring(1, coordinateOne.indexOf(","));
        String firstY = coordinateOne.substring(coordinateOne.indexOf(",") + 1, coordinateOne.length() - 1);
        String secondX = coordinateTwo.substring(1, coordinateTwo.indexOf(","));
        String secondY = coordinateTwo.substring(coordinateTwo.indexOf(",") + 1, coordinateTwo.length() - 1);
        xOne = Integer.parseInt(firstX);
        yOne = Integer.parseInt(firstY);
        xTwo = Integer.parseInt(secondX);
        yTwo = Integer.parseInt(secondY);
    }
    //Methods
    public double slopeCalculate() { //(Will find the slope of the line)
        double slope = Math.round((((double) yTwo - yOne) / (xTwo - xOne)) * 100.00) / 100.00;
        return slope;
    }

    public double yInterceptCalculate() { //(Will find the y-intercept of the line)
        double intercept = Math.round((yOne - (slopeCalculate() * xOne)) * 100.00) / 100.00;
        return intercept;
    }

    public String equationForm() { //(Will find the slope intercept form)
        String equation = "y = " + (yTwo - yOne) + "/" + (xTwo - xOne) + "x + " + yInterceptCalculate();
        return equation;
    }

    public double distanceCalculate() { //(Finds the distance between the two points)
        double distance = Math.round(Math.sqrt(Math.pow(((double) xTwo - xOne), 2) + Math.pow(((double) yTwo - yOne), 2)) * 100.00) / 100.00;
        return distance;
    }

    public String solvePoint(int xThree) { //(Will find the coordinate point of specified x value)
        String coordinate = "(" + (double) xThree + ", " + (xThree * slopeCalculate() + yInterceptCalculate()) + ")";
        return coordinate;
    }

    public String toString() { //(Will return both coordinate pairs, slope, y-intercept, slope intercept form, difference between points)
        String result = "First pair: (" + xOne + "," + yOne + ")" +
                      "\nSecond pair: (" + xTwo + "," + yTwo + ")" +
                      "\nSlope of line: " + slopeCalculate() +
                      "\nY-intercept: " + yInterceptCalculate() +
                      "\nSlope intercept form: " + equationForm() +
                      "\nDistance between points: " + distanceCalculate();
        return result;
    }
}
