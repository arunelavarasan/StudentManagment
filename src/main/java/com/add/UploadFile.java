package com.add;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/uploadfile")
public class UploadFile extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
	try {
		List<FileItem> up = sf.parseRequest(req);
		for (FileItem fileItem : up) {
			try {
//				fileItem.write(new File("D:\\multiplefile\\"+fileItem.getName()));
				fileItem.write(new File("C:\\multifile\\"+fileItem.getName()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} catch (FileUploadException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
