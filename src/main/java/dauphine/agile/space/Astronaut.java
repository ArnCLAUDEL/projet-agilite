package dauphine.agile.space;

/**
 * Write a description of class Astronaut here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Astronaut
{
    // instance variables - replace the example below with your own
    private String state = "calm";

    public String state() {
        return state;
    }
    
    public void changeState(String newState) {
        this.state = newState;
    }
    
}
