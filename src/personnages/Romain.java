package personnages;

import java.io.ObjectInputStream.GetField;

public class Romain {
	private String nom;
	private int force;
	private String texte;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
	    return "Le Romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		int forceAvant = force;
		force = force - forceCoup;
				if (force < 1) {
					force = 0;
					parler("J'abandonne !");
							
				}else {
					parler("Aïe");
				}
				assert force < forceAvant;
				assert isInvariantVerified();
		
	}
	 private boolean  isInvariantVerified() {
		 return force >= 0;
		
	}
	 public static void main(String[] args) {
		 Romain minus = new Romain("Minus",6);
		 minus.recevoirCoup(3);
	 }
	
}
