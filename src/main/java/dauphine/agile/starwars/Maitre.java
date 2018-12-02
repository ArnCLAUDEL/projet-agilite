package dauphine.agile.starwars;

import java.util.ArrayList;
import java.util.List;

import dauphine.agile.starwars.state.AbstractIndividuAlignement;
import dauphine.agile.starwars.state.IndividuAlignementLumineux;
import dauphine.agile.starwars.state.IndividuAlignementObscur;

public class Maitre extends Individu {

	private AbstractIndividuAlignement alignement;
	private int karma = 0;

	public Maitre(String nom, String prenom, String faction) {
		super(nom, prenom, faction);
		alignement = new IndividuAlignementLumineux();
	}

	public int getKarma() {
		return karma;
	}

	public synchronized void setKarma(int karma) {
		this.karma = karma;
		if (karma < 0) {
			alignement = new IndividuAlignementObscur();
			this.setFaction("Obscur");
		} else {
			alignement = new IndividuAlignementLumineux();
			this.setFaction("Jedi");
		}
	}

	@Override
	public String agir() {
		return alignement.agir();
	}

	@Override
	public String faireDuSport() {
		return alignement.faireDuSport();
	}

	@Override
	public String sePreparer() {
		return alignement.sePreparer();
	}

	private List<Padawan> listPadawan = new ArrayList<Padawan>();

	public List<Padawan> getListPadawan() {
		return listPadawan;
	}

	// Red�finir les �quals

	@Override
	public boolean equals(Object test1) {
		if (test1 == null)
			return false;
		if (test1 == this)
			return true;
		if (!(test1 instanceof Maitre)) {
			return false;
		} else {
			Maitre test2 = (Maitre) test1;

			if (test2.getNom().equals(this.getNom()) && test2.getPrenom().equals(this.getPrenom())
					&& test2.getFaction().equals(this.getFaction())) {

				return true;
			}

		}
		return false;
	}

}
