package com.smartinventory.service;
import java.util.List;

import com.smartinventory.entity.Product;

public interface AnalyticsService {

    Long countProducts();

    Long countSuppliers();

    Long countOrders();
    long getTotalOrders();
    Double totalSales();
    double getTotalRevenue();

    List<Object[]> getMonthlySalesReport();
    List<Product> getLowStockProducts();
    Long getTotalProducts();

}