package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if (!(controlPrendreEtal.verifierIdentite(nomVendeur)))
		{
			System.out.println(" Je suis désolé  " + nomVendeur + " mais il faut etre un habitant de notre village pour commercer ici ");
		}
		else
		{
			System.out.println(" Bonjour " + nomVendeur + " je vais regarder si je peut vous trouver un étal ");
			if (!(controlPrendreEtal.resteEtals()))
			{
				System.out.println(" Désolé " + nomVendeur + " je n'ai plus d'étal qui ne soit pas déja occupé ");
			}
			else
			{
				installerVendeur(nomVendeur);
			}
		}
	}


	private void installerVendeur(String nomVendeur) {
		//a completer
		System.out.println("c'est parfait , il me reste un étal pour vous \n il me faudrait qaulques renseigenements \n");
		System.out.println(" Quel produit souhaitez vous vendre ? ");
		String nomProduit = scan.nextLine();
		int nbProduit =  Clavier.entrerEntier("combien souhatez vous en vendre \n");
		// à verifier 
		int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, nomProduit, nbProduit);
		if(numeroEtal != -1) {
			System.out.println("Le vendeur" + nomVendeur + "s'est installé à l'etal n° " + numeroEtal);;
		}
	}
}
