/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz.service;

import java.util.Iterator;
import java.util.List;
import quizz.dao.QuestionDAO;
import quizz.entity.Question;

/**
 *
 * @author admin
 */
public class QuestionService {

    public List <Question> rechercherParQuizzId(Long idQuizz) {
        QuestionDAO dao = new QuestionDAO();
        
        return dao.rechercherParIdQuizz(idQuizz);
        
    }

    public void ajouterQuestion(Question questAAjouter) {
        
        QuestionDAO dao = new QuestionDAO();
        
        dao.ajouter(questAAjouter);
        
    }

    public Question questionSuivante(Long idQuizz, Integer ordre, Integer score, Byte repChoisie, Integer nbQuestRep) {
        QuestionDAO dao = new QuestionDAO();
        
        Long nbQuestTotalQuizz = dao.recupererNbQuestionsSurOrdre(idQuizz, ordre);
        System.out.println("====================>>>>>" + nbQuestTotalQuizz);
        
        // si nb Questions vide alors Exception
        if(nbQuestTotalQuizz==0){
            throw new RuntimeException(); //(Quizz vide!!)
        }
        
        Byte bonneRep = dao.rechercherParIdQuizzEtIdQuestion(idQuizz,)
        if(repChoisie!=null){
            if(repChoisie==questionSuiv.)
        }
        List<Question> questionQuizz = dao.recupererQuestionsParIdQuizzEtOrdre(idQuizz, ordre);
        
        Question questionSuiv = questionQuizz.get(0);
        
        
        //Iterator qIt = new questionQuizz.iterator();
        return questionSuiv;
        
        
    }

    
    
    
}
