/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import quizz.entity.Question;

/**
 *
 * @author admin
 */
public class QuestionDAO {

    public List<Question> rechercherParIdQuizz(Long idQuizz) {
        
        EntityManager em = Persistence.createEntityManagerFactory("QuizzWebPU").createEntityManager();
        
        
        return em.createQuery("SELECT q FROM Question q WHERE q.quizz.id=:quizznum ORDER BY q.ordre").setParameter("quizznum", idQuizz).getResultList();
        
        //return em.createQuery("SELECT q FROM Question q").getResultList();
    }

    public void ajouter(Question questAAjouter) {
        
        EntityManager em = Persistence.createEntityManagerFactory("QuizzWebPU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(questAAjouter);
        
        em.getTransaction().commit();
    }

    
    public List<Question> recupererQuestionsParIdQuizzEtOrdre(Long id, Integer ordre) {
        
        EntityManager em = Persistence.createEntityManagerFactory("QuizzWebPU").createEntityManager();
        
              
        return em.createQuery("SELECT q FROM Question q WHERE q.quizz.id=:quizznum AND q.ordre >:ordreDerQ ORDER BY q.ordre")
                .setParameter("quizznum", id)
                .setParameter("ordreDerQ", ordre)
                .getResultList();
    }

    public Long recupererNbQuestionsSurOrdre(Long id, Integer ordre) {
        EntityManager em = Persistence.createEntityManagerFactory("QuizzWebPU").createEntityManager();
        return (Long) em.createQuery("SELECT COUNT (q) FROM Question q WHERE q.quizz.id=:quizznum AND q.ordre >:ordreDerQ")
                .setParameter("quizznum", id)
                .setParameter("ordreDerQ", ordre)
                .getSingleResult();
    }
    
    public List<Question> rechercherParIdQuizzEtIdQuestion(Long idQuizz) {
        
        EntityManager em = Persistence.createEntityManagerFactory("QuizzWebPU").createEntityManager();
        
        
        return em.createQuery("SELECT q FROM Question q WHERE q.quizz.id=:quizznum ORDER BY q.ordre").setParameter("quizznum", idQuizz).getResultList();
        
        //return em.createQuery("SELECT q FROM Question q").getResultList();
    }
    
}
