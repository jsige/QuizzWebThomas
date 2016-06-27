/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz.service;

import java.util.List;
import quizz.dao.QuizzDAO;
import quizz.entity.Quizz;

/**
 *
 * @author admin
 */
public class QuizzService {

    public List<Quizz> lister() {
        QuizzDAO dao = new QuizzDAO();
        
        return dao.rechercherTout();
        
    }

    public Quizz listerParId(Long id) {
        QuizzDAO dao = new QuizzDAO();
        
        return dao.rechercherParId(id);
        
    }
    public void ajouterQuizz(Quizz quizzAAjouter) {
        QuizzDAO dao = new QuizzDAO();
        
        dao.ajouter(quizzAAjouter);
    }

       
}
