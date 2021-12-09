package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
		
		int array1Length = array1.length;
		int array2Length = array2.length;
		
		System.out.println("Affichage du premier tableau :");
		for (int i=0; i<array1Length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println("\n\nAffichage du deuxième tableau :");
		for (int i=0; i<array2Length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		int[] arraySum = new int [array1Length];

		for (int i=0; i<array2Length; i++) {
			arraySum[i] = array1[i] + array2[i];
		}
		for (int i=array2Length; i<array1Length; i++) {
			arraySum[i] = array1[i];
		}
		
		System.out.println("\n\nAffichage d'un tableau qui contient la somme des deux précédents tableaux :");
		for (int i=0; i<arraySum.length; i++) {
			System.out.print(arraySum[i] + " ");
		}
	}
}
