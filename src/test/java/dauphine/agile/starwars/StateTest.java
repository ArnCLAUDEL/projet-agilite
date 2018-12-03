package dauphine.agile.starwars;

import static org.junit.Assert.*;

import org.junit.Test;

import dauphine.agile.starwars.Individu;
import dauphine.agile.starwars.Maitre;

public class StateTest {

	/**
	 * Test les états des individus
	 */

	@Test
	public void verificationComportementIndividu() {

		Individu coco = new Individu("coco", "coco", "republique");

		assertEquals(coco.faireDuSport(), "Sautille sur lui meme");
		assertEquals(coco.agir(), "ouvre les yeux et fais quelque chose");
		assertEquals(coco.sePreparer(), "ferme les yeux et souffle");

	}

	/**
	 * Ce test permet de vérifier que peut importe l'alignement du maître il fait du
	 * sport de la même façon
	 */

	@Test
	public void verificationComportementSportMaitre() {

		Maitre anakin = new Maitre("Skywalker", "Anakin", "Jedi");
		anakin.setKarma(5);
		assertEquals(anakin.faireDuSport(), "Fais un footing pour s'exercer");

		// Après quelques kills, il obtient un karma négatif
		anakin.setKarma(-5);
		assertEquals(anakin.faireDuSport(), "Fais un footing pour s'exercer");
		assertEquals(anakin.getFaction(), "Obscur");

	}

	/**
	 * Ce test permet de vérifier la façon d'agir d'un maître en fonction de son
	 * alignement
	 */

	@Test
	public void verificationComportementAgirMaitre() {

		Maitre anakin = new Maitre("Skywalker", "Anakin", "Jedi");
		anakin.setKarma(5);
		assertEquals(anakin.agir(), "utilise la meditation");

		// Après quelques kills, il obtient un karma négatif
		anakin.setKarma(-5);
		assertEquals(anakin.agir(), "lance d'eclairs tout autour de lui");
		assertEquals(anakin.getFaction(), "Obscur");

	}

	/**
	 * Ce test permet de vérifier la façon de se préparer d'un maître en fonction de
	 * son alignement
	 */

	@Test
	public void verificationComportementSepreparerMaitre() {

		Maitre anakin = new Maitre("Skywalker", "Anakin", "Jedi");
		anakin.setKarma(5);

		assertEquals(anakin.sePreparer(), "fais le vide dans son exprit");

		// Après quelques kills, il obtient un karma négatif
		anakin.setKarma(-5);
		assertEquals(anakin.sePreparer(), "fais les 100 pas comme Dark Maul");
		assertEquals(anakin.getFaction(), "Obscur");

	}

}
