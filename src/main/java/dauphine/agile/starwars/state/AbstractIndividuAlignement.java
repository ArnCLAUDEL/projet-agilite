package dauphine.agile.starwars.state;

public abstract class AbstractIndividuAlignement {
	public abstract String sePreparer();

	public abstract String agir();

	public String faireDuSport() {
		 System.out.println("Fais un footing pour s'exercer");
		return "Fais un footing pour s'exercer";

	}
}
