package viergewinnt;

/**
 *
 * @author kappe
 */
public class Starter {

    public static void main(String[] args) throws Exception {
        Logic l = new Logic();
        l.setMode(new MultiplayerMode(l));
        l.loop();
    }
    
}
