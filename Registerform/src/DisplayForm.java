

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DisplayForm")
public class DisplayForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int count=1;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String mailid=request.getParameter("mailid");
		String contactno=request.getParameter("contactno");
		String gender=request.getParameter("gender");
		String qualification[]=request.getParameterValues("qualification");
		out.println("<html><head>");
		out.println("<title>My Profile</title></head>");
		out.println("<body bgcolor='lightblue'><center><h3>MY PROFILE</h3></center>");
		out.println("<table><tr><td>Name:</td><td>"+name+"</td></tr>");
		out.println("<tr><td>Address:</td><td>"+address+"</td></tr>");
		out.println("<tr><td>Mail-id:</td><td>"+mailid+"</td></tr>");
		out.println("<tr><td>Contact-No:</td><td>"+contactno+"</td></tr>");
		out.println("<tr><td>Gender:</td><td>"+gender+"</td></tr>");
		out.println("<tr><td>Qualification:</td><td>");
		try { 
			for(String s:qualification) {
			out.println(s);
			if(count!=qualification.length) {
				out.print(",");
			}
			count++;
		} }
		catch(Exception e) {
			out.println("None");
		}
		out.println("</td></tr></table>");
		out.println("</body></html>");
	}

}
