package guisofiati.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guisofiati.beans.Contact;

@WebServlet(name = "deleteContact", urlPatterns = { "/deleteContact" })
public class DeleteContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteContactServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String number = request.getParameter("number");
		
		Contact.deleteContact(number);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Contact deleted. </h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
