package guisofiati.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GreetingServlet")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GreetingServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		
		List<String> colours = Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Hello, " + name + "! </h2>");
		out.println("<h2> Some colours: </h2>");
		out.println("<ul>");
		for (String color: colours) {
			out.println("<li> " + color + " </li>");
		}
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}
}
