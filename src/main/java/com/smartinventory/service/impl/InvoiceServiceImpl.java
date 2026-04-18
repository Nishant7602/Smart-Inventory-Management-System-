package com.smartinventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartinventory.dao.InvoiceDAO;
import com.smartinventory.entity.Invoice;
import com.smartinventory.service.InvoiceService;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceDAO invoiceDAO;

    // ✅ Save
    @Override
    @Transactional
    public void saveInvoice(Invoice invoice) {
        invoiceDAO.saveInvoice(invoice);
    }

    // ✅ GET ALL (THIS WAS MISSING)
    @Override
    @Transactional
    public List<Invoice> getAllInvoices() {
        return invoiceDAO.getAllInvoices();
    }
    
    
    @Override
    public double getTotalRevenue() {
        return invoiceDAO.getTotalRevenue();
    }

    @Override
    public long getInvoiceCount() {
        return invoiceDAO.getInvoiceCount();
    }
    @Override
    public Invoice getInvoiceById(int id) {
        return invoiceDAO.getInvoiceById(id);
    }
@Override
@Transactional
public void deleteInvoice(int id) {
	invoiceDAO.deleteInvoice(id);
}
   
}