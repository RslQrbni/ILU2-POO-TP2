package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,
			Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		// a completer, attention le retour ne dit pas etre false :-)
		return (village.rechercherEtalVide());
	}

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		int numeroEtal = -1;
		 Gaulois gaulois = village.trouverHabitant(nomVendeur);
		numeroEtal = village.installerVendeur(gaulois, produit, nbProduit);
		
		return numeroEtal;
	}

	public boolean verifierIdentite(String nomVendeur) {
		// a completer, attention le retour ne dit pas etre false :-)
		boolean nomVendeurConnu;
		if(controlVerifierIdentite.verifierIdentite(nomVendeur)){
			nomVendeurConnu = true;
		}
		else {
			nomVendeurConnu = false;
		}
		return nomVendeurConnu;
		
	}
}
