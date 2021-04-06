package viergewinnt;

/**
 *
 * @author kappe
 */
public interface State {
    public void changeState(Logic context);
    public char getSymbol();
}
