package main;

import java.util.Scanner;

public class Tableau implements InterfaceTableau {
	private int nombre;

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	@Override
	public void saisir() {
		// TODO Auto-generated method stub
		Scanner myNum = new Scanner(System.in);
		System.out.println("Saississez un nombre");
		this.setNombre(myNum.nextInt());
		
		
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("Le nombre est : "+getNombre());
	}

	

}
