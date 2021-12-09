package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

		System.out.println("Affichage des éléments du tableau grâce à une boucle :");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n\nAffichage des éléments dans l’ordre inverse du tableau :");
		for (int i=array.length-1; i>-1; i--) {
			System.out.print(array[i] + " ");
		}

		int[] arrayCopy = new int[array.length];
		for (int i=0; i<array.length; i++) {
			arrayCopy[i] = array[i];
		}

	}

}
