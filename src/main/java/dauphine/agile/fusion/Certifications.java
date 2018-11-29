package dauphine.agile.fusion;

import dauphine.agile.space.IAstronaut;
import dauphine.agile.starwars.IIndividu;

public class Certifications
{

    public static IAstronaut certifier(IIndividu individu)
    {
        return new IndividuAstronaut(individu);
    }

}
