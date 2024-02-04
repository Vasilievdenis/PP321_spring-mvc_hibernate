package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    List<User> getUsers();
    User getUser(int id);
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
}
