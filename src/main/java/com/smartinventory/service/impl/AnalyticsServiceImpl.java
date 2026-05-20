package com.smartinventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartinventory.dao.AnalyticsDAO;
import com.smartinventory.entity.Product;
import com.smartinventory.service.AnalyticsService;
import com.smartinventory.service.InvoiceService;
import com.smartinventory.service.UserService;

@Service
@Transactional
public class AnalyticsServiceImpl implements AnalyticsService {

    @Autowired
    private AnalyticsDAO analyticsDAO;
    @Autowired
    private UserService userService;
@Autowired
private InvoiceService invoiceService;
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
    @Override
    public long getTotalUsers() {
        return userService.getAllUsers().size();
    }
    
    @Override
    public long getTotalInvoices() {
        return invoiceService.getTotalInvoices();
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