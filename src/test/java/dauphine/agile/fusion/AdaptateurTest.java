package dauphine.agile.fusion;

import static org.junit.Assert.*;

import org.junit.Test;

import dauphine.agile.space.Astronaut;
import dauphine.agile.space.EscapePod;
import dauphine.agile.space.IAstronaut;
import dauphine.agile.space.Rocket;
import dauphine.agile.starwars.Maitre;
import dauphine.agile.starwars.Padawan;

public class AdaptateurTest {

	@Test
	public void insertionMaitreAvecCertificat() {

		Maitre yoda = new Maitre("Yoda", "Yoda", "Jedi");

		// Yoda passe la formation
		CentreDeCertification.delivrer(yoda);
		Rocket xwing = new Rocket();
		IAstronaut yodaAstronaut = CentreDeCertification.delivrer(yoda);

		/**
		 * test l'état de yodaAstronaut
		 */
		EscapePod escapePod = new EscapePod();
		xwing.enter(yodaAstronaut);
		xwing.setEscapePod(escapePod);
		yodaAstronaut.piloter(xwing);
		assertEquals("calm", yodaAstronaut.state());

	}

	@Test
	public void insertionPadawanAvecCertificat() {

		Padawan ashoka = new Padawan("Thano", "ashoka", "Jedi");

		// Yoda passe la formation
		CentreDeCertification.delivrer(ashoka);
		Rocket xwing = new Rocket();
		IAstronaut yodaAstronaut = CentreDeCertification.delivrer(ashoka);

		/**
		 * test l'état de yodaAstronaut
		 */
		EscapePod escapePod = new EscapePod();
		xwing.enter(yodaAstronaut);
		xwing.setEscapePod(escapePod);
		yodaAstronaut.piloter(xwing);
		assertEquals("calm", yodaAstronaut.state());

	}
}