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
@WebServlet(name = "QuestionCreerServlet", urlPatterns = {"/question_creer"})
public class QuestionCreerServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("question_creer.jsp").forward(req, resp);
    }
 
    @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        String titre = req.getParameter("titre");
        
        Integer ordre = Integer.parseInt(req.getParameter("ordre"));
        
        Integer numReponse = Integer.parseInt(req.getParameter("bonnerep"));
        
        String r1 = req.getParameter("r1");
        String r2 = req.getParameter("r2");
        String r3 = req.getParameter("r3");
        String r4 = req.getParameter("r4");
        
      
        Question questAAjouter = new Question();
        
        questAAjouter.setTitre(titre);
        
        Long idQuizz = Long.parseLong(req.getSession().getAttribute("quizzid").toString());
        
        //QuizzService QS = new QuizzService();
        
        //String test = req.getSession().getAttribute("quizzid").toString();
        QuizzService quizService = new QuizzService();
        Quizz quizAct = quizService.listerParId(idQuizz);
        questAAjouter.setQuizz(quizAct);
        quizAct.getQuestions().add(questAAjouter);
        //questAAjouter.setQuizz(quizz);
        //req.getSession().getAttribute("quizzid").
        
        
        questAAjouter.setRep1(r1);
        questAAjouter.setRep2(r2);
        questAAjouter.setRep3(r3);
        questAAjouter.setRep4(r4);
        
        questAAjouter.setNumReponseCorrecte(numReponse.byteValue());
        
        new QuestionService().ajouterQuestion(questAAjouter);
        
        resp.sendRedirect("details_quizz");
     }
}
