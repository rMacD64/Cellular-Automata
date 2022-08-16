package CellularAutomata;

public class Main {
    public static void main(String[] args) {
        Cell RachelCell = new Cell();
        System.out.println(RachelCell.getStrength());
        System.out.println(RachelCell.getId());
        System.out.println(RachelCell.getX());
        System.out.println(RachelCell.getY());

        RachelCell.setX(-9);
        RachelCell.setY(4);
        System.out.println(RachelCell.getX());
        System.out.println(RachelCell.getY());

        Cell OtherCell = new Cell(7, -1, -1, -1);
        System.out.println(OtherCell.getStrength());
        System.out.println(OtherCell.getId());
        System.out.println(OtherCell.getX());
        System.out.println(OtherCell.getY());
    }
}

