package springsourse.dao;

import org.springframework.stereotype.Repository;
import springsourse.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager manager;

    public List<User> listUsers() {
        return manager.createQuery("from User", User.class).getResultList();
    }

    public void addUser(User user) {
        manager.persist(user);
    }

    @Override
    public User getUserId(long id) {
        return manager.find(User.class, id);
    }
}
