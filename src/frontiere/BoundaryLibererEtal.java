package frontiere;

import controleur.ControlLibererEtal;
import controleur.ControlPrendreEtal;
import controleur.ControlVerifierIdentite;
import personnages.Gaulois;
import villagegaulois.Etal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;
	private ControlPrendreEtal controlprendreEtal;
	private Etal etal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		controlLibererEtal.isVnedeur(nomVendeur);
	    boolean vendeurReconnu = controlprendreEtal.verifierIdentite(nomVendeur);
		vendeurReconnu = etal != null;
		if(! vendeurReconnu) {
			System.out.println("Mais vous n'êtes pas inscrit sur notre marché aujoud'hui ! \n");
		}
		else {
			controlLibererEtal.libererEtal(nomVendeur);
		}
	    
		
	}

}
