package main;

import java.util.ArrayList;

public class Collection1 {
	
	public static void main(String[] args) {
		ArrayList<String> livre = new ArrayList<String>();
		livre.add("Les contes d'amadou coumba");
		livre.add("Leuk et lievre");
		livre.add("La femme panthère");
		System.out.println(livre);
		
		int nombreLivre = 0;
		do {
			Collection2 newlivre = new Collection2();
			System.out.println("Veuillez ajouter un livre");
			newlivre.ajouter();
			livre.add(newlivre.getNom());
			nombreLivre++;
		}
		while(nombreLivre<3);
		System.out.println(livre);
		
		System.out.println("le livre est :"+livre.get(2));
		
		livre.remove(5);
		System.out.println(livre);
		
	}
	


}
