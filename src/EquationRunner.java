import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        //makes scanner
        Scanner s = new Scanner(System.in);

        //variables
        String coordinateOne; //(will store the first coordinate pair given by the user)
        String coordinateTwo; //(will store the second coordinate pair given by the user)
        int xThree; //(will store the x coordinate given by the user)


        System.out.println("Welcome to the linear equation calculator" + //gives welcome and instructions
                         "\nPlease type out coordinates as (x,y)" +
                         "\nPlease only use integers");
        //Gets user input for coordinates
        System.out.print("What is your first coordinate: ");
        coordinateOne = s.nextLine();
        System.out.print("What is your second coordinate: ");
        coordinateTwo = s.nextLine();

        //creates object and prints out info
        LinearEquation line = new LinearEquation(coordinateOne, coordinateTwo);
        System.out.println(line);

        //Gets third x
        System.out.print("Enter a third x-value: ");
        xThree = Integer.parseInt(s.nextLine());

        //print out the third coordinate pair
        System.out.println("Solved coordinate point is: " + line.solvePoint(xThree));
    }
}
