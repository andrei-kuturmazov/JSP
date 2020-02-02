import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Student")
public class StudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("The student is confirmed: " + req.getParameter("firstName") + " " + req.getParameter("lastName"));
        resp.getWriter().println("</html></body>");

    }
}
