package guisofiati.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guisofiati.beans.Contact;
import guisofiati.utils.Format;

@WebServlet(name = "listContacts", urlPatterns = { "/listContacts" })
public class ListContactsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListContactsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
			out.println("table, th, td {");
			out.println("border: 1px solid black;");
			out.println("}");
	    out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table>");
		out.println("<caption> Your list of contacts </caption>");
		out.println("<thead>");
		out.println("<tr>");
		out.println("<th> Contact name </th>");
		out.println("<th> Phone number </th>");
		out.println("</thead>");
		out.println("<tbody>");
		Contact.getContacts().forEach(contact -> {
			out.println("<tr>");
			out.println("<td> " + contact.getName() + "</td>");
			out.println("<td> " + Format.phoneNumber(contact.getNumber()) + "</td>");
			out.println("</tr>");
		});
		out.println("</tbody>");
		out.println("<tfoot>");
		out.println("<td> Total </td>");
		out.println("<td> " + Contact.getContacts().size() + " contacts saved </td>");
		out.println("</tfoot>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}
