package com.smartinventory.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartinventory.dao.WarehouseDAO;
import com.smartinventory.entity.Warehouse;

@Repository
public class WarehouseDAOImpl implements WarehouseDAO {

    @Autowired
    private SessionFactory sessionFactory;

    // Save Warehouse
    public void saveWarehouse(Warehouse warehouse) {

        Session session = sessionFactory.getCurrentSession();

        session.save(warehouse);
    }

    // Update Warehouse
    public void updateWarehouse(Warehouse warehouse) {

        Session session = sessionFactory.getCurrentSession();

        session.update(warehouse);
    }

    // Delete Warehouse
    public void deleteWarehouse(int id) {

        Session session = sessionFactory.getCurrentSession();

        Warehouse warehouse = session.get(Warehouse.class, id);

        if (warehouse != null) {
            session.delete(warehouse);
        }
    }

    // Get Warehouse By ID
    public Warehouse getWarehouseById(int id) {

        Session session = sessionFactory.getCurrentSession();

        return session.get(Warehouse.class, id);
    }

    // Get All Warehouses
    public List<Warehouse> getAllWarehouses() {

        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from Warehouse", Warehouse.class).list();
    }
}