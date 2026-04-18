package com.smartinventory.service;

import java.util.List;

import com.smartinventory.entity.Billing;
import com.smartinventory.entity.SalesOrder;

public interface BillingService {

    void saveOrder(Billing billing);

    SalesOrder Billing(int id);

    List<SalesOrder> getAllOrders();

    void deleteBilling(int id);
    List<Billing> getAllBillings();
    Billing getBillingById(int id);
    void saveOrUpdate(Billing bill);
}