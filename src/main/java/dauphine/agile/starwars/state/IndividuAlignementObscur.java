package dauphine.agile.starwars.state;

public class IndividuAlignementObscur extends AbstractIndividuAlignement {

	@Override
	public String sePreparer() {
		 System.out.println("fais les 100 pas comme Dark Maul");
		return "fais les 100 pas comme Dark Maul";
	}

	@Override
    public String agir()
    {
        System.out.println("lance d'eclairs tout autour de lui");
        return "lance d'eclairs tout autour de lui";
    }

}
