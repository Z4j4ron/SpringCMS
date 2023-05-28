package pl.llasso.dao;

import org.springframework.stereotype.Repository;
import pl.llasso.entities.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AuthorDao {
    @PersistenceContext
    EntityManager entityManager;

    public void saveAuthor(Author author) {
        entityManager.persist(author);
    }

//    public Author findAuthorById(long id) {
//        return entityManager.find(Author.class, id);
//    }

    public void updateAuthor(Author author) {
        entityManager.merge(author);
    }

    public void deleteAuthor(Author author) {
        entityManager.remove(entityManager.contains(author) ?
                author : entityManager.merge(author)); }
}
