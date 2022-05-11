package org.main.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertionServlet
 */
@WebServlet("/Insertion")
public class InsertionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Insertion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Personne employe = new Personne();
		
		 String nom = request.getParameter("nom");
		 String prenom = request.getParameter("prenom");
		 String poste = request.getParameter("poste");
		 int age =Integer.parseInt(request.getParameter("age")) ;
		 employe.setNom(nom);
		 employe.setPrenom(prenom);
		 employe.setPoste(poste);
		 employe.setAge(age);
		 
		 employe.inserer(employe);
		 response.sendRedirect(request.getContextPath()+"/Hello");
	}

}
