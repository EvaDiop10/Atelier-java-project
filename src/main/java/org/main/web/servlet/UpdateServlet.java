package org.main.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/Update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Personne DPersonne = new Personne();
		
		 int id =Integer.parseInt(request.getParameter("id"));
		 DPersonne = DPersonne.getPersonneById(id);
		 
//		 String prenom = request.getParameter("prenom");
//		 String poste = request.getParameter("poste");
//		 int age =Integer.parseInt(request.getParameter("age")) ;
//		 DPersonne.setNom(nom);
//		 DPersonne.setPrenom(prenom);
//		 DPersonne.setPoste(poste);
//		 DPersonne.setAge(age);
//		 
//		 int idRemove =Integer.parseInt( request.getParameter("id"));
//		 DPersonne.modifier(idRemove);
		 request.setAttribute("UpdateP", DPersonne);
		 request.getRequestDispatcher("Update.jsp").forward(request, response);
		 response.sendRedirect(request.getContextPath()+"/Hello");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Personne employe = new Personne();
		int id = Integer.parseInt(request.getParameter("id"));
		 String nom = request.getParameter("nom");
		 String prenom = request.getParameter("prenom");
		 String poste = request.getParameter("poste");
		 int age =Integer.parseInt(request.getParameter("age")) ;
		 employe.setNom(nom);
		 employe.setPrenom(prenom);
		 employe.setPoste(poste);
		 employe.setAge(age);
		 
		 employe.modifier(id);
		 response.sendRedirect(request.getContextPath()+"/Hello");
		
	}

}
