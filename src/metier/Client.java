/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author EK
 */
public class Client {
    private String nom;
    private String prenom;
    private String mdp;

    public Client(String nom, String mdp) {
        this.nom = nom;
        this.mdp = mdp;
    }
      public Client(String nom, String prenom, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
    }
      
    public String getNom() {
        return nom;
    }
    public String getMdp() {
        return mdp;
    }

    public String getPrenom() {
        return prenom;
    }
    
    
}
