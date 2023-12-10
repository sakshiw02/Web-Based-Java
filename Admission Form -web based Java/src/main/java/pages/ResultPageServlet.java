package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.Student;

/**
 * Servlet implementation class ResultPageServlet
 */
@WebServlet("/result")
public class ResultPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		try(PrintWriter pw=response.getWriter()){

			Student s1=(Student)request.getAttribute("stud_details");
			if(s1!=null) {
				pw.print("<h4>Admision succesful</h4>");
				
			}
			else {
				pw.print("<h4>Admision Unsuccesful</h4>");
			}
		System.out.println("back here!! hulala ");	
			
}
		
	}

}
