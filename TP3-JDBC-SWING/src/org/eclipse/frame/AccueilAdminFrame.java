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

public class AccueilAdminFrame extends JFrame implements ActionListener {
	JLabel numeroLabel = new JLabel("numero : ");
	JLabel nomLabel = new JLabel("nom : ");
	JLabel prenomLabel = new JLabel("prenom : ");
	JLabel sexeLabel = new JLabel("sexe : ");
	JLabel typeLabel = new JLabel("type : ");
	JLabel numLabel = new JLabel("supprimer le numero : ");

	JTextField numeroTexte = new JTextField();
	JTextField nomTexte = new JTextField();
	JTextField prenomTexte = new JTextField();
	JTextField sexeTexte = new JTextField();
	JTextField typeTexte = new JTextField();
	JTextField numTexte = new JTextField();

	JButton creer = new JButton("creer");
	JButton modifier = new JButton("modifier");
	JButton supprimer = new JButton("supprimer");

	public AccueilAdminFrame() {
		this.setVisible(true);
		setSize(500, 500);
		setTitle("Accueil administrateur");

		numeroLabel.setBounds(20, 20, 100, 20);
		numeroTexte.setBounds(140, 20, 100, 20);

		nomLabel.setBounds(20, 40, 100, 20);
		nomTexte.setBounds(140, 40, 100, 20);

		prenomLabel.setBounds(20, 60, 100, 20);
		prenomTexte.setBounds(140, 60, 100, 20);

		sexeLabel.setBounds(20, 80, 100, 20);
		sexeTexte.setBounds(140, 80, 100, 20);

		typeLabel.setBounds(20, 100, 100, 20);
		typeTexte.setBounds(140, 100, 100, 20);

		numLabel.setBounds(20, 160, 200, 20);
		numTexte.setBounds(210, 160, 100, 20);

		creer.setBounds(140, 120, 100, 20);
		modifier.setBounds(250, 120, 100, 20);
		supprimer.setBounds(350, 160, 100, 20);

		this.add(numeroLabel);
		this.add(numeroTexte);
		this.add(nomLabel);
		this.add(nomTexte);
		this.add(prenomLabel);
		this.add(prenomTexte);
		this.add(sexeLabel);
		this.add(sexeTexte);
		this.add(typeLabel);
		this.add(typeTexte);
		this.add(numLabel);
		this.add(numTexte);

		this.add(creer);
		this.add(modifier);
		this.add(supprimer);
		setLayout(null);

		creer.addActionListener(this);
		modifier.addActionListener(this);
		supprimer.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == creer) {
			UtilisateurDaoImpl utilisateurDaoImpl = new UtilisateurDaoImpl();
			Utilisateur utilisateur = new Utilisateur(nomTexte.getText(), prenomTexte.getText(), sexeTexte.getText(), typeTexte.getText());
			var inserted = utilisateurDaoImpl.save(utilisateur);
			if (inserted != null) {
				JOptionPane.showMessageDialog(null, "personne ajoutée avec succes");
			}
			else {
				JOptionPane.showMessageDialog(null, "probleme d'insertion)");
			}
		};	
		if (e.getSource() == supprimer) {
			UtilisateurDaoImpl utilisateurDaoImpl = new UtilisateurDaoImpl();
			int num = Integer.parseInt(numTexte.getText());
			Utilisateur utilisateur= utilisateurDaoImpl.findById(num);
			if (utilisateur != null) {
				utilisateurDaoImpl.remove(utilisateur);
				JOptionPane.showMessageDialog(null, "Personne suprimée avec succes");
			}
			else {
				JOptionPane.showMessageDialog(null, "Personne introuvable");
			}
		};
		if (e.getSource() == modifier) {
			UtilisateurDaoImpl utilisateurDaoImpl = new UtilisateurDaoImpl();
			Utilisateur utilisateur = new Utilisateur(Integer.parseInt(numeroTexte.getText()), nomTexte.getText(), prenomTexte.getText(), sexeTexte.getText(), typeTexte.getText());
			var modified = utilisateurDaoImpl.update(utilisateur);
			if (modified != null) {
				JOptionPane.showMessageDialog(null, "personne modifiée avec succes");
			}
			else {
				JOptionPane.showMessageDialog(null, "probleme de modification)");
			}
		}


	}

}