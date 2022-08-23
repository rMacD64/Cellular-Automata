package CellularAutomata;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cell RachelCell = new Cell();
        System.out.println(RachelCell.getStrength());
        System.out.println(RachelCell.getId());
        System.out.println(RachelCell.getX());
        System.out.println(RachelCell.getY());

        System.out.println(RachelCell.getChemicalConcentration("ATP"));
        RachelCell.replaceChemicalConcentration("ATP", 3);
        System.out.println(RachelCell.getChemicalConcentration("ATP"));

        RachelCell.addSignal("Estrogen");
        RachelCell.addSignal("Testosterone");
        RachelCell.printSignals();
        RachelCell.removeSignal("Estrogen");
        RachelCell.printSignals();

        ArrayList<Cell> thing = new ArrayList<Cell>();
        thing.add(new Cell());
        thing.add(new Cell(1,1,1,1));
        thing.add(new Cell(1,1,1,2));
        thing.add(new Cell(1,1,1,1));
        thing.add(new Cell(1,1,1,3));
        thing.add(new Cell(1,1,1,1));
        thing.add(new Cell(1,1,1,1));
        thing.add(new Cell(1,1,1,1));
        RachelCell.interactNeighbors(thing);

    }
}

