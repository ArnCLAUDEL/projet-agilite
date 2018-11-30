package dauphine.agile.fusion;

import dauphine.agile.space.IAstronaut;
import dauphine.agile.starwars.IIndividu;

public class CentreDeCertification
{
    public static IAstronaut delivrer(IIndividu individu)
    {
        return new IndividuAstronautAdapter(individu);
    }
}
