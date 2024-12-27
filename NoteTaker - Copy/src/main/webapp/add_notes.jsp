<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Notes</title>
 <%@include file="all_js_css.jsp" %> <!-- directive tag -->
</head>
<body>
 <div class="container-fluid">
    <%@include file="navbar.jsp" %> <!-- directive tag -->
    </div>
     <div class="form-container">
      <h2>Add a New Note</h2>
      <form action="SaveNoteServlet" method="POST">
        <div class="form-group">
          <label for="title">Title</label>
          <input type="text" id="title" name="title" placeholder="Enter title" required>
        </div>

        <div class="form-group">
          <label for="content">Content</label>
          <textarea id="content" name="content" rows="5" placeholder="Enter content" required></textarea>
        </div>

        <!-- <div class="form-group">
          <label for="addedDate">Date</label>
          <input type="date" id="addedDate" name="addedDate" required>
        </div> -->

        <div class="form-group">
          <button type="submit">Save Note</button>
        </div>
      </form>
    </div>
</body>
</html>