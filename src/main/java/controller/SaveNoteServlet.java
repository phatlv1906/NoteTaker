package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Utils.HibernateUtil;
import Utils.NoteDao;
import model.Note;


public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveNoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Note note = new Note(title, content, new Date());
			NoteDao dao = new NoteDao();
			dao.SaveNote(note);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1 style='text-align:center;'>Note Added Successfully</h1>");
			out.println("<h1 style='text-align:center;'><a href='index.jsp'>View all note</a></h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			
		
	

	}

}
