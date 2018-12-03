package dauphine.agile.starwars;

import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dauphine.agile.starwars.Maitre;
import dauphine.agile.starwars.state.IndividuAlignementLumineux;
import dauphine.agile.starwars.state.IndividuAlignementObscur;

public class UserAlignementTest {

	private Maitre maitreA;
	private Maitre maitreAbis;
	private Maitre maitreB;

	@Given("^Un maitre A$")
	public void un_maitre_A() throws Exception {

		this.maitreA = new Maitre("Kenobi", "Obiwan", "Jedi");
		this.maitreAbis = new Maitre("Kun", "Plo", "Jedi");
	}

	@When("^a sa creation ou si son karma est supérieur a O$")
	public void a_sa_creation_ou_si_son_karma_est_supérieur_a_O() throws Exception {

		this.maitreA.setKarma(1);

	}

	@Then("^Il/elle est un membre de la force$")
	public void il_elle_est_un_membre_de_la_force() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		assertEquals(this.maitreA.getAlignement().getClass(), IndividuAlignementLumineux.class);
		assertEquals(this.maitreAbis.getAlignement().getClass(), IndividuAlignementLumineux.class);

	}

	@Given("^Un maitre B$")
	public void un_maitre_B() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		this.maitreB = new Maitre("Skywalker", "Anakin", "Obscur");
	}

	@When("^: si son karma est inférieur à (\\d+)$")
	public void si_son_karma_est_inférieur_à(int arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		this.maitreB.setKarma(-4);

	}

	@Then("^il/elle est un membre du côté obscur$")
	public void il_elle_est_un_membre_du_côté_obscur() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(this.maitreB.getAlignement().getClass(), IndividuAlignementObscur.class);
		assertEquals(this.maitreB.getFaction(), "Obscur");

	}

}
