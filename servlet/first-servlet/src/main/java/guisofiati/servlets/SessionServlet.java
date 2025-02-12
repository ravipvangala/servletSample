package guisofiati.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SessionServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Integer count = (Integer) session.getAttribute("counter");
		
		int visits = (count == null) ? 1 : count.intValue() + 1;
		
		session.setAttribute("counter", new Integer(visits));
		
		PrintWriter out = response.getWriter();
		
		out.println("<html> <body>");
		out.println("<h1>" + visits + "</h1>");
		out.println("</body> </html>");
	}
}
