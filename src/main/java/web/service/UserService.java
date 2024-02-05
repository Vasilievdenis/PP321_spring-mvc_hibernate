package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import javax.persistence.TypedQuery;

public interface UserService {
    TypedQuery<User> getUsers();
    User getUser(int id);
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
}
