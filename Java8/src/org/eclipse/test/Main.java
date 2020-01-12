package org.eclipse.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.eclipse.model.ICalcul;
import org.eclipse.model.Personne;

public class Main {

	public static void main(String[] args) {

		Personne personne = new Personne("el mouelhi","achref",34);
		// personne.iMiseEnForme.afficherDetails();
		// personne.iMiseEnForme.afficherNomComplet(personne.getNom(),
		// personne.getPrenom());
		// System.out.println(personne.iMiseEnForme.getClass());
		// System.out.println(personne.iMiseEnForme.getClass().
		// getSuperclass());

		// ICalcul plus = (int x, int y) -> x + y;
		// ICalcul plus = (int x, int y) -> { return (x + y); };
		// System.out.println(plus.operationBinaire(3, 5));

		// Function<Personne, String> personneToString = (Personne p) -> p.getNom() + "
		// " + p.getPrenom();
		// System.out.println(personneToString.apply(personne));

		// List<Personne> personnes = Arrays.asList(new Personne("nom1", "prenom1", 35),
		// new Personne("nom2", "prenom2", 18), new Personne("nom3", "prenom3", 27),
		// new Personne("nom4", "prenom4", 40));
		// List<String> noms = listToStrings(personnes);
		// for (String nom : noms) {
		// System.out.println(nom);
		// }

		// Function<Personne, String> personneToString = p -> p.getNom() + " " +
		// p.getPrenom();
		// Function<String, Integer> strToInt = str -> str.length();
		//
		// Function <Personne, Integer> personneToInt =
		// personneToString.andThen(strToInt);
		//
		// int longueur = personneToInt.apply(personne);
		// System.out.println(longueur);
		// // affiche 17

		//	List<Integer> tab1 = List.of(15, 3, 10);
		//	List<Integer> tab2 = List.of(12, 17, 18);
		//
		//	BiFunction<Integer, Integer, Integer> somme = (a, b) -> a + b;
		//
		//	Function<List<Integer>, Integer> chercherMax = (tab) -> {
		//		Integer max = tab.get(0);
		//		for (Integer entier : tab) {
		//			if (entier > max) {
		//				max = entier;
		//			}
		//		}
		//		return max;
		//
		//	};
		//	BiFunction<List<Integer>, List<Integer>, Integer> sommeMax = (a, b) -> {
		//		return somme.apply(chercherMax.apply(a), chercherMax.apply(b));
		//	};
		//	System.out.println(sommeMax.apply(tab1, tab2));


		//	BiFunction <Integer, Integer, Integer> calculExposant = (x, n) -> (x*x)^n;
		//	BinaryOperator <Integer> calculExposant = (x, n) -> (x*x)^n;
		//	System.out.println(calculExposant.apply(2, 10));
		//		
		//	IntFunction <String> parity = i -> (i % 2 == 0) ? "pair" : "impair";
		//	System.out.println(parity.apply(4));
		//	// affiche pair
		//	System.out.println(parity.apply(5));
		//	// affiche impair

		//	Consumer <Personne> afficher = System.out::print;
		//	afficher.accept(personne);

		//	Supplier <Personne> constructeur = Personne::new;
		//	Personne p = constructeur.get();
		//	System.out.println(p);

		//	List<Integer> liste = new ArrayList<Integer>(Arrays.asList(2, 7, 1, 3));
		//	liste.forEach(elt -> System.out.println(elt));
		//	liste.forEach(System.out::println);

//		List<Integer> liste = Arrays.asList(2, 7, 1, 3);
//		Stream <Integer> stream = liste.stream();
		//	stream.forEach(elt -> System.out.println(elt));
		//	stream.forEach(System.out::println);
		//  stream.map(elt -> elt + 2).forEach(elt -> System.out.println(elt));

		// stream.map(elt -> elt + 2)
		// .filter(elt -> elt > 3)
		//	.forEach(elt -> System.out.println(elt));

//		Optional<Integer> somme = stream.map(elt -> elt + 2)
//				.filter(elt -> elt > 3)
//				.reduce((a, b) -> a + b);
//				if (somme.isPresent())
//				System.out.println(somme.get());

//				stream.map(elt -> elt + 2)
//				.filter(elt -> elt > 3)
//				.reduce((a, b) -> a + b)
//				.ifPresent(System.out::print);
//
//				liste = stream.map(elt -> elt + 2)
//						.filter(elt -> elt > 3)
//						.collect(Collectors.toList());
//				liste.forEach(elt -> System.out.println(elt));

				
//				List<String> liste = List.of("bonjour", "hello", "ciao", "hi");
//				Scanner scanner = new Scanner(System.in);
//				System.out.println("Entrer une valeur");
//				int i = scanner.nextInt();
//				scanner.close();
//				System.out.println(liste.stream().anyMatch(elt -> elt.length() == i));
		
		
//		ArrayList <Integer>liste = new ArrayList();
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Entrer une valeur");
//		int i = scanner.nextInt();
//		
//		while (i > 0) {
//			final int k = i;
//			liste.add(i);
//			System.out.println(liste.parallelStream().filter(elt -> elt == k).count());
//			System.out.println("Entrer une valeur pour continuer");
//		i = scanner.nextInt();
//		 }
//		scanner.close();
		
//		IntStream stream1 = IntStream.of(1, 2, 3);
//		stream1.forEach(System.out::println);
//
//		IntStream stream2 = IntStream.range(0, 6);
//		stream2.skip(3).forEach(System.out::println);
		
		
//		ArrayList <Integer>liste = new ArrayList();
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Entrer une valeur");
//		int i = scanner.nextInt();
//		
//		while (i > 0) {
//			liste.add(i);
//			System.out.println("Entrer une valeur pour continuer");
//			i = scanner.nextInt();
//		 }
//		System.out.println("max: " + liste.stream().mapToInt(Integer::intValue).max().orElse(-1));
//		System.out.println("min: " + liste.stream().mapToInt(Integer::intValue).min().orElse(-1));
//		System.out.println("somme: " + liste.stream().mapToInt(Integer::intValue).sum());
//		System.out.println("moyenne: " + liste.stream().mapToInt(Integer::intValue).average().orElse(-1));
//		scanner.close();

//		LocalDateTime localDateTime = LocalDateTime.from(ZonedDateTime.now());
//		System.out.println("Date et heure actuelle : " + localDateTime);
//
//		LocalDate localDate = localDateTime.toLocalDate();
//		System.out.println("Date actuelle : " + localDate);
//		// affiche Date actuelle : 2018-07-30
//
//		ZoneId.getAvailableZoneIds().forEach(System.out::println);
//		// affiche une liste longue de fuseaux horaires
		
//		ZoneId paris = ZoneId.of("Europe/Paris");
//		ZoneId michigan = ZoneId.of("US/Michigan");
//		ZonedDateTime dateHeureMichigan = dateHeureParis.withZoneSameInstant(michigan);
//		System.out.println(dateHeureMichigan);
		// affiche 2019-09-22T14:09:27.949-04:00[US/Michigan]
	}


	// public static List<String> listToStrings(List<Personne> personnes) {
	//
	// Function<Personne, String> personneToString = (p) -> p.getAge() % 2 == 0 ?
	// p.getNom() : p.getPrenom();
	//
	// List<String> chaines = new ArrayList<String>();
	//
	// for (Personne personne : personnes) {
	// chaines.add(personneToString.apply(personne));
	// }
	// return chaines;
	// }

}
