package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		int[] array = {6, 1, 2, 6};
		
		boolean bool = true;
		if (array.length < 1 || array[0] != array[array.length-1]) {
			bool = false;
		}

	}

}
