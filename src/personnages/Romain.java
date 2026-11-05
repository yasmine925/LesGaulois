package personnages;

import java.io.ObjectInputStream.GetField;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private String texte;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
		
	
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
		 minus.sEquiper(Equipement.CASQUE);
		 minus.sEquiper(Equipement.CASQUE);
		 minus.sEquiper(Equipement.BOUCLIER);
		 minus.sEquiper(Equipement.CASQUE);
	 }
		 
	 public void sEquiper(Equipement equipement) {
		 switch (nbEquipement) {
		case 2: 
			System.out.println("Le soldat" + nom + " est déjà bien protégé!");
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat "+ nom + " posséde déjà un " + equipement + ".");
			}else {
				ajouterEquipement(equipement);	
		}
			break;
		case 0 :
			ajouterEquipement(equipement);
			break;
		
		}
	 }
	 private void ajouterEquipement (Equipement equipement) {
		 equipements [nbEquipement] = equipement;
		 nbEquipement++;
		 System.out.println("Le soldat" + nom + "s'équipe avec un " + equipement + ".");
	 }
	
}
