package controleur;

import javax.swing.JPanel;

import vue.EcranAccueil;
import metier.Client;
import metier.ClientsManager;

public class SessionPasserCommande {

	private JPanel ecranCourant;
	//private int nbErreurs;
	private ClientsManager cm;
	
	public SessionPasserCommande() {
		this.cm = new ClientsManager();
	}
	
	public JPanel traiterConnexion() {
		ecranCourant = new EcranAccueil();
		return ecranCourant;
	}
	
	public Client traiterIdentification(String pseudo, String motDePasse) {
		
		return this.cm.rechercherClientParPseudo(pseudo, motDePasse);
	}
}
