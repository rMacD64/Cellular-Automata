package CellularAutomata;

import java.util.ArrayList;

public class Cell {
    // Creating instance variables: strength, id, x and y.
    // All of which take integer values.
    private int strength;
    private int id;
    private int x;
    private int y;

    public Cell(int strength, int id, int x, int y) {   // Creating the constructor
        // Calling setter methods
        setStrength(strength);
        setId(id);
        setX(x);
        setY(y);

    }
    public Cell() {
        this(0,0,0,0);  // Setting the values of the default constructor to 0 for strength, id, x and y
    }

    public void setStrength (int strength) {  // Setter for strength
        // If the strength value given is not appropriate, the default value is selected
        this.strength = Math.max(strength, 0);
    }

    public void setId (int id) {  // Setter for id
        // If the id value given is not appropriate, the default value is selected
        this.id = Math.max(id, 0);
    }

    public void setX (int x) {  // Setter for x-coordinate
        // If the x value given is not appropriate, the default value is selected
        this.x = Math.max(x, 0);
    }

    public void setY (int y) {  // Setter for y-coordinate
        // If the y value given is not appropriate, the default value is selected
        this.y = Math.max(y, 0);
    }

    public int getStrength() {  // Getter for strength
        return this.strength;
    }

    public int getId() {  // Getter for id
        return this.id;
    }

    public int getX() {  // Getter for x-coordinate
        return this.x;
    }

    public int getY() {  // Getter for y-coordinate
        return this.y;
    }

    // Creating public method called interactNeighbors
    // Input: ArrayList<Cell> called neighbors
    // Output: Currently nothing
    public void interactNeighbors(ArrayList<Cell> neighbors) {

    }
}