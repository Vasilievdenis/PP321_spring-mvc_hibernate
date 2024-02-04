package web.dao;

import web.model.User;

import javax.persistence.TypedQuery;

public interface UserDao {
    TypedQuery<User> getUsers();
    User getUser(int id);
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
}
