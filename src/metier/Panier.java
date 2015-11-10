/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Florian
 */
public class Panier {
    
    private List<LignePanier> listeLigne;

    public List<LignePanier> getListeLigne() {
        return listeLigne;
    }

    public void setListeLigne(List<LignePanier> listeLigne) {
        this.listeLigne = listeLigne;
    }
    
    public Panier(){
        this.listeLigne = new ArrayList();
    }

    void ajouterLigne(LignePanier ligne) {
        this.listeLigne.add(ligne);
    }
    
    
}
