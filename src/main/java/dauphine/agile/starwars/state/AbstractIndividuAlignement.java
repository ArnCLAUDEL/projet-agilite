package dauphine.agile.starwars.state;

import dauphine.agile.starwars.IIndividu;

public abstract class AbstractIndividuAlignement implements IIndividu
{

    @Override
    public void faireDuSport()
    {
        System.out.println("Fais un footing pour s'exercer");
    }

}
