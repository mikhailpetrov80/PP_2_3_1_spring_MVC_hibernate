package springsourse.dao;

import org.springframework.stereotype.Repository;
import springsourse.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getListUsers() {
        return entityManager.createQuery("from User").getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUserId(long id) {

        return entityManager.createQuery("from User user where user.id = :id", User.class)
                .setParameter("id", id).getSingleResult();
    }

    @Override
    public void deleteUserId(long id) {
        entityManager.remove(getUserId(id));
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }
}
