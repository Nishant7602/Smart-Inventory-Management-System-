package com.smartinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.smartinventory.entity.Billing;
import com.smartinventory.entity.SalesOrder;
import com.smartinventory.service.BillingService;

@Controller
@RequestMapping("/billing")
public class BillingWebController {

    @Autowired
    private BillingService billingService;

    // Show all bills / orders
    @GetMapping("/list")
    public String listOrders(Model model) {
        List<Billing> list = billingService.getAllBillings();
        model.addAttribute("billings",list);
        return "billing-list";
    }

    // Show billing form
    @GetMapping("/add")
    public String showBillingForm(Model model) {

        SalesOrder order = new SalesOrder();

        model.addAttribute("order", order);

        return "billing-form";
    }

    // Save billing order
    @PostMapping("/save")
    public String saveOrder(@ModelAttribute("billing") Billing billing) {
        billingService.saveOrder(billing);
        return "redirect:/billing/list";
    }

    // View bill details
    @GetMapping("/view")
    public String viewOrder(@RequestParam("id") int id, Model model) {

        SalesOrder order = billingService.Billing(id);

        model.addAttribute("order", order);

        return "billing-view";
    }
    @GetMapping("/edit")
    public String showEditForm(@RequestParam("id") int id, Model model) {

        Billing bill = billingService.getBillingById(id);

        model.addAttribute("bill", bill);

        return "billing-form"; // same form used for add/edit
    }
    // Delete bill
    @GetMapping("/delete")
    public String deleteOrder(@RequestParam("id") int id) {
    	System.out.println("Deleting bill ID: " + id); // DEBUG

        billingService.deleteBilling(id);
        
        return "redirect:/billing/list";
    }
    @GetMapping("")
    public String showBillingPage() {
        return "billing";   // 👉 billing.jsp
    }
}