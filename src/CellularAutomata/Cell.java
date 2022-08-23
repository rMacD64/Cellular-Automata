package CellularAutomata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Cell {
    // Creating instance variables: strength, id, x and y.
    // All of which take integer values.
    private int strength;
    private int id;
    private int x;
    private int y;

    // Creating a HashMap instance variable to contain the concentration of various chemicals in a cell
    private HashMap<String, Integer> chemical_concentration;
    private Set<String> signal_molecules;

    public Cell(int strength, int id, int x, int y) {   // Creating the constructor
        // Calling setter methods
        setStrength(strength);
        setId(id);
        setX(x);
        setY(y);

        chemical_concentration = new HashMap<>();    // Constructing the HashMap
        setChemicalConcentration(); // Default constructor for the HashMap

        signal_molecules = new HashSet<>();
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

    // Should the following method be static?
    public void setChemicalConcentration () {   // Sets the list of chemicals all with the default value of 0
        chemical_concentration.put("Lactate", 0);
        chemical_concentration.put("ATP", 0);
        chemical_concentration.put("Glucose", 0);
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

    public int getChemicalConcentration (String chemical) {  // Method which returns the concentration
                                                             // of an inputted chemical
        return chemical_concentration.get(chemical);
    }

    public void replaceChemicalConcentration (String chemical, int concentration) { // Method which replaces a
                                                                                    // concentration for a different one
        chemical_concentration.replace(chemical, concentration);
    }

    public void addSignal (String signal) {     // Method which adds a signal to the HashSet.
                                                // Declaring the signal molecule is present and therefore ON.
        signal_molecules.add(signal);
    }

    public void removeSignal (String signal) {  // Method which deletes a signal from the HashSet.
                                                // Declaring the signal is OFF.
        signal_molecules.remove(signal);
    }

    public void printSignals () {
        for (String item : signal_molecules) {
            System.out.println(item);
        }
    }

    // Creating public method called interactNeighbors
    // Input: ArrayList<Cell> called neighbors
    // Output: Currently nothing
    public void interactNeighbors(ArrayList<Cell> neighbors) {
        if (TooManyNeighbors(neighbors) == 0) {
            System.out.println("Die!");
        }
        else if (TooManyNeighbors(neighbors) == 1) {
            System.out.println("Move!");
        }
        else {
            System.out.println("Do nothing.");
        }
    }

    private int TooManyNeighbors(ArrayList<Cell> neighbors) {
        int response = 2;
        if (neighbors.size() == 8) {    // There are 8 eight neighbors.
                                        // There is no space for the cell to move, so it should die.
            response = 0;   // 0 tells interactNeighbors that the cell should die.
        }
        else if (neighbors.size() >= 6) {   // There are less than 8 neighbors, but more than 6 neighbors,
                                            // so the cell should move.
            response = 1;   // 1 tells interactNeighbors that the cell should move.
        }

        return response;    // If neither of the previous conditions are met, response remains at 2, which indicates
                            // to interactNeighbors that nothing should happen.
    }
}