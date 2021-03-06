package vislabExample.model.bl;

import org.hibernate.Session;
import vislabExample.model.db.Admin;
import vislabExample.model.sf.HibernateUtil;

public class AdminManager {
	
	public Admin getAdminByPrimaryKey(String primaryKey) {
	    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	    session.beginTransaction();
	    Admin admin = (Admin) session.get(Admin.class, primaryKey);
	    session.getTransaction().commit();
	    return admin;
	}

	public void saveAdmin(Admin admin) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
  	    session.beginTransaction();
		session.save(admin);
        session.getTransaction().commit();
    }

}
