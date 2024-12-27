<%@page import ="java.util.List" %>
<%@page import ="org.hibernate.Query" %>
<%@page import=" com.helper.FactoryProvider" %>
<%@page import ="org.hibernate.Session" %>
<%@page import=" com.entities.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Notes: Note Taker</title>
 <%@include file="all_js_css.jsp" %> <!-- directive tag -->
</head>
<body>
 <div class="container-fluid">
    <%@include file="navbar.jsp" %> <!-- directive tag -->
    <h1>All Notes</h1>
    <% 
    Session s =FactoryProvider.getFactory().openSession();
    Query q= s.createQuery("from Note");
    List<Note> list= q.list();
    for(Note note:list){%>
    	  <div class="note">
          <h2>Note ID: <%= note.getId() %></h2>
          <h3>Title: <%= note.getTitle() %></h3>
          <p>Content: <%= note.getContent() %></p>
          <a href="DeleteServlet?note_id=<%=note.getId() %>" class="btn btn-danger">DELETE</a>
          <a href="edit.jsp?note_id=<%=note.getId() %>" class="btn btn-primary">Update</a>
        </div>
    	
   <% }
    s.close();
    
    %>
    </div>
</body>
</html>