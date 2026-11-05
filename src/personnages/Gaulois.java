package personnages;
import village_gaulois.Village;
public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

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
		return "Le Gaulois " + nom + " : ";
	}
	public static void main(String[] args) {
	Gaulois asterix = new Gaulois("Astérix", 8);
	System.out.println(asterix); 
}

	@Override
	public String toString() {
		return nom;
	}	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
		romain.recevoirCoup(force * effetPotion / 3);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
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

}

