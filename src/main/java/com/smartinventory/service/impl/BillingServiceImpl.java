package com.smartinventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartinventory.dao.BillingDAO;
import com.smartinventory.entity.Billing;
import com.smartinventory.entity.SalesOrder;
import com.smartinventory.service.BillingService;

@Service
@Transactional
public class BillingServiceImpl implements BillingService {

    @Autowired
    private BillingDAO billingDAO;

    @Override
    public void saveOrder(Billing billing) {
        billingDAO.saveOrder(billing);
    }

    @Override
    public SalesOrder Billing(int id) {
        return billingDAO.getOrderById(id);
    }

    @Override
    public List<SalesOrder> getAllOrders() {
        return billingDAO.getAllOrders();
    }

    @Override
    public void deleteBilling(int id) {
        billingDAO.deleteBilling(id);
    }
    @Override
    public List<Billing> getAllBillings(){
    	return billingDAO.getAllBillings();
    }
    @Override
    public Billing getBillingById(int id) {
        return billingDAO.getBillingById(id);
    }

    @Override
    public void saveOrUpdate(Billing bill) {
        billingDAO.saveOrUpdate(bill);
    }
}