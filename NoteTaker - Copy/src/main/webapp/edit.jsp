<%@ page import="com.helper.*,org.hibernate.*,com.entities.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Note</title>
 <%@include file="all_js_css.jsp" %> <!-- directive tag -->
</head>
<body>
<div class="container-fluid">
    <%@ include file="navbar.jsp" %>
    <%
    int noteId = Integer.parseInt(request.getParameter("note_id").trim());
    Session s = FactoryProvider.getFactory().openSession();
    Note note = (Note) s.get(Note.class, noteId);
    %>
    
    <form action="UpdatesServlet" method="POST">
     <input type="hidden"  name="noteId"  value="<%=note.getId() %>" >
        <div class="form-group">
            <label for="title">Title</label>
            <input type="text" id="title" name="title" placeholder="Enter title" value="<%=note.getTitle() %>" required>
        </div>

        <div class="form-group">
            <label for="content">Content</label>
            <textarea id="content" name="content" rows="5" placeholder="Enter content" required><%=note.getContent() %></textarea>
        </div>

        <div class="form-group">
            <button type="submit">Update Note</button>
        </div>
    </form>
    
</div>
</body>
</html>
