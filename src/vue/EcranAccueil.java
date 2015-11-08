/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.SessionPasserCommande;
import metier.Client;

/**
 *
 * @author EK
 */
public class EcranAccueil {
    public EcranAccueil(){
        SessionPasserCommande s = new SessionPasserCommande();
        s.traiterConnexion();
        this.afficherEcranAccueil();
        //l'utilisateur saisit le pseudo et le mot de passe 
        Client c = s.traiterIdentification("Martin","mdp");
        String nom = c.getNom();
        String prenom = c.getPrenom();
        this.afficherEcranPerso(nom,prenom);
    }   

    private void afficherEcranAccueil() {
        System.out.println("Affichage écran accueil");
    }

    private void afficherEcranPerso(String nom, String prenom) {
         System.out.println("Affichage bienvenue : Bienvenue "+nom+" "+prenom);
    }
}
