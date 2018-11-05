package dauphine.agile.space;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RocketDefs {
	
	private Rocket rocket;
	private Astronaut pilot;
	private EscapePod escapePod;
	private Engine engine;
	private int remainingVomitBagsBeforeTakeOff;
	
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
	
	@Given("^a pilot in a rocket$")
	public void a_pilot_in_a_rocket() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rocket = new Rocket();
	    pilot = new Astronaut();
	    rocket.enter(pilot);
	    escapePod = new EscapePod();
	    rocket.setEscapePod(escapePod);
	    rocket.fill(15);
	}

	@When("^the rocket takes off$")
	public void the_rocket_takes_off() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rocket.takeOff();
	    remainingVomitBagsBeforeTakeOff = rocket.getRemainingVomitBags();
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
	
	@Then("^the pilot is sick$")
	public void the_pilot_is_sick() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals("the pilot is not sick", "sick", pilot.state());
	}

	@Then("^the pilot uses a vomit bag$")
	public void the_pilot_uses_a_vomit_bag() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals("the pilot did not used the vomit bag", Math.max(remainingVomitBagsBeforeTakeOff - 1, 0), rocket.getRemainingVomitBags());
	}

	@Then("^the cockpit remains clean$")
	public void the_cockpit_remains_clean() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals("the cockpit is dirty", "clean", rocket.getCockpitState());
	}
	
	@Given("^a dirty engine in a rocket$")
	public void a_dirty_engine_in_a_rocket() throws Exception {
	    rocket = new Rocket();
	    Astronaut pilot = new Astronaut();
	    rocket.enter(pilot);
	    engine = new Engine();
	    rocket.addEngine(engine);
	    engine.setState("dirty");
	}

	@When("^an engineer cleans the engine$")
	public void an_engineer_cleans_the_engine() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		rocket.cleanEngine(0);
	}

	@Then("^the rocket no longer have the engine$")
	public void the_rocket_no_longer_have_the_engine() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertFalse("the rocket still has the engine", rocket.engines().contains(engine));
	}

	@Then("^the engine is clean$")
	public void the_engine_is_clean() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals("the engine is not clean after cleaning", "clean", engine.getState());
	}
	
}