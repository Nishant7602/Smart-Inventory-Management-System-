package com.smartinventory.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartinventory.dao.AnalyticsDAO;
import com.smartinventory.entity.Product;

@Repository
public class AnalyticsDAOImpl implements AnalyticsDAO {

    @Autowired
    private SessionFactory sessionFactory;

   
    public Long countProducts() {

        Session session = sessionFactory.getCurrentSession();

        return session.createQuery(
                "select count(p.id) from Product p", Long.class)
                .getSingleResult();
    }

    
    public Long countSuppliers() {

        Session session = sessionFactory.getCurrentSession();

        return session.createQuery(
                "select count(s.id) from Supplier s", Long.class)
                .getSingleResult();
    }
    
    public Long getTotalProducts() {
        String hql = "SELECT COUNT(p) FROM Product p";
        return (Long) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
    }
    
    @Override
    public double getTotalRevenue() {
        String hql = "SELECT SUM(o.totalAmount) FROM SalesOrder o";
        Double result = (Double) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
        return result != null ? result : 0.0;
    }
    public Long countOrders() {

        Session session = sessionFactory.getCurrentSession();

        return session.createQuery(
                "select count(o.id) from SalesOrder o", Long.class)
                .getSingleResult();
    }
    
    public List<Product> getLowStockProducts1() {
        String hql = "FROM Product p WHERE p.stockQuantity <= :threshold";
        return sessionFactory.getCurrentSession()
                             .createQuery(hql, Product.class)
                             .setParameter("threshold", 10)
                             .getResultList();
    }
    public Long getTotalOrders() {
        return (Long) sessionFactory.getCurrentSession()
            .createQuery("select count(b.id) from Billing b")
            .uniqueResult();
    }
    public Double totalSales() {

        Session session = sessionFactory.getCurrentSession();

        Double result = session.createQuery(
                "select sum(o.totalAmount) from SalesOrder o", Double.class)
                .getSingleResult();

        if(result == null) {
            result = 0.0;
        }

        return result;
    }
    
    public List<Product> getLowStockProducts() {
        String hql = "FROM Product p WHERE p.stock <= 5";  // example threshold
        return sessionFactory.getCurrentSession().createQuery(hql, Product.class).list();
    }
    public List<Object[]> getMonthlySalesReport() {
        String hql = "SELECT MONTH(o.orderDate), SUM(o.totalAmount) FROM Order o GROUP BY MONTH(o.orderDate)";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    // Monthly sales report
    
   
}