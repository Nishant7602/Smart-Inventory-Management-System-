package com.smartinventory.service;

import com.smartinventory.entity.Invoice;
import java.util.List;

public interface InvoiceService {

    // ✅ Save or Update Invoice
    void saveInvoice(Invoice invoice);
    List<Invoice> getAllInvoices();
    double getTotalRevenue();
    long getInvoiceCount();
    void deleteInvoice(int id);
    Invoice getInvoiceById(int id);
}