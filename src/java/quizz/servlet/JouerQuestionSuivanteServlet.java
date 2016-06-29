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
import quizz.entity.Question;
import quizz.entity.Quizz;
import quizz.service.QuestionService;
import quizz.service.QuizzService;

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
       QuizzService quizzService = new QuizzService();
       Quizz infosQuizz = quizzService.listerParId((Long)req.getSession().getAttribute("quizzid"));
       req.setAttribute("titreQuizz", infosQuizz.getTitre());
       req.setAttribute("tailleQuizz", infosQuizz.getQuestions().size());
       req.getSession().setAttribute("numQuest",1);
       
       QuestionService qs =  new QuestionService();
       Question questionSuiv = qs.questionSuivante(
               (Long)req.getSession().getAttribute("quizzid"),
               (Integer)req.getSession().getAttribute("ordreSessionAct"),
               (Integer)req.getSession().getAttribute("score"),
               (Byte)req.getAttribute("repchoisie"),
               (Integer)req.getSession().getAttribute("nbQuestRep"));
       
       System.out.println("##############################>>>" + questionSuiv.getTitre());
       req.setAttribute("qsuiv", questionSuiv);
       
        
       req.getRequestDispatcher("jouer.jsp").forward(req, resp);
      // resp.sendRedirect("jouer.jsp");
      
    }
}
