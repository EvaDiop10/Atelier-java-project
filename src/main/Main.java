package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner maReponse = new Scanner(System.in);
		ArrayList<Information> informations = new ArrayList<Information>();
		
		boolean reponse;
		do {
			System.out.println("Combien d'utilisateurs voulez vous saissir ?");
			int size = maReponse.nextInt();
			int i = 0;
			while(i<size) {
				Information identifiant = new Information();
				identifiant.saisir();
				informations.add(identifiant);
				i++;
			}
			
			for(Information info : informations) {
				info.afficher();
			}
		System.out.println("Voulez vous contiuer la saisi true/false ?");
		reponse= maReponse.nextBoolean();
		}
		while(reponse);
		
	}

}
