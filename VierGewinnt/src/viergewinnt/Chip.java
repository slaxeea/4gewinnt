package viergewinnt;

/**
 *
 * @author kappe
 */
public class Chip {

    private final int posX;
    private int posY;
    private char symbol;

    public Chip(int posX, int posY, char symbol) {
        this.posX = posX;
        this.posY = posY;
        this.symbol = symbol;
    }

    public void setPosY(int pos) {
        posY = pos;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
