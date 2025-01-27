package com.servlet;

import java.io.*;
import java.util.Date;

import com.entities.Note;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
			String title =req.getParameter("title");
			String content = req.getParameter("content");
			
			Note note = new Note(title,content, new Date());
			System.out.println(note.getId()+ " "+ note.getTitle());
			
			
		}
		catch(Exception e) {
			
		}
		
	
	}

}
