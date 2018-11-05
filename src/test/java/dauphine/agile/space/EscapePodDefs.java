package dauphine.agile.space;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class EscapePodDefs {
	
	private Rocket rocket;
	private Astronaut pilot;
	private EscapePod escapePod;
	
	@Given("^a pilot in a rocket$")
	public void a_pilot_in_a_rocket() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rocket = new Rocket();
	    rocket.enter(pilot);
	    escapePod = new EscapePod();
	    rocket.setEscapePod(escapePod);
	}

	@When("^the rocket takes off$")
	public void the_rocket_takes_off() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rocket.takeOff();
	}

	@When("^a problem occurs$")
	public void a_problem_occurs() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rocket.emmergencyProtocol();
	} 

	@Then("^the escape pod is ejected$")
	public void the_escape_pod_is_ejected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertNull("the escape pod is still attached to the rocket", rocket.getEscapePod());
	}

	@Then("^the pilot is inside the escape pod$")
	public void the_pilot_is_inside_the_escape_pod() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
    	assertEquals("the pilot is not in the escape pod", pilot,escapePod.getPilot());
	}
	
}