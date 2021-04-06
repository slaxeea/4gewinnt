package viergewinnt;

/**
 *
 * @author kappe
 */
public class XTurn implements State{

    @Override
    public void changeState(Logic context) {
        context.setState(new OTurn());
    }

    @Override
    public char getSymbol() {
        return 'x';
    }    
}
