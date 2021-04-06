package viergewinnt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author kappe
 */
public class MultiplayerMode extends Mode {

    private final Logic logic;
    private ArrayList<Chip> chips = new ArrayList<>();

    public MultiplayerMode(Logic l) {
        logic = l;
    }

    public Chip getNewChip() throws Exception {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int posX = Integer.parseInt(obj.readLine());
        return new Chip(posX, logic.getBottom(posX), logic.getState().getSymbol());
    }

    public void askNewPos(char symbol) {
        System.out.println("WHERE DO YOU WANNA PUT UR THING");
        try {
            chips.add(getNewChip());
        } catch (Exception ex) {
        }
        logic.setChips(chips);
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

}
