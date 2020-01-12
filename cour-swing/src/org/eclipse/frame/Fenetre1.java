package org.eclipse.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fenetre1 extends JFrame implements ActionListener {
	JLabel nomLabel = new JLabel ("nom : ");
	JTextField nomTexte = new JTextField ();
	JButton afficherButton = new JButton ("Afficher");

	public Fenetre1() {
		this.setVisible(true);
		setSize(500, 500);
		setTitle("Ma première fenetre");
		nomLabel.setBounds(20, 20, 100, 20);
		nomTexte.setBounds(140, 20, 100, 20);
		afficherButton.setBounds(20, 60, 100, 20);
		this.add(nomLabel);
		this.add(nomTexte);
		this.add(afficherButton);
		setLayout(null);

		afficherButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getSource()== afficherButton);
		var nom = nomTexte.getText();
		System.out.println("bonjour " + nom);

	}
}
