/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.SessionPasserCommande;
import javax.swing.JPanel;
import metier.Produit;

/**
 *
 * @author Florian
 */
public class EcranProduit  extends JPanel {
    public EcranProduit(){
       this.ajouterDansPanier();
    }

    private void ajouterDansPanier() {
        SessionPasserCommande sc = new SessionPasserCommande();
        Produit p = new Produit();
        sc.traiterAjoutProduit(p);
    }
}
