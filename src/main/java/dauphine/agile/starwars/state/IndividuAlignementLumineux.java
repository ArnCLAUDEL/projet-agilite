package dauphine.agile.starwars.state;

public class IndividuAlignementLumineux extends AbstractIndividuAlignement {

	@Override
	public String sePreparer() {
		 System.out.println("fais le vide dans son exprit");
		return "fais le vide dans son exprit";

	}

	@Override
	public String agir() {
		 System.out.println("utilise la meditation");
		return "utilise la meditation";
	}

}
