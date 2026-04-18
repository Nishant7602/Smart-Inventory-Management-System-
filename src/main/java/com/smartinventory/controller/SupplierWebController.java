package com.smartinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.smartinventory.entity.Invoice;
import com.smartinventory.entity.Supplier;
import com.smartinventory.service.InvoiceService;
import com.smartinventory.service.SupplierService;

@Controller
@RequestMapping("/supplier")
public class SupplierWebController {

    @Autowired
    private SupplierService supplierService;
    @Autowired
    private InvoiceService  invoiceService;
    // Show all suppliers
    @GetMapping("/list")
    public String listSuppliers(Model model) {

        List<Supplier> suppliers = supplierService.getAllSuppliers();

        model.addAttribute("suppliers", suppliers);

        return "supplier-list";
    }
    

    // Show add form
    @GetMapping("/add")
    public String showAddForm(Model model) {

        Supplier supplier = new Supplier();

        model.addAttribute("supplier", supplier);

        return "supplier-form";
    }
    @PostMapping("/generateInvoice")
    public String showGenerateInvoicePage() {
        return "generateInvoice";
    }
    @GetMapping("/invoices/list")
    public String listInvoices(Model model) {
        model.addAttribute("invoices", invoiceService.getAllInvoices());
        return "invoice-form"; // JSP name
    }
    @GetMapping("/addInvoice")
    public String saveInvoice(Invoice invoice) {
        invoiceService.saveInvoice(invoice);
        return "redirect:/supplier/invoices/list";
    }
    // Save supplier
    @PostMapping("/save")
    public String saveSupplier(@ModelAttribute("supplier") Supplier supplier) {

        supplierService.saveSupplier(supplier);

        return "redirect:/supplier/list";
    }

    // Edit supplier
    @GetMapping("/edit")
    public String editSupplier(@RequestParam("id") int id, Model model) {

        Supplier supplier = supplierService.getSupplierById(id);

        model.addAttribute("supplier", supplier);

        return "supplier-form";
    }

        @GetMapping("/addSuppliers")
        public String showAddSupplierForm() {
            return "addSupplier"; // JSP name
        }
    
    // Delete supplier
    @GetMapping("/delete")
    public String deleteSupplier(@RequestParam("id") int id) {

        supplierService.deleteSupplier(id);

        return "redirect:/supplier/list";
    }
    
}