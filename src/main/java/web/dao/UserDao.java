package web.dao;

import web.model.User;

import javax.persistence.TypedQuery;
import java.util.List;

public interface UserDao {
    List<User> getUsers();
    User getUser(int id);
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
}
