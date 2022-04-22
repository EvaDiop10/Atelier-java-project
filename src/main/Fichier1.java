package main;



import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Fichier1{
	private String produit;
	
	public String getProduit() {
		return produit;
	}

	public void setProduit(String produit) {
		this.produit = produit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	try {
//	File monFichier = new File("listeProduit.txt");		
//		if(monFichier.createNewFile()) {
//			System.out.println("Fichier creer: "+monFichier.getName());
//	
//		} 
//		else {
//			System.out.println("Le fichier existe déja !");}
//		
//		} 
//		catch(IOException e){
//			System.out.println("Une erreur s'est produite");
//			e.printStackTrace();
//			}
	try {
		FileWriter mesEcri = new FileWriter("listeProduit.txt");
		mesEcri.write("hello\n");
		mesEcri.write("Banane\n");
		mesEcri.write("Pompe\n");
		mesEcri.write("Gel\n");
		
		System.out.println("Ajoutez un produit: ");
		Scanner monProduit = new Scanner(System.in);
		String produit;
		produit = monProduit.next();
		mesEcri.write(produit+"\n");
		mesEcri.close();
		System.out.println("Produit ajouter avec succes !");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("une erreur s'est produite");
			e.printStackTrace();
		}
	}
		
		
}


