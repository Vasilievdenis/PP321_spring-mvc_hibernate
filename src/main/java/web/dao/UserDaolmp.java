package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


@Repository
public class UserDaolmp implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public TypedQuery<User> getUsers() {
        return entityManager.createQuery("from User", User.class);
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);

    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);

    }

    @Override
    public void removeUser(int id) {
        entityManager.remove(getUser(id));

    }
}
