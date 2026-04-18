package com.smartinventory.dao.impl;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.smartinventory.dao.InvoiceDAO;
import com.smartinventory.entity.Invoice;

@Repository
public class InvoiceDAOImpl implements InvoiceDAO {

    @Autowired
    private SessionFactory sessionFactory;

    // ✅ Save or Update Invoice
    @Override
    public void saveInvoice(Invoice invoice) {

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(invoice);
    }

    // ✅ Get All Invoices
    @Override
    public List<Invoice> getAllInvoices() {

        Session session = sessionFactory.getCurrentSession();

        Query<Invoice> query = session.createQuery("from Invoice", Invoice.class);

        return query.getResultList();
    }
    @Override
    public double getTotalRevenue() {

        Double result = (Double) sessionFactory.getCurrentSession()
                .createQuery("select sum(b.totalAmount) from Billing b")
                .uniqueResult();

        return (result != null) ? result : 0.0;   // ✅ FIX
    }

    @Override
    public long getInvoiceCount() {
        return (Long) sessionFactory.getCurrentSession()
            .createQuery("SELECT COUNT(*) FROM Invoice")
            .uniqueResult();
    }
    // ✅ Get Invoice by ID
 @Override
 public void deleteInvoice(int id) {
	    Invoice inv = sessionFactory
	        .getCurrentSession()
	        .get(Invoice.class, id);

	    if (inv != null) {
	        sessionFactory.getCurrentSession().delete(inv);
	    }
	}
 @Override
 public Invoice getInvoiceById(int id) {

     return sessionFactory
             .getCurrentSession()
             .get(Invoice.class, id);
 }
}