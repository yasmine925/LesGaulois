package objets;

import personnages.Gaulois;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	public Trophee(Gaulois gaulois, Equipement equipement) {
		this.gaulois = gaulois;
		this.equipement = equipement; // Constructeurs _ setters
	}
	
	public Gaulois getGaulois() { // getters
		return gaulois;
	}
	public Equipement getEquipement() {
			return equipement;
		}
	public String donnerNom() {
		return gaulois.getNom();
	}
}
