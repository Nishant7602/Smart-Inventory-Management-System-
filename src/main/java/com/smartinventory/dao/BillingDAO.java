package com.smartinventory.dao;

import java.util.List;

import com.smartinventory.entity.Billing;
import com.smartinventory.entity.SalesOrder;

public interface BillingDAO {

    void saveOrder(Billing billing);

    SalesOrder getOrderById(int id);

    List<SalesOrder> getAllOrders();

    void deleteBilling(int id);
    List<Billing> getAllBillings();
    Billing getBillingById(int id);
    void saveOrUpdate(Billing bill);
}