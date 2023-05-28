package pl.llasso.dao;

import org.springframework.stereotype.Repository;
import pl.llasso.entities.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Repository
public class ArticleDao {
    @PersistenceContext
    EntityManager entityManager;

    public void saveArticle(Article article) {
        entityManager.persist(article);
    }

//    public Article findArticleById(long id) {
//        return entityManager.find(Article.class, id);
//    }

    public void updateArticle(Article article) {
        entityManager.merge(article);
    }

    public void deleteArticle(Article article) {
        entityManager.remove(entityManager.contains(article) ?
                article : entityManager.merge(article)); }

}
