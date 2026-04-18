package com.smartinventory.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartinventory.dao.WarehouseDAO;
import com.smartinventory.entity.Warehouse;
import com.smartinventory.service.WarehouseService;

@Service
@Transactional
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseDAO warehouseDAO;

    @Override
    public void saveWarehouse(Warehouse warehouse) {
        warehouseDAO.saveWarehouse(warehouse);
    }
    @Override
    public void updateWarehouse(Warehouse warehouse) {
        warehouseDAO.updateWarehouse(warehouse);
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseDAO.getAllWarehouses();
    }

    @Override
    public Warehouse getWarehouseById(int id) {
        return warehouseDAO.getWarehouseById(id);
    }

    @Override
    public void deleteWarehouse(int id) {
        warehouseDAO.deleteWarehouse(id);
    }
}