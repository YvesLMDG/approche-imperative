package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {

		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int[] arraySum = new int [array1.length];

		System.out.println("Affichage du premier tableau :");
		for (int i=0; i<array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println("\n\nAffichage du deuxième tableau :");
		for (int i=0; i<array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		for (int i=0; i<array1.length; i++) {
			arraySum[i] = array1[i] + array2[i];
		}
		
		System.out.println("\n\nAffichage d'un tableau qui contient la somme des deux précédents tableaux: ");
		for (int i=0; i<arraySum.length; i++) {
			System.out.print(arraySum[i] + " ");
		}
	}
}
