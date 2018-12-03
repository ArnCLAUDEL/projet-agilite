package dauphine.agile.fusion;

import static org.junit.Assert.*;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dauphine.agile.fusion.CentreDeCertification;
import dauphine.agile.fusion.IndividuAstronautAdapter;
import dauphine.agile.space.Rocket;
import dauphine.agile.starwars.Maitre;
import dauphine.agile.starwars.Padawan;

public class UserAdaptateurTest {

	private Maitre maitre;
	private Padawan padawan;
	private IndividuAstronautAdapter maitreAstronaut;
	private IndividuAstronautAdapter padawanAstronaut;

	@Given("^Un maitre$")
	public void un_maitre() throws Exception {

		this.maitre = new Maitre("Skywaler", "Anakin", "Jedi");

	}

	@When("^Après sa formation au sein de la NASA$")
	public void après_sa_formation_au_sein_de_la_NASA() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		this.maitreAstronaut = (IndividuAstronautAdapter) CentreDeCertification.delivrer(this.maitre);
	}

	@Then("^Le maitre peut conduire le vaisseau spatial$")
	public void le_maitre_peut_conduire_le_vaisseau_spatial() {

		Rocket xwing = new Rocket();

		/**
		 * test l'état de yodaAstronaut
		 */
		xwing.enter(this.maitreAstronaut);
		this.maitreAstronaut.piloter(xwing);
		assertEquals("calm", this.maitreAstronaut.state());
		Assert.assertNotNull(xwing.pilot());
	}

	@Given("^Un padawan$")
	public void un_padawan() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		this.padawan = new Padawan("Tano", "Ashoka", "Jedi");
	}

	@When("^Après sa formation padawan au sein de la NASA$")
	public void après_sa_formation_padawan_au_sein_de_la_NASA() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		this.padawanAstronaut = (IndividuAstronautAdapter) CentreDeCertification.delivrer(this.padawan);
	}

	@Then("^Le padawan peut conduire le vaisseau spatial$")
	public void le_padawan_peut_conduire_le_vaisseau_spatial() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Rocket xwing = new Rocket();

		/**
		 * test l'état de Ashoka astronaute
		 */
		xwing.enter(this.padawanAstronaut);
		this.padawanAstronaut.piloter(xwing);
		assertEquals("calm", this.padawanAstronaut.state());
		Assert.assertNotNull(xwing.pilot());

	}

}
