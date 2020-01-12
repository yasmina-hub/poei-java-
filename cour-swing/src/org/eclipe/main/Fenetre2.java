package org.eclipe.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Fenetre2 extends JFrame implements ActionListener, KeyListener{
	JLabel xLabel = new JLabel ("x : ");
	JLabel yLabel = new JLabel ("y : ");
	JTextField xTexte = new JTextField ();
	JTextField yTexte = new JTextField ();

	JButton afficherSomme = new JButton ("+");
	JButton afficherSoustraction = new JButton ("-");
	JButton afficherProduit = new JButton ("*");
	JButton afficherDivision = new JButton ("/");

	public Fenetre2() {
		this.setVisible(true);
		setSize(500, 500);
		setTitle("Calcul de la somme");
		xLabel.setBounds(20, 20, 100, 20);
		xTexte.setBounds(140, 20, 100, 20);
		yLabel.setBounds(20, 40, 100, 20);
		yTexte.setBounds(140, 40, 100, 20);

		afficherSomme.setBounds(20, 60, 100, 20);
		afficherSoustraction.setBounds(20, 80, 100, 20);
		afficherProduit.setBounds(20, 100, 100, 20);
		afficherDivision.setBounds(20, 120, 100, 20);

		this.add(xLabel);
		this.add(xTexte);
		this.add(yLabel);
		this.add(yTexte);

		this.add(afficherSomme);
		this.add(afficherSoustraction);
		this.add(afficherProduit);
		this.add(afficherDivision);
		setLayout(null);

		afficherSomme.addActionListener(this);
		afficherSomme.setEnabled(false);

		afficherSoustraction.addActionListener(this);
		afficherSoustraction.setEnabled(false);

		afficherProduit.addActionListener(this);
		afficherProduit.setEnabled(false);

		afficherDivision.addActionListener(this);
		afficherDivision.setEnabled(false);

		xTexte.addKeyListener(this);
		yTexte.addKeyListener(this);

		//		afficherSomme.addActionListener((e) -> {
		//			int i = Integer.parseInt(xTexte.getText());
		//			int j = Integer.parseInt(yTexte.getText());
		//			int resultat = i + j;
		//			System.out.println(resultat);
		//		}); // autre solution sans implémenter la class ActionListener
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//TODO Auto-generated method stub
		var nbr1 = Integer.parseInt(xTexte.getText());
		var nbr2 = Integer.parseInt(yTexte.getText());
		var resultat = nbr1;

		if (e.getSource() == afficherSomme) {
			resultat = nbr1 + nbr2;
		}
		else if (e.getSource() == afficherSoustraction) {
			resultat = nbr1 - nbr2;
		}
		else if (e.getSource() == afficherProduit) {
			resultat = nbr1 * nbr2;
		}
		else if (e.getSource() == afficherDivision) {
			resultat = nbr1 / nbr2;
		}

		else {
		};

		System.out.println(resultat); //affiche dans la console
		//		JOptionPane.showMessageDialog(null, resultat); //affiche dans une fenetre message
		Fenetre3 fenetre3 = new Fenetre3(resultat);
		this.dispose();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if (!xTexte.getText().isEmpty() && !yTexte.getText().isEmpty()) {
			afficherSomme.setEnabled(true);
			afficherSoustraction.setEnabled(true);
			afficherProduit.setEnabled(true);
			afficherDivision.setEnabled(true);
		}
		else {
			afficherSomme.setEnabled(false);
			afficherSoustraction.setEnabled(false);
			afficherProduit.setEnabled(false);
			afficherDivision.setEnabled(false);	
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (!xTexte.getText().isEmpty() && !yTexte.getText().isEmpty()) {
			afficherSomme.setEnabled(true);
			afficherSoustraction.setEnabled(true);
			afficherProduit.setEnabled(true);
			afficherDivision.setEnabled(true);
		}
		else {
			afficherSomme.setEnabled(false);
			afficherSoustraction.setEnabled(false);
			afficherProduit.setEnabled(false);
			afficherDivision.setEnabled(false);	
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (!xTexte.getText().isEmpty() && !yTexte.getText().isEmpty()) {
			afficherSomme.setEnabled(true);
			afficherSoustraction.setEnabled(true);
			afficherProduit.setEnabled(true);
			afficherDivision.setEnabled(true);
		}
		else {
			afficherSomme.setEnabled(false);
			afficherSoustraction.setEnabled(false);
			afficherProduit.setEnabled(false);
			afficherDivision.setEnabled(false);	
		}
	}



}
