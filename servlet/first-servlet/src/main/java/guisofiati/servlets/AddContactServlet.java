package guisofiati.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addContact", urlPatterns = { "/addContact" })
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddContactServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String birthdate = request.getParameter("birthdate");
			
		out.println("<html>");
		out.println("<body>");
		out.println("<h2> Name: " + name + "</h2>");
		out.println("<h2> Email: " + email + "</h2>");
		out.println("<h2> Address: " + address + "</h2>");
		out.println("<h2> Birthdate: " + birthdate + "</h2>");
		out.println("</body>");
		out.println("</html>");
	}
}
