package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichier3 {

public static void main(String[] args) {
	try {
		File monFichier = new File("ChoixUser.txt");		
		if(monFichier.createNewFile()) {
			System.out.println("Fichier creer: "+monFichier.getName());
		
		} 
		else {
			System.out.println("Le fichier existe déja !");}
		
		} 
	catch(IOException e){
			System.out.println("Une erreur s'est produite");
			e.printStackTrace();
		}
	System.out.println("1.Ajouter la liste des produits pour mes courses");
	System.out.println("2.Voir la liste des produits pour ma prochaine course au marché ");
	
	Scanner mychoice = new Scanner(System.in);
	System.out.println("Faite votre choix");
	int choice;
	choice =mychoice.nextInt();
	
	
		if(choice==1) {
			try {
				FileWriter mesEcri = new FileWriter("ChoixUser.txt");
				System.out.println("Combien de produit voulez vous ajouter ? ");
				Scanner monProduit = new Scanner(System.in);
				int produit;
				produit = monProduit.nextInt();
				
				System.out.println("Ajoutez un produit: ");
				for(int i=0;i<produit;i++) {
					String produits;
					produits = monProduit.next();
					mesEcri.write(produits+"\n");
				}
				mesEcri.close();
				System.out.println("Produit ajouter avec succes !");
				}
				catch (IOException e) {
					// TODO: handle exception
					System.out.println("une erreur s'est produite");
					e.printStackTrace();
				}
		}
		else {
			System.out.println("La liste des produits :");
			try {
				File myFile = new File("ChoixUser.txt");
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
}
