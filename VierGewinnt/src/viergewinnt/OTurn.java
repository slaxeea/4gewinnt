package viergewinnt;

/**
 *
 * @author kappe
 */
public class OTurn implements State{

    @Override
    public void changeState(Logic context) {
        context.setState(new XTurn());
    }
    
    @Override
    public char getSymbol() {
        return 'o';
    }
}
