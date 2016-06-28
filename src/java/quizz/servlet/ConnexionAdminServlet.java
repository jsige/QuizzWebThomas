/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "ConnexioAdminServlet", urlPatterns = {"/connexion"})
public class ConnexionAdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("connexion.jsp").forward(req, resp);
    }
    
    @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getSession().removeAttribute("role");
        String login = req.getParameter("login");
        String mdp = req.getParameter("mdp");
        
        if(login.equals("admin") && mdp.equals("admin")){
            req.getSession().setAttribute("role", "admin");
            
            resp.sendRedirect("liste_quizzes");
        }
        else{
            resp.sendRedirect("accueil");
        }
     }
}
