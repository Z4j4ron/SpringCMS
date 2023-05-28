package pl.llasso.dao;

import org.springframework.stereotype.Repository;
import pl.llasso.entities.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CategoryDao {
    @PersistenceContext
    EntityManager entityManager;

    public void saveCategory(Category category) {
        entityManager.persist(category);
    }

//    public Category findById(long id) {
//        return entityManager.find(Category.class, id);
//    }

    public void updateCategory(Category category) {
        entityManager.merge(category);
    }

    public void deleteCategory(Category category) {
        entityManager.remove(entityManager.contains(category) ?
                category : entityManager.merge(category)); }
}
