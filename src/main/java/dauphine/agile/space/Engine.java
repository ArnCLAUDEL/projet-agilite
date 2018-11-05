package dauphine.agile.space;

public class Engine {

	private Rocket rocket;
	private String state = "clean";

	public Rocket getRocket() {
		return rocket;
	}

	public void setRocket(final Rocket rocket) {
		this.rocket = rocket;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
