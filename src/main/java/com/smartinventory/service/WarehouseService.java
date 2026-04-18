package com.smartinventory.service;

import java.util.List;
import com.smartinventory.entity.Warehouse;

public interface WarehouseService {

    void saveWarehouse(Warehouse warehouse);

    void updateWarehouse(Warehouse warehouse);

    void deleteWarehouse(int id);

    Warehouse getWarehouseById(int id);

    List<Warehouse> getAllWarehouses();
    
}