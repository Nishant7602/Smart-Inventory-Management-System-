package com.smartinventory.dao;

import java.util.List;
import com.smartinventory.entity.Supplier;

public interface SupplierDAO {

    List<Supplier> getAllSuppliers();

    void saveSupplier(Supplier supplier);

    Supplier getSupplierById(int id);

    void deleteSupplier(int id);
}