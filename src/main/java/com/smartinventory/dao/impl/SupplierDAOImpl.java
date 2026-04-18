package com.smartinventory.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartinventory.dao.SupplierDAO;
import com.smartinventory.entity.Supplier;

@Repository
public class SupplierDAOImpl implements SupplierDAO {

    @Autowired
    private SessionFactory sessionFactory;

    // Get all suppliers
    @Override
    public List<Supplier> getAllSuppliers() {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Supplier");

        return query.getResultList();
    }

    // Save supplier
    @Override
    public void saveSupplier(Supplier supplier) {

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(supplier);
    }

    // Get supplier by ID
    @Override
    public Supplier getSupplierById(int id) {

        Session session = sessionFactory.getCurrentSession();

        Supplier supplier = session.get(Supplier.class, id);

        return supplier;
    }

    // Delete supplier
    @Override
    public void deleteSupplier(int id) {

        Session session = sessionFactory.getCurrentSession();

        Supplier supplier = session.get(Supplier.class, id);

        if (supplier != null) {
            session.delete(supplier);
        }
    }
}