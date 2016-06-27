/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import quizz.entity.Quizz;

/**
 *
 * @author admin
 */
public class QuizzDAO {

    public List<Quizz> rechercherTout() {
       
        EntityManager em = Persistence.createEntityManagerFactory("QuizzWebPU").createEntityManager();
        
        return em.createQuery("SELECT q FROM Quizz q").getResultList();
    }

    public void ajouter(Quizz quizzAAjouter) {
        EntityManager em = Persistence.createEntityManagerFactory("QuizzWebPU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(quizzAAjouter);
        
        em.getTransaction().commit();
    }

    public Quizz rechercherParId(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("QuizzWebPU").createEntityManager();
        
        //return (Quizz)(em.createQuery("SELECT q FROM Quizz q WHERE q.id=:idQ").setParameter("idQ", id).getSingleResult());
        
        return (Quizz) em.createQuery("SELECT q FROM Quizz q WHERE q.id=:idQ").setParameter("idQ", id).getSingleResult();
    }
    
}
