package com.smartinventory.dao;

import java.util.List;
import com.smartinventory.entity.Warehouse;

public interface WarehouseDAO {

    void saveWarehouse(Warehouse warehouse);

    void updateWarehouse(Warehouse warehouse);

    void deleteWarehouse(int id);

    Warehouse getWarehouseById(int id);

    List<Warehouse> getAllWarehouses();
}