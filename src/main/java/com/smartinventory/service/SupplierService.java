package com.smartinventory.service;

import java.util.List;
import com.smartinventory.entity.Supplier;

public interface SupplierService {

    void saveSupplier(Supplier supplier);

    List<Supplier> getAllSuppliers();

    Supplier getSupplierById(int id);

    void deleteSupplier(int id);
}