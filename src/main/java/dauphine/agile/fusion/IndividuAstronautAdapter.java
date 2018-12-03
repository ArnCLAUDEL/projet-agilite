package dauphine.agile.fusion;

import dauphine.agile.space.IAstronaut;
import dauphine.agile.space.Rocket;
import dauphine.agile.starwars.IIndividu;

public class IndividuAstronautAdapter implements IAstronaut
{

    private final IIndividu individu;
    private String state = "calm";

    public IndividuAstronautAdapter(IIndividu individu) {
        super();
        this.individu = individu;
    }

    @Override
    public void piloter(Rocket rocket)
    {
        individu.sePreparer();
        individu.agir();
        rocket.takeOff();
    }
    
    @Override
    public String state() {
        return state;
    }
    
    @Override
    public void changeState(String newState) {
        if("sick".equals(newState)) {
        	System.out.println("un individu utilisateur de la force n'est jamais malade !");
        } else {
    	this.state = newState;
        }
    }
    
}
