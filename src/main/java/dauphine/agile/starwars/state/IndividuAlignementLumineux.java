package dauphine.agile.starwars.state;

public class IndividuAlignementLumineux extends AbstractIndividuAlignement
{

    @Override
    public void sePreparer()
    {
        System.out.println("fais le vide dans son exprit");
    }

    @Override
    public void agir()
    {
        System.out.println("utilise la meditation");
    }

}
