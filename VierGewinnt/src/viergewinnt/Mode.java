package viergewinnt;

import java.util.ArrayList;

/**
 *
 * @author kappe
 */
public abstract class Mode {

    private Logic logic;
    private ArrayList<Chip> chips = new ArrayList<>();

    public void writeBoard() {
        chips = logic.getChips();
        for (int y = 0; y < 6; y++) {
            System.out.print("|");
            for (int x = 0; x < 6; x++) {
                if (logic.isChipThere(x, y)) {
                    System.out.print(logic.getChipOnPos(x, y).getSymbol());
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("|");
        }
    }

    public abstract void askNewPos(char symbol);
}
