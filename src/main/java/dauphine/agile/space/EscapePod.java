package dauphine.agile.space;

public class EscapePod {

	private Astronaut pilot;

	public void eject() {
		System.out.println("escape pod ejected");
	}
	
	public Astronaut getPilot() {
		return pilot;
	}

	public void setPilot(Astronaut pilot) {
		this.pilot = pilot;
	}
	
}
