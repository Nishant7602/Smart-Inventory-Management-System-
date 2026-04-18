package com.smartinventory.dao;

import com.smartinventory.entity.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Category category) {
        sessionFactory.getCurrentSession().save(category);
    }

    public void update(Category category) {
        sessionFactory.getCurrentSession().update(category);
    }

    public void delete(Long id) {
        Category category = sessionFactory.getCurrentSession().get(Category.class, id);
        if (category != null) sessionFactory.getCurrentSession().delete(category);
    }

    public Category findById(Long id) {
        return sessionFactory.getCurrentSession().get(Category.class, id);
    }

    public List<Category> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Category", Category.class)
                .getResultList();
    }
}