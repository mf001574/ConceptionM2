/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Florian
 */
public class LignePanier {


    private Produit produit;

    LignePanier(Produit produit) {
        this.produit = produit;
    }

    /**
     * Get the value of produit
     *
     * @return the value of produit
     */
    public Produit getProduit() {
        return produit;
    }

    /**
     * Set the value of produit
     *
     * @param produit new value of produit
     */
    public void setProduit(Produit produit) {
        this.produit = produit;
    }

 

    public LignePanier() {
    }

    void ajouterAPanier(Panier panier) {
        panier.ajouterLigne(this);
    }
    
}
