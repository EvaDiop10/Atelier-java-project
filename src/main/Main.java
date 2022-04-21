package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tableau> nombres = new ArrayList<Tableau>();
		int sum =0;
		System.out.println("Vous voulez saisir combien de nombre?");
		Scanner myNum = new Scanner(System.in);
		int nombreSaisi;
		nombreSaisi = myNum.nextInt();
		
		for(int i=0;i<nombreSaisi;i++) {
			Tableau tableau = new Tableau();
			tableau.saisir();
			sum+=tableau.getNombre();
			nombres.add(tableau);
			
		}
		
		System.out.println("la moyenne est : "+sum/nombres.size());
		
		for(Tableau tab: nombres) {
			tab.afficher();
		}
		System.out.println("La somme est : "+sum);
	}

}
