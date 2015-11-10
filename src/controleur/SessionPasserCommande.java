package controleur;

import javax.swing.JPanel;

import vue.EcranAccueil;
import metier.Client;
import metier.ClientsManager;
import metier.CommandesManager;
import metier.Panier;
import metier.Produit;

public class SessionPasserCommande {

	private JPanel ecranCourant;
	//private int nbErreurs;
	private ClientsManager cm;
        private Panier lePanier;
	
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

    public void traiterAjoutProduit(Produit p) {
       CommandesManager cm = new CommandesManager();
       if(this.lePanier==null){
            this.lePanier = cm.creerPanier();
       }
       cm.creerLignePanier(p,this.lePanier);
    }
}
