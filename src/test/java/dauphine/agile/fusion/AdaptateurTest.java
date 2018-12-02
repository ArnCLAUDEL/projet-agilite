package dauphine.agile.fusion;

import static org.junit.Assert.*;

import org.junit.Test;

import dauphine.agile.space.IAstronaut;
import dauphine.agile.space.Rocket;
import dauphine.agile.starwars.Maitre;

public class AdaptateurTest {

	@Test
	public void insertionMaitreAvecCertificat() {

		try {

			Maitre yoda = new Maitre("Yoda", "Yoda", "Jedi");
			// Yoda passe la formation
			CentreDeCertification.delivrer(yoda);

			Rocket xwing = new Rocket();

			IAstronaut yodaAstronaut = CentreDeCertification.delivrer(yoda);

			xwing.enter(yodaAstronaut);
			
			
			
			

		} catch (IllegalArgumentException e) {

			assertTrue(false);
		}

	}

}
