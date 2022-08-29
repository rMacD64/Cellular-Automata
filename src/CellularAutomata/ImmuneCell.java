package CellularAutomata;

import java.util.ArrayList;

public class ImmuneCell extends Cell {
    public ImmuneCell(int x, int y) {
        super(3, 4, x, y);  // Check with Sogand if this is correct.
    }

    @Override
    public void interactNeighbors(ArrayList<Cell> neighbors) {
        //  Currently empty
    }
}
