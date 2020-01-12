package org.eclipe.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fenetre3 extends JFrame {

	JLabel resultatLabel = new JLabel ("resultat : ");
	JTextField resultatTexte = new JTextField ();
	JButton retour = new JButton ("retour");
	
	public Fenetre3(int result) {
		resultatTexte.setText("" + result);
		this.add(resultatLabel);
		this.add(resultatTexte);
		this.add(retour);
		this.setVisible(true);
		setSize(500, 500);
		setTitle("résultat");
		resultatLabel.setBounds(20, 20, 100, 20);
		resultatTexte.setBounds(140, 20, 100, 20);
		retour.setBounds(20, 60, 100, 20);
		setLayout(null);
		
		resultatTexte.setEditable(false);
		setLocationRelativeTo(null);
		
		retour.addActionListener((e -> {
			this.dispose();
			Fenetre2 fenetre2 = new Fenetre2();
		}));
		
	}
	

}
