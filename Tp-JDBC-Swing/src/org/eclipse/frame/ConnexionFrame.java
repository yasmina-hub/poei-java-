package org.eclipse.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.eclipse.dao.UtilisateurDaoImpl;
import org.eclipse.model.Utilisateur;

public class ConnexionFrame extends JFrame implements ActionListener {

	JLabel nomLabel = new JLabel("nom : ");
	JLabel prenomLabel = new JLabel("prenom : ");
	JTextField nomTexte = new JTextField();
	JTextField prenomTexte = new JTextField();
	static int nbrConnexion = 0;

	JButton sinscrire = new JButton("s'inscrire");
	JButton connexion = new JButton("connexion");

	public ConnexionFrame() {
		this.setVisible(true);
		setSize(500, 500);
		setTitle("ajout dans la base de donnée");
		nomLabel.setBounds(20, 20, 100, 20);
		nomTexte.setBounds(140, 20, 100, 20);
		prenomLabel.setBounds(20, 40, 100, 20);
		prenomTexte.setBounds(140, 40, 100, 20);

		sinscrire.setBounds(20, 60, 100, 20);
		connexion.setBounds(20, 80, 100, 20);

		this.add(nomLabel);
		this.add(nomTexte);
		this.add(prenomLabel);
		this.add(prenomTexte);

		this.add(sinscrire);
		this.add(connexion);
		setLayout(null);

		sinscrire.addActionListener(this);
		connexion.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == connexion) {
			nbrConnexion++;
			String nom = nomTexte.getText();
			String prenom = prenomTexte.getText();

			UtilisateurDaoImpl utilisateurDaoImpl = new UtilisateurDaoImpl();
			Utilisateur utilisateur = utilisateurDaoImpl.findByNomAndPrenom(nom, prenom);
			if (utilisateur == null) {
				if (nbrConnexion == 3) {
					this.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "identification incorrecte");
				}
			} else {
				System.out.print("connexion Ok");
				this.dispose();
			}
		}

		if (e.getSource() == sinscrire) {
			this.dispose();
			InscriptionFrame inscriptionFrame = new InscriptionFrame();
		}
	}

}
