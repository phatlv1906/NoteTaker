<%@page import="model.Note"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="Utils.HibernateUtil"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Note</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
	<div class="container">
    	<%@include file="Navbar.jsp"%>
    	<br>
    	<h1>All Note: </h1>
    	<div class="row">
    		<div class="col-12">
    		<%
				Session s = HibernateUtil.getSessionFactory().openSession();
				Transaction ts = s.beginTransaction();
				Query q = s.createQuery("from Note");
				List<Note> listNote = q.list();
				for(Note note:listNote){
			%>
				<div class="card">
				  <div class="card-body px-5">
				    <h5 class="card-title"><%=note.getTitle()%></h5>
				    <p class="card-text"><%=note.getContent()%></p>
				    <div class="container text-right">
				    	<a href="#" class="btn btn-primary">Update</a>
				    	<a href="DeleteNoteServlet?note_id=<%=note.getId()%>" class="btn btn-danger">Delete</a>
				    </div>
				  </div>
				</div>
				
			<%
				}	
				s.close();
			%>

    		</div>
    	</div>
    	
    </div>
	
</body>
</html>