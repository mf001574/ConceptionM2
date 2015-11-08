package metier;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EK
 */
public class ClientsManager {
    

    
    /*Fait une requete sql sur le SQBD*/
    public Client rechercherClientParPseudo(String pseudo, String motDePasse){
        String r = "Select * from Client where pseudo="+pseudo+" and motDePasse="+motDePasse;
        Client c = new Client(pseudo,"Jean",motDePasse);
        return c;
    }
}
