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
import quizz.service.QuestionService;

/**
 *
 * @author admin
 */
@WebServlet(name = "JouerQuestionSuivanteServlet", urlPatterns = {"/questionSuivante"})
public class JouerQuestionSuivanteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       QuestionService qs =  new QuestionService();
       qs.questionSuivante((Integer)req.getSession().getAttribute("quizzid"),(Integer)req.getSession().getAttribute("ordreSessionAct"));
        
        resp.sendRedirect("jouer.jsp");
    }
}
