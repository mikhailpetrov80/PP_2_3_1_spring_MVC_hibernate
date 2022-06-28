package springsourse.dao;

import springsourse.models.User;

import java.util.List;

public interface UserDao {

    List<User> listUsers();

    void addUser(User user);

    User getUserId(long id);
}
