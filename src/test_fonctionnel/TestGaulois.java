package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class TestGaulois {
	private String nom;
	private int force;
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obélix = new Gaulois("Obélix", 16);
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain ("Brutus",14);
		Druide panoramix = new Druide("Panoramix",2);
		
		
		
		// parler 
		asterix.parler("Bonjour Obélix.");
		obélix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obélix);
		panoramix.booster(asterix);
		for (int i = 0; i < 3; i++) {
		    asterix.frapper(brutus);
		}
		
	}

}
