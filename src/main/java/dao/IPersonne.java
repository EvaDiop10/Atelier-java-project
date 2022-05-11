package dao;

import java.sql.ResultSet;
import java.util.List;

import org.main.web.servlet.Personne;

public interface IPersonne {
	
	public List<Personne> afficher();
	public int inserer(Personne personne);
	public int modifier(int id);
	public int supprimer(int id);
	public Personne getPersonneById(int id);
}
