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
	
	@Given("^a new rocket$")
	public void a_new_rocket() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		rocket = new Rocket(false);
		rocket.fill(30);
	}

	@Given("^a pilot in the rocket$")
	public void a_pilot_in_the_rocket() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		pilot = new Astronaut();
		rocket.enter(pilot);
	}

	@Then("^the rocket sticks to ground$")
	public void the_rocket_sticks_to_ground() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals("the rocket is moving but should not", 0, rocket.speed());
	}
	
	@Given("^a pilot in new rocket with escapePod$")
	public void a_pilot_in_new_rocket_with_escapePod() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    a_new_rocket();
	    a_pilot_in_the_rocket();
	    escapePod = new EscapePod();
	    rocket.setEscapePod(escapePod);
	}
	    
	@Given("^a pilot in new rocket without escapePod$")
	public void a_pilot_in_new_rocket_without_escapePod() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    a_new_rocket();
	    a_pilot_in_the_rocket();
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