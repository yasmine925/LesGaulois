package personnages;
import village_gaulois.Musee;
import village_gaulois.Village;
import objets.Equipement;
public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private Village village;
	private int force;
	private int nbtrophees;
	private Equipement [] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		
	}
	

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}

	public static void main(String[] args) {
	Gaulois asterix = new Gaulois("Astérix", 8);
	System.out.println(asterix); 
}


	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
	+ romain.getNom());
		Equipement [] trophees = romain.recevoirCoup((force / 2) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
		effetPotion = 1;
		}
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nbtrophees++) {
		this.trophees[nbtrophees] = trophees[i];
		 }
		}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	public Village getVillage() {
		return village;
	}
	
	public void setVillage(Village village) {
		this.village = village;
		
	}
	public void sePresenter() {
		if (village != null && village.getChef() == this) {
			parler("Bonjour, je m'appelle " + nom + ". je suis le chef du village : " + village.getNom() + ".");
		}else if (village != null) {
			parler("Bonjour, je m'appelle " + nom + " j'habite dans le village:" + village.getNom() + ".");
		}else {
			parler("Bonjour, je m'appelle " + nom + ". je voyage de villages en villages. ");
		}	
	}
	public void faireUneDonnation(Musee musee) {
		if (nbtrophees > 1) {
			String texte ="Je donne au musee tous mes trophees :";
			for (int i = 0; i < nbtrophees; i++) {
				texte += "\n-" +trophees[i];
				musee.donnerTrophees(this, trophees[i]);
			}
			parler(texte);	
		}
		
	}

}

