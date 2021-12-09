package fr.algorithmie;

public class Rotation {
	
	public static void main(String[] args) {
		
		int[] array1 = {0,1,2,3};
		int[] array2 = new int [array1.length];
		
		array2[0] = array1[array1.length-1];
		for (int i=1; i<array1.length; i++) {
			array2[i] = array1[i-1];
		}	
		System.out.println("Tableau avant rotation :");
		for (int i=0; i<array1.length; i++) {
			System.out.print(array1[i] + " ");
		}		
		System.out.println("\n\nTableau après rotation :");
		for (int i=0; i<array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
	}

}
