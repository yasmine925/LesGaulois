package village_gaulois;

import personnages.Gaulois;

public class Village {
	private  String nom;
	private int nbVillageois = 0;
	private Gaulois chef ;	
	private Gaulois[] villageois;
	
	public Village(String nom, Gaulois chef, int nbVillageoisMaximum) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		chef.setVillage(this);
	}
	public String getNom() {
		return nom;
	}
	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);	
	}
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois >= 1 && numVillageois <= nbVillageois) {
			return villageois[numVillageois - 1]; // num 1 à l'indice 0 du tableau
		}
		System.out.println("Il n'y a pas autant d'habitants dans notre village !");
		return null;
		
	}
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village ("Village des Irréductibles",abraracourcix,30);
		village.trouverVillageois(30);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix); 
		Gaulois gaulois = village.trouverVillageois(1);
		 System.out.println(gaulois);
		 gaulois = village.trouverVillageois(2);
		 System.out.println(gaulois);
		 village.afficherVillageois();
		 Gaulois obelix = new Gaulois("Obélix", 25);
		 village.ajouterVillageois(obelix);
		 Gaulois doublepolemix = new Gaulois("Doublepolémix", 4);
		 abraracourcix.sePresenter();
		 asterix.sePresenter();
		 doublepolemix.sePresenter();
		 
	}
	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
		System.out.println("vivent les légendaires gaulois :");
		for(int i =0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
		
		
	}
	
}
