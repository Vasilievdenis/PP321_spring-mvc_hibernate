package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UseServicelmp implements UserService {
    public UserDao userDao;


    @Autowired
    public UseServicelmp(UserDao userDao) {

        this.userDao = userDao;
    }

    @Transactional
    @Override
    public List<User> getUsers() {
        return (List<User>) userDao.getUsers();
    }

    @Transactional
    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);

    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);

    }

    @Transactional
    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);

    }
}
