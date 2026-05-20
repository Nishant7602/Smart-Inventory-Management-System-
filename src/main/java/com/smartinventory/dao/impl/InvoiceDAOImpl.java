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

        Session session = sessionFactory.getCurrentSession();

        Double total = (Double) session.createQuery(
                "SELECT SUM(i.price) FROM Invoices i"
        ).uniqueResult();
System.out.print("total revenue"+total);
        return total != null ? total : 0.0;
    }

    @Override
    public long getInvoiceCount() {
        return (Long) sessionFactory.getCurrentSession()
            .createQuery("SELECT COUNT(*) FROM Invoice")
            .uniqueResult();
    }
    // ✅ Get Invoice by ID
 @Override
 public void deleteInvoice(Long id) {
	    Invoice inv = sessionFactory
	        .getCurrentSession()
	        .get(Invoice.class, id);

	    if (inv != null) {
	        sessionFactory.getCurrentSession().delete(inv);
	    }
	}
 @Override
 public long getTotalInvoices() {
     Session session = sessionFactory.getCurrentSession();

     Long count = (Long) session.createQuery(
             "SELECT COUNT(i.id) FROM Invoice i"
     ).uniqueResult();

     return count != null ? count : 0L;
 }
 @Override
 public Invoice getInvoiceById(int id) {

     return sessionFactory
             .getCurrentSession()
             .get(Invoice.class, id);
 }
 
}