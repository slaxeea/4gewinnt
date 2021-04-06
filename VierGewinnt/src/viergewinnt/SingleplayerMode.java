package viergewinnt;

import java.util.ArrayList;

/**
 *
 * @author kappe
 */
public class SingleplayerMode extends Mode {

    private final Logic logic;
    private ArrayList<Chip> chips = new ArrayList<>();

    public SingleplayerMode(Logic l) {
        logic = l;
    }

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

    public void askNewPos(char symbol) {
        
    }

}
