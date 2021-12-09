package fr.declaration.variable;

public class DeclarationApp {
	public static void main(String[] args) {
		byte myByte = -127;
		short myShort = -32_768;
		int myInt = -2_147_483_648;
		long myLong = -9_223_372_036_854_775_808L;
		float myFloat = 1.99F;
		double myDouble = 1.999999999999999999999;
		char myChar = 'Z';
		boolean myBoolean = true;
		String myString = "Ceci n'est pas un caractère.";
		
		System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE);
		System.out.println("myString: " + myString);
		
		String randomString = "Voici le résultat d’un calcul : 1+5=6";
		System.out.println(randomString);
		
		randomString = "Voici le résultat d’un calcul :\n1+5=6";
		System.out.println(randomString);
	}
}
