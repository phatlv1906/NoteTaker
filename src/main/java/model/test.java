package model;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Utils.HibernateUtil;

public class test {
	public static void main(String[] args) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			Note note = session.get(Note.class, 339);
			session.delete(note);
			ts.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
