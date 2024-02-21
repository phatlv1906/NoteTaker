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
			Session s = HibernateUtil.getSessionFactory().openSession();
			Transaction ts = s.beginTransaction();
			Query q = s.createQuery("from Note");
			List<Note> listNote = q.getResultList();
			
			for(Note note:listNote) {
				System.out.println(note.getId() + " " + note.getTitle());
			}
			s.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
