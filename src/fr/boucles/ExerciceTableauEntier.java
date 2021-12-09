package fr.boucles;

public class ExerciceTableauEntier {
	public static void main(String[] args) {
		int [] tabInt1to10 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Premier élément du tableau : " + tabInt1to10[0]);
		System.out.println("Taille du tableau : " + tabInt1to10.length);
		System.out.println("Dernier élément du tableau (avec length): " + tabInt1to10[tabInt1to10.length-1]);
		tabInt1to10[4] = 8;
	}
}
