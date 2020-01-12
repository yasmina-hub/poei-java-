package org.eclispe.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

//		File file = new File("fichier.txt");
//		try {
//			FileWriter fw = new FileWriter(file);
//			// pour ecrire une chaıne de caractere
//			fw.write("Hello world");
//			// pour ecrire un entier
//			fw.write(86);
//			// pour ecrire un caractere
//			fw.write('a');
//			
//			BufferedWriter bw = new BufferedWriter(fw);
//			bw.newLine();
//			bw.write("Hello world");
//			bw.newLine();
//			bw.write(87);
//			bw.newLine();
//			bw.write('a');
//			bw.flush();
		// fermer le flux

//			FileReader fr = new FileReader("fichier.txt");
//			int str = fr.read();
//
//			System.out.println(str);
//			// affiche le code ASCII du caractere lu
//			
//			System.out.println((char)str);
//			// affiche le caractere lu

//			int str = fr.read();
//			while (str != -1) {
//			System.out.println((char)str);
//			// affiche tous les caract`eres lus
//			str = fr.read();
//			}

//			BufferedReader bufferedReader = new BufferedReader(fr);
//			String string = bufferedReader.readLine();
//			System.out.println(string);

//			String string ;
//			while ((string = bufferedReader.readLine()) != null)
//			System.out.println(string);
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();	
//		}
		
		File input = new File("input.txt");
		File output = new File("output.txt");

		try {
			FileWriter fw = new FileWriter(input);
			fw.write("Bonjour\n");
			fw.write("john wick\n");
			fw.write("hello world\n");
			fw.write("97");
			fw.close();

			FileReader fr = new FileReader(input);
			BufferedReader bufferedReader = new BufferedReader(fr);
			String string;
			FileWriter ffw = new FileWriter(output);
			BufferedWriter bf = new BufferedWriter(ffw);
			while ((string = bufferedReader.readLine()) != null) {
				System.out.println(String.valueOf(string.length()));
				bf.write(String.valueOf(string.length()));
				bf.newLine();
			}
			System.out.println("fin");
			bf.close();
			fr.close();
			ffw.close();
			bufferedReader.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


	}

}
