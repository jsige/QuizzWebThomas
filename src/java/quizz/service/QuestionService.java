/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz.service;

import java.util.List;
import quizz.dao.QuestionDAO;
import quizz.entity.Question;

/**
 *
 * @author admin
 */
public class QuestionService {

    public List <Question> lister(Long idQuizz) {
        QuestionDAO dao = new QuestionDAO();
        
        return dao.rechercherParIdQuizz(idQuizz);
        
    }

    public void ajouterQuestion(Question questAAjouter) {
        
        QuestionDAO dao = new QuestionDAO();
        
        dao.ajouter(questAAjouter);
        
    }
    
    
    
}
