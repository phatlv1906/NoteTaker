package Utils;



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
}
