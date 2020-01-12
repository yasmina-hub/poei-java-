package org.eclipse.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.eclipse.dao.PersonneDaoImpl;
import org.eclipse.model.Personne;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Fenetre1 extends JFrame implements ActionListener {
	JLabel nomLabel = new JLabel("nom : ");
	JLabel prenomLabel = new JLabel("prenom : ");
	JTextField nomTexte = new JTextField();
	JTextField prenomTexte = new JTextField();

	JButton ajouter = new JButton("ajouter");

	public Fenetre1() {
		this.setVisible(true);
		setSize(500, 500);
		setTitle("ajout dans la base de donnée");
		nomLabel.setBounds(20, 20, 100, 20);
		nomTexte.setBounds(140, 20, 100, 20);
		prenomLabel.setBounds(20, 40, 100, 20);
		prenomTexte.setBounds(140, 40, 100, 20);

		ajouter.setBounds(20, 60, 100, 20);

		this.add(nomLabel);
		this.add(nomTexte);
		this.add(prenomLabel);
		this.add(prenomTexte);

		this.add(ajouter);
		setLayout(null);

		ajouter.addActionListener((e) -> {
			PersonneDaoImpl personneDaoImpl = new PersonneDaoImpl();
			Personne personne = new Personne(nomTexte.getText(), prenomTexte.getText());
			var inserted = personneDaoImpl.save(personne);
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
