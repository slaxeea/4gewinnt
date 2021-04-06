package viergewinnt;

import java.util.ArrayList;

/**
 *
 * @author kappe
 */
public class Logic {

    private MultiplayerMode ui = new MultiplayerMode(this);

    private ArrayList<Chip> chips = new ArrayList<>();
    private State state = new XTurn();
    private boolean won = false;
    private Mode mode;

   
    public void setState(State state) {
        this.state = state;
    }

    public void loop() throws Exception {
        while (!didWin(state.getSymbol())) {
            mode.writeBoard();
            mode.askNewPos(state.getSymbol());
            state.changeState(this);
        }
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
    
    public State getState() {
        return state;
    }

    public int getBottom(int posX) {
        return 5 - amountChipsOnY(posX);
    }

    public ArrayList<Chip> getChips() {
        return chips;
    }

    public boolean didWin(char symbol) {
        int anzInRow = 0;
        int anzInLine = 0;

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                for (int i = 0; i < 6; i++) {
                    anzInRow = getChipOnPos(i, y) != null ? anzInRow++ : anzInRow;
                }
                for (int i = 0; i < 6; i++) {
                    anzInLine = getChipOnPos(x, i) != null ? anzInLine++ : anzInLine;
                }
            }
        }
        return false;
    }

    public void setChips(ArrayList<Chip> chips) {
        this.chips = chips;
    }

    public boolean isChipThere(int posX, int posY) {
        for (Chip c : chips) {
            if (c.getPosX() == posX && c.getPosY() == posY) {
                return true;
            }
        }
        return false;
    }

    public Chip getChipOnPos(int posX, int posY) {
        for (Chip c : chips) {
            if (c.getPosX() == posX && c.getPosY() == posY) {
                return c;
            }
        }
        return null;
    }

    public int amountChipsOnY(int posX) {
        int rtn = 0;
        for (Chip c : chips) {
            if (c.getPosX() == posX) {
                rtn++;
            }
        }
        return rtn;
    }
}
