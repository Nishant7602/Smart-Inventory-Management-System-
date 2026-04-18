package com.smartinventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartinventory.dao.SupplierDAO;
import com.smartinventory.entity.Supplier;
import com.smartinventory.service.SupplierService;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierDAO supplierDAO;

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierDAO.getAllSuppliers();
    }

    @Override
    public void saveSupplier(Supplier supplier) {
        supplierDAO.saveSupplier(supplier);
    }

    @Override
    public Supplier getSupplierById(int id) {
        return supplierDAO.getSupplierById(id);
    }

    @Override
    public void deleteSupplier(int id) {
        supplierDAO.deleteSupplier(id);
    }
}