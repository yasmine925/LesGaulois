package village_gaulois;

import objets.Equipement;
import objets.Trophee;
import personnages.Gaulois;

public class Musee {
	private Trophee [] trophees = new Trophee[200];
	private int nbTrophee = 0;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophees[nbTrophee] = new Trophee(gaulois, equipement);
		nbTrophee++;
		
	}
	
	public String extraireInstructionsOCaml() {
		String texte ="let musee = [\n";
		
		for (int i = 0; i < nbTrophee; i++) {
			texte += "\"" + trophees[i].getGaulois().getNom()
					+ "\", \"" + trophees[i].getEquipement().getNom() + "\"";
			
			if (i < nbTrophee -1) {
				texte += ";\n";
			}
		}
		texte += "\n]";
		return texte;
	}
	
	
	
}
