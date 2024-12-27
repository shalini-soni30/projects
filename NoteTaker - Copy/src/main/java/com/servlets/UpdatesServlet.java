package com.servlets;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.helper.FactoryProvider;
import com.entities.Note;

public class UpdatesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            int noteId = Integer.parseInt(request.getParameter("noteId").trim());

            Session s = FactoryProvider.getFactory().openSession();
            Note note = s.get(Note.class, noteId);  // Correctly use noteId here

            if (note != null) {
                Transaction tx = s.beginTransaction();
                
                // Update note with new values
                note.setTitle(title);
                note.setContent(content);
                note.setAddedDate(new Date());
                
                tx.commit();
            }

            s.close();
            response.sendRedirect("all_notes.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
