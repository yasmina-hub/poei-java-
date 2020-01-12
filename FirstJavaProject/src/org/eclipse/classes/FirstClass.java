package org.eclipse.classes;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello world");
		//affiche hello world
		
		//int x = 100;
		//byte z = (byte) x;
		//System.out.println(z);
		//affiche 100
		
		//String string = "bonjour";
		//System.out.println(string);
		//affiche bonjour
		
		//String str1 = "bonsoir";
		//String str2 = "bonsoir";
		//System.out.println(str1.equals(str2));
		//affiche true
		
		//String string = "bonjour les bons jours";
		//String string2 = string.replace("jour", "soir");
		//System.out.println(string2);
		// affiche bonsoir les bons soirs
		
		//var y = 10;
		//System.out.println(y);
		//x = "bonjour"; //on ne peut pas changer le type de la variable
		//affiche 10
		
//		Scanner scanner = new Scanner(System.in);
//		int i = scanner.nextInt();
//		System.out.println(i);
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("veuillez saisir 4 nombres");
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		int c = scanner.nextInt();
//		int d = scanner.nextInt();
//		
//		System.out.println( a + b + c + d);
//		System.out.println( a - b - c - d);
//		System.out.println( a * b * c * d);
//		System.out.println ( (float) a / b / c / d);
//		
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		// si on saisit "bonjour tout le monde"
//		String string = scanner.next();
//		System.out.println(string);
//		// affiche bonjour
		
//		Scanner scanner = new Scanner(System.in);
//		// si on saisit "bonjour tout le monde"
//		String string = scanner.nextLine();
//		System.out.println(string);
//		// affiche bonjour tout le monde
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("saisir une valeur s");
//		String string = scanner.nextLine();
//		System.out.println("res = " + string.charAt(0) + string.charAt(string.length() -1));
		
//		var x = Math.round(Math.random()*5 + 1);
//		System.out.println(x); // fonction qui donne un nombre aléatoire entre 1 et 6

		Scanner scanner = new Scanner(System.in);
		System.out.println("saisir deux nombres");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("saisir l'opérateur");
		String op = scanner.next();
		
		if (op.equals('+')) {
			System.out.println(a + b); 
			}
		else if (op.equals('-')) {
			System.out.println(a - b); 	
			}
		else if (op.equals('*')) {
			System.out.println(a * b); 	
			}
		else if (op.equals('/')) {
			System.out.println(a / b); 	
			}
		else  {
			System.out.println("erreur"); 	
			};
			
	}
}
