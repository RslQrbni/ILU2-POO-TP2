package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					// a completer
					System.out.println("Bienvenue vilageois"+ nomVisiteur);
					int force = Clavier.entrerEntier("Qeulle est votre force? \n");
					controlEmmenager.ajouterGaulois(nomVisiteur, force);
					
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		// a completer
		System.out.println("Bienvenue Druide " + nomVisiteur);
		int force = Clavier.entrerEntier("Quelle est votre force \n");
		int effetPotionMin = Clavier.entrerEntier("Quelle est la force de potion la olus failbe que vous produisez? \n");
		int effetPotionMax = Clavier.entrerEntier("Qulle est la force de potion la plus forte que vous prosuisez? \n");
		
		
		while(effetPotionMax < effetPotionMin) {
			if (effetPotionMax < effetPotionMin) {
				System.out.println("Attention Druide , vous vous êtes trompé entre Max et Min \n" );
		 }
			 effetPotionMin = Clavier.entrerEntier("Quelle est la force de potion la olus failbe que vous produisez? \n");
			 effetPotionMax = Clavier.entrerEntier("Qulle est la force de potion la plus forte que vous prosuisez? \n");
			 
		}
		controlEmmenager.ajouterDruide(nomVisiteur , force, effetPotionMin, effetPotionMax);
		
		
	}
}
