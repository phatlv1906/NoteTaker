package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utils.NoteDao;

public class DeleteNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DeleteNoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int noteId = Integer.parseInt(request.getParameter("note_id").trim());
			NoteDao dao = new NoteDao();
			dao.DeleteNote(noteId);
			response.sendRedirect("all_note.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
