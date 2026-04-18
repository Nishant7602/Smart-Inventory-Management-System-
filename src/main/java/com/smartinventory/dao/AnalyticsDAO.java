package com.smartinventory.dao;

import java.util.List;

import com.smartinventory.entity.Product;

public interface AnalyticsDAO {

    Long countProducts();

    Long countSuppliers();

    Long countOrders();

    Double totalSales();
    Long getTotalProducts();

    List<Object[]> getMonthlySalesReport();
    
    List<Product> getLowStockProducts();
    Long getTotalOrders();
    double getTotalRevenue(); 
}