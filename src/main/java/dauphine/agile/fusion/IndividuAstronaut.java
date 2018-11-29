package dauphine.agile.fusion;

import dauphine.agile.space.IAstronaut;
import dauphine.agile.space.Rocket;
import dauphine.agile.starwars.IIndividu;

public class IndividuAstronaut implements IAstronaut
{

    private final IIndividu individu;

    public IndividuAstronaut(IIndividu individu) {
        super();
        this.individu = individu;
    }

    @Override
    public void piloter(Rocket rocket)
    {
        individu.sePreparer();
        individu.agir();
    }

}
