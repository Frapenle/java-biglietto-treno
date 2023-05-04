package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		String[] vipsList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		Scanner userName = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome: ");
		String name = userName.nextLine();
		
		boolean isInList = false;
		
		for (int i = 0; i < vipsList.length; i++) {

			if(name.equals(vipsList[i])) {
				isInList = true;
			}
		}
		if (isInList) {
		System.out.println("Benvenuto/a " + name + " , puoi entrare!");
		userName.close();
		return;
		} else {
			System.out.println("Mi dispiace " + name + " , non puoi entrare.");			
		}
		userName.close();
	}

}