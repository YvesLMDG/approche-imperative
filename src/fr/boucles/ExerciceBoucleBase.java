package fr.boucles;

public class ExerciceBoucleBase {
	public static void main(String[] args) {
		System.out.println("Affichage des nombres de 1 à 10 :");
		for (int i=1; i<11; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\nAffichage 20 fois d'un nom et d'un prénom :");
		
		String lastName = "Le Monnier de Gouville";
		String firstName = "Yves";
		
		for (int i=1; i<21; i++) {
			System.out.println(lastName + " " + firstName);
		}		
		
		System.out.println("\nAffichage des éléments pairs de 2 à 100 :");
		for (int i=2; i<101; i+=2) {
			System.out.print(i + " ");	
		}

		System.out.println("\n\nAffichage des éléments impairs de 1 à 99 :");
		for (int i=1; i<100; i+=2) {
			System.out.print(i + " ");	
		}
	}
}
