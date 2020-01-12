package org.eclipse.main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.eclipse.dao.PersonneDaoImpl;
import org.eclipse.model.Personne;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SupprimerPersonne extends JFrame{
	private JTextField numText = new JTextField();
	JLabel IdentifiantLabel = new JLabel("Identifiant");
	JButton btnSupprime = new JButton("Supprimer");
	
	public SupprimerPersonne() {
		setVisible(true);
		setSize(500, 500);
		setTitle("Suppression d'une personne");
		getContentPane().setLayout(null);
		
		IdentifiantLabel.setBounds(44, 39, 51, 28);
		getContentPane().add(IdentifiantLabel);
		numText.setBounds(105, 44, 96, 19);		 
		getContentPane().add(numText);
		numText.setColumns(10);
		btnSupprime.setBounds(211, 43, 85, 21);
		getContentPane().add(btnSupprime);
		
		
		btnSupprime.addActionListener((e) -> {
			PersonneDaoImpl personneDaoImpl = new PersonneDaoImpl();
			int num = Integer.parseInt(numText.getText());
			Personne personne = personneDaoImpl.findById(num);
			if (personne != null) {
				personneDaoImpl.remove(personne);
				JOptionPane.showMessageDialog(null, "Personne suprimée avec succes");
			}
			else 
				JOptionPane.showMessageDialog(null, "Personne introuvable");

		});
		
	}
}
