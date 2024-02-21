package model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Utils.HibernateUtil;

public class test {
	public static void main(String[] args) {
		Note note = new Note("a", "a", new Date());
		try {
			Session s = HibernateUtil.getSessionFactory().openSession();
			Transaction ts = s.beginTransaction();
			s.save(note);
			ts.commit();
			s.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
