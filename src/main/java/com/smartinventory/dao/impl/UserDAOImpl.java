package com.smartinventory.dao.impl;

import com.smartinventory.dao.UserDAO;
import com.smartinventory.entity.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findByUsernameAndPassword(String username, String password) {

        String hql = "FROM User WHERE username = :username AND password = :password";

        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("username", username);
        query.setParameter("password", password);

        List<User> list = query.getResultList();

        return list.isEmpty() ? null : list.get(0);
    }
    @Override
    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM User", User.class).getResultList();
    }
    @Override
    public User getUserById(Long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().merge(user);
    }
    @Override
    public void deleteUser(Long id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);

        if (user != null) {
            session.delete(user);
        }
    }
    @Override
    public void saveUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}