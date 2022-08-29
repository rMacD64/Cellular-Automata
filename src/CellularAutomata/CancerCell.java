package CellularAutomata;

import java.util.ArrayList;

public class CancerCell extends Cell {
    public CancerCell(int x, int y) {
        super(1, 3, x, y);
    }

    @Override
    public void interactNeighbors(ArrayList<Cell> neighbors) {
        //  Currently empty
    }
}
