package Utils;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Note;

public class NoteDao {
	
	public void SaveNote(Note note) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		session.save(note);
		ts.commit();
		session.close();
	}
	public void DeleteNote(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		Note note = session.get(Note.class, id);
		session.delete(note);
		ts.commit();
		session.close();
	}
}
