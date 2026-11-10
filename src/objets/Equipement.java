package objets;

public enum Equipement {
CASQUE("casque"), BOUCLIER("bouclier");

private String nom;
	private Equipement(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return nom;
	}
	public String getNom() {
	    return nom;
	}
}
