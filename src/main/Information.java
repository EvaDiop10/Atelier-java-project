package main;

import java.util.Scanner;

public class Information implements InterfaceInformation  {
	private int nombre ;
    private String nom ;
    private String prenom ;
    private String adresse ;
    private String lieu ;
    private int telephone  ;
    private String date_naissance ;
   
	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	@Override
	public void saisir() {
		// TODO Auto-generated method stub
		Scanner monIdentif = new Scanner(System.in);
		System.out.println("Saissisez votre nom ");
        this.setNom(monIdentif.next()) ;
        
        System.out.println("Saissisez votre prénom");
        this.setPrenom(monIdentif.next()) ;
        
        System.out.println("Saissisez votre adresse");
        this.setAdresse(monIdentif.next()); 
        
        System.out.println("Saissisez votre Lieu de naissance");
        this.setLieu(monIdentif.next()); 
        
        System.out.println("Saissisez votre numero de téléphone ");
        this.setTelephone(monIdentif.nextInt()); 
        
        System.out.println("Saissisez votre date de naissance ");
        this.setDate_naissance(monIdentif.next());
    
		
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("Nom : "+this.getNom());
		System.out.println("Prenom : "+this.getPrenom());
		System.out.println("Adresse : "+this.getAdresse());
		System.out.println("Télephone : "+this.getTelephone());
		System.out.println("Date de naissance : "+this.getDate_naissance());
		System.out.println("lieu de naissance : "+this.getLieu());
		

	}
	
}
