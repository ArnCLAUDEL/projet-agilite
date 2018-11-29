package dauphine.agile.starwars.state;

public class IndividuAlignementObscur extends AbstractIndividuAlignement
{

    @Override
    public void sePreparer()
    {
        System.out.println("fais les 100 pas comme Dark Maul");
    }

    @Override
    public void agir()
    {
        System.out.println("lance d'eclairs tout autour de lui");
    }

}
