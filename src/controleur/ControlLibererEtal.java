package controleur;

import villagegaulois.Etal;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private Etal etal;
	

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	//TODO a completer

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [3] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	public Etal isVnedeur(String nomVendeur) {
		etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		return etal;
	}
	
	public String[] libererEtal(String nomVendeur) {
		//TODO a completer
		String[] donneesEtal = null;
		return donneesEtal;
	}

}
