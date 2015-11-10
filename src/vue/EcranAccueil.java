package vue;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import metier.Client;
import controleur.SessionPasserCommande;

public class EcranAccueil extends JPanel {
	
	private SessionPasserCommande spc;
	private JTextField pseudoField;
	private JTextField mdpField;
	private Button connexionBtn;
	
	public EcranAccueil() {
		 
		// Initialisation des text field et bouton de l'écran d'accueil
		pseudoField = new JTextField(15);
		mdpField = new JTextField(15);
		connexionBtn = new Button("Identification");
		
		// Ajout d'un listenenr qui lance l'inscription au clique
		connexionBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				identification();
			}
		});
		
		// Ajout des text field et bouton au panel de l'écran d'accueil
		this.add(pseudoField);
		this.add(mdpField);
		this.add(connexionBtn);
	}
	
	public void identification() {
		
		// Vérifier que les champs des textField sont initialisés
		if(!pseudoField.getText().equals("") && !mdpField.getText().equals("")) {
			
			// Traiter l'identification
			Client client = spc.traiterIdentification(pseudoField.getText(), mdpField.getText());
			System.out.println(client.getNom());
			System.out.println(client.getPrenom());
		}
	}
	
	public void setSpc(SessionPasserCommande spc) {
		this.spc = spc;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		
		// Récupérer une instance de SessionPasserCommande
		SessionPasserCommande spc = new SessionPasserCommande();
				
		// Traiter la connexion
		EcranAccueil ecranAccueil = (EcranAccueil) spc.traiterConnexion();
		ecranAccueil.setSpc(spc);
				
		// Afficher écran d'accueil
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		frame.add(ecranAccueil);
		frame.setVisible(true);
	}
}
