package dauphine.agile.starwars.state;

public abstract class AbstractIndividuAlignement
{
    public abstract void sePreparer();
    
    public abstract void agir();
    
    public void faireDuSport()
    {
        System.out.println("Fais un footing pour s'exercer");
    }
}
