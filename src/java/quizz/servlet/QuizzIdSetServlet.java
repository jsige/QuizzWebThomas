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
@WebServlet(name = "QuizzIdSet", urlPatterns = {"/set_quizz"})
public class QuizzIdSetServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long idQuizz = Long.parseLong(req.getParameter("id_quizz"));
        
        req.getSession().setAttribute("quizzid", idQuizz);
        
        if (req.getSession().getAttribute("role")!=null && req.getSession().getAttribute("role").equals("admin")){
            resp.sendRedirect("details_quizz");
        }
        else{
            req.getSession().setAttribute("ordreSessionAct", 0);
            req.getSession().setAttribute("score",0);
            req.getSession().setAttribute("nbQuestRep",1);
            resp.sendRedirect("questionSuivante");
        }
    }
}
