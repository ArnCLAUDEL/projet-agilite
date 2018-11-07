package dauphine.agile.space;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a description of class Rocket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rocket
{
    // instance variables - replace the example below with your own
    private int fuel = 0;
    private int speed = 0;
    private List<Engine> engines;
    private EscapePod escapePod;
    private Astronaut pilot;
    
    /**
     * Constructor for objects of class Rocket
     */
    public Rocket()
    {
        this(true);
    }
    
    public Rocket(boolean withEscapePod) {
    	engines = new ArrayList<>();
    	if(withEscapePod) {
    		escapePod = new EscapePod();
    	}
    }

    public void addEngine(Engine engine) {
    	if(alreadyHas(engine)) {
    		return;
    	} else if (engine.getRocket() != null) {
    		engine.getRocket().removeEngine(engine);
    	}
    	engines.add(engine);
    	engine.setRocket(this);
    }

    public void removeEngine(Engine engine) {
    	if(alreadyHas(engine)) {
    		engines.remove(engine);
    		engine.setRocket(null);
    	}
    }

	private boolean alreadyHas(Engine engine) {
		return engine.getRocket() == this;
	}
    
    public List<Engine> engines() {
    	return Collections.unmodifiableList(engines);
    }
    
    public Astronaut pilot() {
        return pilot;
    }
    
    public void enter(Astronaut pilot) {
        this.pilot = pilot;
    }
    
    public int fuel() {
        return fuel;
    }
    
    public int speed() {
        return speed;
    }
    
    public void fill(int fuel) {
        this.fuel += fuel;
    }
    
    public void takeOff() {
        if(fuel < 10 || pilot == null || escapePod == null) {
            return;
        }
        fuel -= 10;
        speed +=10;
        pilot.changeState("sick");        
    }

    public void emmergencyProtocol() {
    	eject();
    }
    
    public void eject() {
    	if(escapePod != null) {
    		escapePod.setPilot(pilot);
    		escapePod.eject();
    		escapePod = null;
    	} else {
    		throw new RuntimeException("no escape pod ..");
    	}
    }
    
	public EscapePod getEscapePod() {
		return escapePod;
	}

	public void setEscapePod(EscapePod escapePod) {
		this.escapePod = escapePod;
	}

}
