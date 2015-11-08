/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import metier.Client;
import metier.ClientsManager;

/**
 *
 * @author EK
 */
public class SessionPasserCommande {
    private String pseudo;
    private String motDePasse;
    
    
    public void traiterConnexion(){
        
    }
    
    public Client traiterIdentification(String pseudo, String motDePasse){
        ClientsManager cm = new ClientsManager();
        Client c = cm.rechercherClientParPseudo(pseudo, motDePasse);
        return c;
    }
}
