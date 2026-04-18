package com.smartinventory.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartinventory.dao.ProductDAO;
import com.smartinventory.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    // Save product
    @Override
    public void saveProduct(Product product) {

        Session session = sessionFactory.getCurrentSession();

        session.save(product);
    }

    // Update product
    @Override
    public void updateProduct(Product product) {

        Session session = sessionFactory.getCurrentSession();

        session.update(product);
    }

    // Delete product
    @Override
    public void deleteProduct(long id) {
        Session session = sessionFactory.getCurrentSession();

        // Step 1: delete invoices using this product
        session.createQuery("DELETE FROM Invoice WHERE product.id = :pid")
               .setParameter("pid", id)
               .executeUpdate();

        // Step 2: delete product
        Product product = session.get(Product.class, id);
        session.delete(product);
    }

    // Get product by ID
    @Override
    public Product getProductById(int id) {

        Session session = sessionFactory.getCurrentSession();

        return session.get(Product.class, id);
    }

    // Get all products
    @Override
    public List<Product> getAllProducts() {

        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from Product", Product.class).list();
    }
    @Override
    public long getProductCount() {
    	return (long)sessionFactory.getCurrentSession().createQuery("select count(p.id) from Product p").uniqueResult();
    }
    @Override
    public long getLowStockCount() {
    	Long count=(long)sessionFactory.getCurrentSession().createQuery("select count(p.id) from Product p where p.stock<10").uniqueResult();
    	return count!=null ? count : 0;
    }
}