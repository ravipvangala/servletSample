package guisofiati.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guisofiati.beans.Contact;

@WebServlet(name = "addContact", urlPatterns = { "/addContact" })
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddContactServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		
		Contact contact = new Contact();
		contact.setName(name);
		contact.setNumber(number);
		contact.addNewContact(contact);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Contact created. </h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
