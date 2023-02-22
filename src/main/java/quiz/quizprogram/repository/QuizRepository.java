package quiz.quizprogram.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import quiz.quizprogram.entity.QuizAnswer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class QuizRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(QuizAnswer questionAnswer){
        em.persist(questionAnswer);
    }

    public List<QuizAnswer> findAll(){
        return em.createQuery("select q from QuizAnswer q")
                .getResultList();
    }
}
