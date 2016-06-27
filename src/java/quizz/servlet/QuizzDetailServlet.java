/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quizz.entity.Question;
import quizz.service.QuestionService;

/**
 *
 * @author admin
 */
@WebServlet(name = "QuizzDetailService", urlPatterns = {"/details_quizz"})
public class QuizzDetailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long idQuizz = Long.parseLong(req.getParameter("id_quizz"));
        
        req.getSession().setAttribute("quizzid", idQuizz);
        
        List <Question> questionsDuQuizz = new QuestionService().lister(idQuizz);
        
        
        
        req.setAttribute("questionsDuQuizz", questionsDuQuizz);
        req.getRequestDispatcher("questions_liste.jsp").forward(req, resp);
    }


}
