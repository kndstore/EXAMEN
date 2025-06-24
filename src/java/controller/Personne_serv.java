
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Personne;


@WebServlet(name = "Personne_serv", urlPatterns = {"/Personne_serv"})
public class Personne_serv extends HttpServlet {

       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //int age = Integer.parseInt(request.getParameter("age"));

        Personne P = new Personne();
        String message = P.calculerRest(50);

        request.setAttribute("message", message);
        request.getRequestDispatcher("affiche.jsp").forward(request, response);
         
    
    } 
}
