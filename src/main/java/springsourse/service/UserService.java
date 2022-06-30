package springsourse.service;

import springsourse.models.User;

import java.util.List;

public interface UserService {

    List<User> listUsers();

    void addUser(User user);

    User getUserId(long id);

    void deleteUserId(long id);

    void updateUser(User user);
}
