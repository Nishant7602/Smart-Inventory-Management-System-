package com.smartinventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartinventory.dao.AnalyticsDAO;
import com.smartinventory.entity.Product;
import com.smartinventory.service.AnalyticsService;

@Service
@Transactional
public class AnalyticsServiceImpl implements AnalyticsService {

    @Autowired
    private AnalyticsDAO analyticsDAO;

    public Long countProducts() {
        return analyticsDAO.countProducts();
    }

    public Long countSuppliers() {
        return analyticsDAO.countSuppliers();
    }
    
    public double getTotalRevenue() {
        return analyticsDAO.getTotalRevenue();
    }

    public Long countOrders() {
        return analyticsDAO.countOrders();
    }
    
    public Long getTotalProducts() {
        return analyticsDAO.getTotalProducts();
    }

    public Double totalSales() {
        return analyticsDAO.totalSales();
    }
    
    public long getTotalOrders() {
        return analyticsDAO.getTotalOrders();
    }
  
    public List<Product> getLowStockProducts() {
        return analyticsDAO.getLowStockProducts();   // delegate to DAO
    }
    public List<Object[]> getMonthlySalesReport() {
        return analyticsDAO.getMonthlySalesReport();
    }
}