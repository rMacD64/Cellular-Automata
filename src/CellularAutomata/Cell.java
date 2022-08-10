package CellularAutomata;

import java.util.ArrayList;
import java.util.Scanner;

public class Cell {
    // Creating instance variables: strength, id, x and y.
    // All of which take integer values.
    private int strength;
    private int id;
    private int x;
    private int y;

    public Cell(int strength, int id, int x, int y) {   // Creating the constructor
        this.strength = strength;
        this.id = id;
        this.x = x;
        this.y = y;
    }
    public Cell() {
        this(0,0,0,0);  // Setting the values of the default constructor to 0 for strength, id, x and y
    }

    public Cell(String[] args) {
        Scanner ScanObj = new Scanner(System.in);   // Create Scanner object


        System.out.println("Enter a positive value for strength: ");
        strength = ScanObj.nextInt(); // Reads user input (for integers only) and stores it in strength

        while (!setStrength(strength)) {    // Calls setStrength setter to see if user inputted a positive value
            System.out.println("Number most be positive. Strength: ");
            strength = ScanObj.nextInt();
        }


        System.out.println("Enter a value for x (must be higher than or equal to 0): ");
        x = ScanObj.nextInt(); // Reads user input (for integers only) and stores it in x

        while (setId_X_Y(x)) {    // Calls setId_X_Y setter to see if user inputted a value above or equal to 0
            System.out.println("Number most be higher or equal to 0. x-coordinate: ");
            x = ScanObj.nextInt();
        }


        System.out.println("Enter a value for y (must be higher than or equal to 0): ");
        y = ScanObj.nextInt(); // Reads user input (for integers only) and stores it in y

        while (setId_X_Y(y)) {    // Calls setId_X_Y setter to see if user inputted a value above or equal to 0
            System.out.println("Number most be higher or equal to 0. y-coordinate: ");
            y = ScanObj.nextInt();
        }


        System.out.println("Enter a value for Id (must be higher than or equal to 0): ");
        id = ScanObj.nextInt(); // Reads user input (for integers only) and stores it in id

        while (setId_X_Y(id)) {    // Calls setId_X_Y setter to see if user inputted a value above or equal to 0
            System.out.println("Number most be higher or equal to 0. y-coordinate: ");
            id = ScanObj.nextInt();
        }
    }

    public boolean setStrength (int strength) {
        return strength > 0;
    }

    public boolean setId_X_Y (int num) {
        return num < 0;
    }

    // Creating public method called interactNeighbors
    // Input: ArrayList<Cell> called neighbors
    // Output: Currently nothing
    public void interactNeighbors(ArrayList<Cell> neighbors) {

    }
}
