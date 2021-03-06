package dauphine.agile.starwars;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StarWarsTest {

	@Test
	public void testGetterIndividu() {

		Individu anakin = new Individu("Skywalker", "Anakin", "Jedi");

		assertEquals("Jedi", anakin.getFaction());
		assertEquals("Skywalker", anakin.getNom());
		assertEquals("Anakin", anakin.getPrenom());

		// On change l'identit� D'Anakin car il part en mission top secret

		anakin.setPrenom("JarJar");
		anakin.setNom("Bins");
		anakin.setFaction("Secretaire");

		assertEquals("Secretaire", anakin.getFaction());
		assertEquals("Bins", anakin.getNom());
		assertEquals("JarJar", anakin.getPrenom());

	}

	@Test
	public void testGetterMaitre() {

		Maitre anakin = new Maitre("Skywalker", "Anakin", "Jedi");

		assertEquals("Jedi", anakin.getFaction());
		assertEquals("Skywalker", anakin.getNom());
		assertEquals("Anakin", anakin.getPrenom());

	}

	@Test
	public void testGetterPadawan() {

		Padawan ashoka = new Padawan("Tano", "Ashoka", "Jedi");

		assertEquals("Jedi", ashoka.getFaction());
		assertEquals("Tano", ashoka.getNom());
		assertEquals("Ashoka", ashoka.getPrenom());

	}

	@Test
	public void testAge() {

		Individu i = new Individu("Tano", "Ashoka", "Jedi");

		i.setAge(14);

		assertEquals(i.getAge(), 14);
	}

	@Test
	public void testListPadawanMaitre() {

		Maitre yoda = new Maitre("Yoda", "Yoda", "Jedi");

		Padawan toto = new Padawan("toto", "toto", "Jedi");
		Padawan coco = new Padawan("coco", "coco", "Jedi");

		coco.setMaitre(yoda);
		toto.setMaitre(yoda);

		assertEquals(2, yoda.getListPadawan().size());

		// On teste si dans la liste de padawan de Yoda y'a bien les deux padawan
		assertTrue(yoda.getListPadawan().contains(toto));
		assertTrue(yoda.getListPadawan().contains(coco));

		// ON teste si Yoda est bien le maitre

		assertEquals(yoda, coco.getMaitre());
		assertEquals(yoda, toto.getMaitre());
	}

	// On va tester si le nouveau maitre est bien different de l'ancien maitre. Pour
	// cela on a redefinir la m�thode equals de maitre

	@Test
	public void testIdentiteMaitre() {

		Maitre yoda = new Maitre("Yoda", "Yoda", "Jedi");
		Maitre yoda1 = new Maitre("Yoda", "Yidi", "Jedi");

		assertFalse(yoda.equals(yoda1));

		Maitre yodaClone = new Maitre("Yoda", "Yoda", "Jedi");
		assertTrue(yoda.equals(yodaClone));
		assertFalse(yoda.equals(null));
		assertFalse(yoda.equals(new Padawan("Yoda", "Yoda", "Jedi")));
	}

	// On rajoute un nouveau maitre
	@Test
	public void testAjoutMaitre() {
		Padawan toto = new Padawan("toto", "toto", "Jedi");
		Maitre yoda = new Maitre("Yoda", "Yoda", "Jedi");
		Maitre yoda1 = new Maitre("Yoda", "Yidi", "Jedi");
		toto.setMaitre(yoda);
		toto.setMaitre(yoda1);

		assertEquals(toto.getMaitre(), yoda1);
	}

	@Test
	public void someTest() {

		// assertThrows(IllegalArgumentException.class, () -> {
		// ;
		// });

		try {
			Individu i = new Individu("toto", "toto", "Jedi");
			i.setAge(-5);
			assertTrue("should have throws an IllegalArgumentException", false);
		} catch (Exception e) {
		}
	}

	/**
	 * Verifie si on peut mettre un même padawan dans la liste d'un même maitre
	 */
	@Test
	public void testDoublonPadawanListMaitre() {
		Maitre yoda = new Maitre("Yoda", "Yoda", "Jedi");

		Padawan toto = new Padawan("toto", "toto", "Jedi");
		Padawan coco = new Padawan("coco", "coco", "Jedi");
		Padawan coco2 = new Padawan("coco", "coco", "Jedi");

		coco.setMaitre(yoda);
		coco2.setMaitre(yoda);
		toto.setMaitre(yoda);

		assertEquals(2, yoda.getListPadawan().size());

	}

}