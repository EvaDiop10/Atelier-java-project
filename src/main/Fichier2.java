package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichier2 {

	public static void main(String[] args) {
		System.out.println("La liste des produits :");
		try {
			File myFile = new File("listeProduit.txt");
			Scanner myReader = new Scanner(myFile);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();	
		} catch(FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Fichier non trouvé");
			e.printStackTrace();
		}
	}
}
