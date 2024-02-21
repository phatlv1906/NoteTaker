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
	public void getAllNote() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		Query q = session.createQuery("from Note");
		List<Note> listNote = q.getResultList();
		
		for(Note note:listNote) {
			System.out.println(note.getId() + " " + note.getTitle());
		}
		
	}
}
