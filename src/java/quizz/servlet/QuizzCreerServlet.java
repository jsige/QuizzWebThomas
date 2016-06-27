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
import quizz.entity.Quizz;
import quizz.service.QuizzService;

/**
 *
 * @author admin
 */
@WebServlet(name = "QuizzCreerServlet", urlPatterns = {"/quizz_creer"})
public class QuizzCreerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("ajouter_quizz.jsp").forward(req, resp);
    }
    
    @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        String titre = req.getParameter("quizzTitre");
        
        Quizz quizzAAjouter = new Quizz();
        
        quizzAAjouter.setTitre(titre);
        
        new QuizzService().ajouterQuizz(quizzAAjouter);
        
        resp.sendRedirect("liste_quizzes");
     }
}
