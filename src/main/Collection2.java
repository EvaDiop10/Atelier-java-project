package main;

import java.util.Scanner;

public class Collection2 implements InterfaceCollection {
	private String nom;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static void main(String[] args) {
		
		
	}

	@Override
	public void ajouter() {
		// TODO Auto-generated method stub
		Scanner monNom = new Scanner(System.in);
		nom = monNom.nextLine();
	}

	@Override
	public void recuperer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimmer() {
		// TODO Auto-generated method stub
		
	}
}
