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

public class InscriptionFrame extends JFrame implements ActionListener {
	JLabel nomLabel = new JLabel("nom : ");
	JLabel prenomLabel = new JLabel("prenom : ");
	JLabel sexeLabel = new JLabel("sexe : ");
	JLabel typeLabel = new JLabel("type : ");
	
	JTextField nomTexte = new JTextField();
	JTextField prenomTexte = new JTextField();
	JTextField sexeTexte = new JTextField();
	JTextField typeTexte = new JTextField();
	
	JButton inscription = new JButton("inscription");
	
	public InscriptionFrame() {
		this.setVisible(true);
		setSize(500, 500);
		setTitle("Inscription");
		nomLabel.setBounds(20, 20, 100, 20);
		nomTexte.setBounds(140, 20, 100, 20);
		
		prenomLabel.setBounds(20, 40, 100, 20);
		prenomTexte.setBounds(140, 40, 100, 20);
		
		sexeLabel.setBounds(20, 60, 100, 20);
		sexeTexte.setBounds(140, 60, 100, 20);
		
		typeLabel.setBounds(20, 80, 100, 20);
		typeTexte.setBounds(140, 80, 100, 20);
		
		inscription.setBounds(20, 140, 100, 20);

		this.add(nomLabel);
		this.add(nomTexte);
		this.add(prenomLabel);
		this.add(prenomTexte);
		this.add(sexeLabel);
		this.add(sexeTexte);
		this.add(typeLabel);
		this.add(typeTexte);

		this.add(inscription);
		setLayout(null);
		
		inscription.addActionListener((e) -> {
			UtilisateurDaoImpl utilisateurDaoImpl = new UtilisateurDaoImpl();
			Utilisateur utilisateur = new Utilisateur(nomTexte.getText(), prenomTexte.getText(), sexeTexte.getText(), typeTexte.getText());
			var inserted = utilisateurDaoImpl.save(utilisateur);
			if (inserted != null)
				JOptionPane.showMessageDialog(null, "personne ajoutée avec succes)");
			else {
				JOptionPane.showMessageDialog(null, "probleme d'insertion)");
			}
		});	
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
