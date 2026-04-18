package com.smartinventory.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartinventory.dao.BillingDAO;
import com.smartinventory.entity.Billing;
import com.smartinventory.entity.SalesOrder;

@Repository
public class BillingDAOImpl implements BillingDAO {

    @Autowired
    private SessionFactory sessionFactory;

    // Save Order
    @Override
    public void saveOrder(Billing billing) {

        Session session = sessionFactory.getCurrentSession();
        session.save(billing);
    }

    // Get Order by ID
    @Override
    public SalesOrder getOrderById(int id) {

        Session session = sessionFactory.getCurrentSession();
        return session.get(SalesOrder.class, id);
    }

    // Get All Orders
    @Override
    public List<SalesOrder> getAllOrders() {

        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from SalesOrder", SalesOrder.class).list();
    }

    // Delete Order
    @Override
    public void deleteBilling(int id) {

        Session session = sessionFactory.getCurrentSession();

        Billing bill = session.get(Billing.class, id);

        if (bill != null) {
            session.delete(bill);
        }
    }
    @Override
    public List<Billing> getAllBillings(){
    	return sessionFactory.getCurrentSession().createQuery("from Billing",Billing.class).getResultList();
    }
    @Override
    public Billing getBillingById(int id) {
        return sessionFactory.getCurrentSession().get(Billing.class, id);
    }
    @Override
    public void saveOrUpdate(Billing bill) {
        sessionFactory.getCurrentSession().saveOrUpdate(bill);
    }
}