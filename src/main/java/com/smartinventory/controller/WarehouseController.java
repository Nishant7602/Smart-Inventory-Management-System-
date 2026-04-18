package com.smartinventory.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.smartinventory.entity.Invoice;
import com.smartinventory.entity.Warehouse;
import com.smartinventory.service.InvoiceService;
import com.smartinventory.service.WarehouseService;

@Controller
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;
    @Autowired
    private InvoiceService invoiceService;

    // List all warehouses
    @GetMapping("/list")
    public String listWarehouses(Model model) {

        List<Warehouse> warehouses = warehouseService.getAllWarehouses();

        model.addAttribute("warehouses", warehouses);

        return "warehouse-list";
    }
    @GetMapping("/invoices/list")
    public String listInvoices(Model model) {

        List<Invoice> invoices = invoiceService.getAllInvoices();

        System.out.println(invoices); // ✅ DEBUG

        model.addAttribute("invoices", invoices); // ✅ VERY IMPORTANT

        return "invoice-list";
    }
    
        @GetMapping("/invoices/add")
        public String showInvoiceForm() {
            return "add-invoice";
        }
    
    // Show add form
    @GetMapping("/add")
    public String showAddForm(Model model) {

        Warehouse warehouse = new Warehouse();

        model.addAttribute("warehouse", warehouse);

        return "warehouse-form";
    }
    @PostMapping("/invoices/saveInvoice")
    public String saveInvoice(@ModelAttribute("invoice") Invoice invoice) {

        // call service
        invoiceService.saveInvoice(invoice);
        invoice.setCreatedAt(new Date());

        return "redirect:/warehouse/invoices/list";
    }
    // Save warehouse
    @PostMapping("/save")
    public String saveWarehouse(@ModelAttribute("warehouse") Warehouse warehouse) {

        warehouseService.saveWarehouse(warehouse);

        return "redirect:/warehouse/list";
    }
   

      
    // Show edit form
    @GetMapping("/edit")
    public String editWarehouse(@RequestParam("id") int id, Model model) {

        Warehouse warehouse = warehouseService.getWarehouseById(id);

        model.addAttribute("warehouse", warehouse);

        return "warehouse-form";
    }

    // Delete warehouse
    @GetMapping("/delete")
    public String deleteWarehouse(@RequestParam("id") int id) {

        warehouseService.deleteWarehouse(id);

        return "redirect:/warehouse/list";
    }
}