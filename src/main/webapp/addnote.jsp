<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Note</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
	<div class="container-fluid p-0">
    	<%@include file="Navbar.jsp"%>
    </div>
	<div class="container mt-2">
    	<!-- this is form -->
    	<h1 class="form-title">Enter your note here</h1>
	    <form action="SaveNoteServlet" method="POST">
		  <div class="form-group">
		    <label for="title">Your Note Title</label>
		    <input required="required" type="text" class="form-control" name="title" id="title" aria-describedby="emailHelp">
		  </div>
		  <div class="form-group">
		    <label for="content">Content</label>
		    <textarea name="content" required="required" id="content" placeholder="Enter your note content" class="form-control" style="height: 300px"></textarea>
		  </div>
		  <button type="submit" class="btn btn-primary">Add</button>
		</form>
    </div>
</body>
</html>