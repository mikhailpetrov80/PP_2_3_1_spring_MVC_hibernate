package springsourse.dao;

import springsourse.model.User;

import java.util.List;

public interface UserDao {

    List<User> getListUsers();

    void addUser(User user);

    User getUserId(long id);

    void deleteUserId(long id);

    void updateUser(User user);
}
