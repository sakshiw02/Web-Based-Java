package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.Course;
import pojos.Student;

/**
 * Servlet implementation class ProcessAdmissionForm
 */
@WebServlet("/process_admission")
public class ProcessAdmissionForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			int score = Integer.parseInt(request.getParameter("score"));
			Course cs = Course.valueOf(request.getParameter("course").toUpperCase());

			Student student = new Student(request.getParameter("fn"), request.getParameter("ln"), score,cs);
		
				pw.print(cs);
				if (score >= cs.getMarks()) {

					student.setAdmissionStatus(true);
					request.setAttribute("stud_details", student);
					pw.print("<h1> From 1st Page :</h1>");
//			pw.print("<h4>Course is invalid</h4>");

				}
			


			RequestDispatcher rd = request.getRequestDispatcher("result");
			rd.include(request, response);
			System.out.println("control Back");

		}

	}

}


////pw.print(cs);
//Course course = Course.valueOf(cs);
////pw.print("aaaaaa"+course);
//for(Course c:Course.values()) {
//	if())) {
//		pw.print("equal to java.....");
//	}
//	else {
//		pw.print("not equals to java...");
//	}
//}

//if(cs.equals(Course.valueOf(cs))) {
//pw.print(course);}

