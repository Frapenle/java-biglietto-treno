package org.lessons.java;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] favouriteFoods = { "Pizza", "Lasagna", "Ravioli", "Potatoes", "Maialetto", "Pasta"};
		//lunghezza classifica
		System.out.println("List contains " + favouriteFoods.length + " foods");
		
		//first position
		System.out.println("Best food is: " + favouriteFoods[0]);
		
		//last position
		System.out.println("Last favourite food is: " + favouriteFoods[favouriteFoods.length - 1]);
		
		//middle position
		int middle = (favouriteFoods.length - 1) / 2;
		System.out.println("Food in the middle of the list is: " + middle);
	}

}
