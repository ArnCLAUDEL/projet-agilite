package dauphine.agile.fusion;

import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dauphine.agile.starwars.Maitre;

public class UserComportementAgirTest {

	private Maitre maitreGentil;
	private Maitre maitreMechant;
	private String msgMaitreGentil;
	private String msgMaitreMechant;

	@Given("^Un maitre bon$")
	public void un_maitre_bon() throws Exception {

		this.maitreGentil = new Maitre("Kenobi", "Obiwan", "Jedi");
	}

	@When("^Quand le maitre bon attaque$")
	public void quand_le_maitre_bon_attaque() throws Exception {
		this.msgMaitreGentil = this.maitreGentil.agir();
	}

	@Then("^Elle/il medite$")
	public void elle_il_medite() throws Exception {

		assertEquals(msgMaitreGentil, "utilise la meditation");
	}

	@Given("^Un maitre mauvais$")
	public void un_maitre_mauvais() throws Exception {

		this.maitreMechant = new Maitre("Skywalker", "Anakin", "Jedi");
		this.maitreMechant.setKarma(-5);
	}

	@When("^: Quand le maitre mauvais attaque$")
	public void quand_le_maitre_mauvais_attaque() throws Exception {
		this.msgMaitreMechant = this.maitreMechant.agir();

	}

	@Then("^Elle/il lance des eclairs$")
	public void elle_il_lance_des_eclairs() throws Exception {
		assertEquals(this.msgMaitreMechant, "lance d'eclairs tout autour de lui");

	}

}
