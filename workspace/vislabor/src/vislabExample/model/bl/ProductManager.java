package vislabExample.model.bl;

import org.hibernate.Session;
import vislabExample.model.db.Product;
import vislabExample.model.sf.HibernateUtil;

public class ProductManager {
	
	public Product getProductByPrimaryKey(long primaryKey) {
	    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	    session.beginTransaction();
	    Product product = (Product) session.get(Product.class, primaryKey);
	    session.getTransaction().commit();
	    return product;
	}

	public void saveProduct(Product product) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
  	    session.beginTransaction();
		session.save(product);
        session.getTransaction().commit();
    }

}
