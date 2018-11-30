package dauphine.agile.space;

public class EscapePod {

	private IAstronaut pilot;

	public void eject() {
		System.out.println("escape pod ejected");
	}
	
	public IAstronaut getPilot() {
		return pilot;
	}

	public void setPilot(IAstronaut pilot) {
		this.pilot = pilot;
	}
	
}
