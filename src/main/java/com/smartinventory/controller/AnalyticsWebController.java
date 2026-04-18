package com.smartinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smartinventory.service.AnalyticsService;
import com.smartinventory.service.InvoiceService;
import com.smartinventory.service.ProductService;
import com.smartinventory.entity.Product;
import com.smartinventory.entity.SalesReport;

@Controller
public class AnalyticsWebController {

    @Autowired
    private AnalyticsService analyticsService;
    @Autowired
    private InvoiceService invoiceService;
    @Autowired
    private ProductService productService;

    // Dashboard Page
    @GetMapping("/analytics/dashboard")
    public String dashboard(Model model) {

        Long totalProducts = analyticsService.getTotalProducts();
        Long totalOrders = analyticsService.getTotalOrders();
        double totalRevenue = analyticsService.getTotalRevenue();

        model.addAttribute("totalProducts", totalProducts);
        model.addAttribute("totalOrders", totalOrders);
        model.addAttribute("totalRevenue", totalRevenue);

        return "analytics-dashboard";
    }

    // Low Stock Products
    @GetMapping("/analytics/low-stock")
    public String lowStockProducts(Model model) {

        List<Product> lowStockProducts = analyticsService.getLowStockProducts();

        model.addAttribute("products", lowStockProducts);

        return "low-stock";
    }
    @GetMapping("/analytics")
    public String showAnalyticsPage(Model model) {

        model.addAttribute("totalRevenue", invoiceService.getTotalRevenue());
        model.addAttribute("totalInvoices", invoiceService.getInvoiceCount());
        model.addAttribute("totalProducts", productService.getProductCount());
        model.addAttribute("lowStock", productService.getLowStockCount());

        return "analytics";
    }

    // Monthly Sales Report
    @GetMapping("/analytics/monthly-sales")
    public String monthlySales(Model model) {

        List<Object[]> salesReports = analyticsService.getMonthlySalesReport();

        model.addAttribute("reports", salesReports);

        return "monthly-sales";
    }

}