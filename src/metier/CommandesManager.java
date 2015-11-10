/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import metier.LignePanier;
/**
 *
 * @author Florian
 */
public class CommandesManager {

    public CommandesManager() {
    }

    public Panier creerPanier() {
        Panier p = new Panier();
        return p;
    }

    public void creerLignePanier(Produit produit, Panier panier) {
        LignePanier ligne; 
        ligne = new LignePanier(produit);
        ligne.ajouterAPanier(panier);
    }
    
}
