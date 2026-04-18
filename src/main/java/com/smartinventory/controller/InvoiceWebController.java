package com.smartinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartinventory.entity.Invoice;
import com.smartinventory.service.InvoiceService;
import com.smartinventory.service.ProductService;

@Controller
@RequestMapping("/invoice")
public class InvoiceWebController {

    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private ProductService productService;

    // List
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("invoices", invoiceService.getAllInvoices());
        return "invoice-list";
    }

    // Add Form
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("invoice", new Invoice());
        model.addAttribute("products", productService.getAllProducts());
        return "invoice-form";
    }

    // Save
    @PostMapping("/save")
    public String save(@ModelAttribute Invoice invoice) {
        invoiceService.saveInvoice(invoice);
        return "redirect:/invoice/list";
    }

    // Edit
    @GetMapping("/edit")
    public String edit(@RequestParam int id, Model model) {
        model.addAttribute("invoice", invoiceService.getInvoiceById(id));
        model.addAttribute("products", productService.getAllProducts());
        return "invoice-form";
    }

    // Delete
    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        invoiceService.deleteInvoice(id);
        return "redirect:/invoice/list";
    }
}