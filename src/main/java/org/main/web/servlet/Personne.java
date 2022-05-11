package org.main.web.servlet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

import dao.Database;
import dao.IPersonne;

public class Personne implements IPersonne {
	private int id;
	private String nom;
	private int age;
	private String prenom;
	private String poste;
	private Database connection = new Database();

	public Connection getConnection() {
		return connection.getConnection();
	}

	

	public Personne() {
		super();
	}

	public Personne(String nom, int age, String prenom, String poste, int id) {
		super();
		this.id = id;
		this.nom = nom;
		this.age = age;
		this.prenom = prenom;
		this.poste = poste;
	}
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public List<Personne> afficher() {
		// TODO Auto-generated method stub
		List<Personne> personnes = new ArrayList<Personne>();
		String requete = "SELECT * FROM personnes";
		try {
			Connection connexion = this.getConnection();
			Statement stmt = connexion.createStatement();
			ResultSet resultats = stmt.executeQuery(requete);
			while(resultats.next()) {
			Personne personne = new Personne();
			personne.setId(resultats.getInt(1));
			personne.setNom(resultats.getString(2));
			personne.setPrenom(resultats.getString(3));
			personne.setPoste(resultats.getString(4));
			personne.setAge(resultats.getInt(5));
			
			
			personnes.add(personne);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return personnes;
	}

	@Override
	public int inserer(Personne personne) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement = null;
		try {
			
			Connection connexion = this.getConnection();
			preparedStatement = connexion.prepareStatement("INSERT INTO personnes(nom, prenom, poste, age) VALUES (?,?,?,?)");
			preparedStatement.setString(1, nom);
			preparedStatement.setString(2, prenom);
			preparedStatement.setString(3, poste);
			preparedStatement.setInt(4,age);
			
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int modifier(int id) {
		// TODO Auto-generated method stub
		int resultats;
		Connection connexion = this.getConnection();

		try {
			PreparedStatement preparedStatement = connexion.prepareStatement("UPDATE personnes set nom=?, prenom=?,poste=?,age=? WHERE id=?");
			preparedStatement.setString(1, nom);
			preparedStatement.setString(2, prenom);
			preparedStatement.setString(3, poste);
			preparedStatement.setInt(4,age);
			preparedStatement.setInt(5, id);
			
			resultats = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int supprimer(int id) {
		// TODO Auto-generated method stub
		Connection connexion = this.getConnection();
		int resultats= 0;
		try {
			PreparedStatement prepareStatement = connexion.prepareStatement("DELETE FROM personnes WHERE id=?");
			prepareStatement.setInt(1, id);
			resultats = prepareStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return resultats;
	}



	@Override
	public Personne getPersonneById(int id) {
		// TODO Auto-generated method stub
		Connection connexion = this.getConnection();
		Personne personne = new Personne();
		try {
			PreparedStatement prepareStatement = connexion.prepareStatement("SELECT * FROM personnes WHERE id=?");
			prepareStatement.setInt(1, id);
			ResultSet resultats = prepareStatement.executeQuery();
			while(resultats.next()) {
				personne.setId(resultats.getInt(1));
				personne.setNom(resultats.getString(2));
				personne.setPrenom(resultats.getString(3));
				personne.setPoste(resultats.getString(4));
				personne.setAge(resultats.getInt(5));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return personne;
	}
	
	
}
