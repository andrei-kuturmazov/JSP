import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Student")
public class StudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter writer = resp.getWriter()) {
            resp.setContentType("text/html");
            writer.println("<html><body>");
            writer.println("The student is confirmed: " + req.getParameter("firstName") + " " + req.getParameter("lastName"));
            writer.println("</html></body>");
        }
    }
}
