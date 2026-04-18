package com.smartinventory.dao;

import java.util.List;
import com.smartinventory.entity.Invoice;

public interface InvoiceDAO {

    // ✅ Save or Update Invoice
    void saveInvoice(Invoice invoice);

    // ✅ Get all invoices (for list page)
    List<Invoice> getAllInvoices();
double getTotalRevenue();
long getInvoiceCount();
void deleteInvoice(int id);
Invoice getInvoiceById(int id);

}