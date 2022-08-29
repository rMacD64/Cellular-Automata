package CellularAutomata;

import java.util.ArrayList;

public class TissueCell extends Cell {
    public TissueCell(int x, int y) {
        super(0, 1, x, y);
    }

    @Override
    public void interactNeighbors(ArrayList<Cell> neighbors) {
        //  Currently empty
    }
}
