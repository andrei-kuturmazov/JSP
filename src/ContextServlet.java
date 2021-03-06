import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/trademark")
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("This page is brought you by " + getServletContext().getInitParameter("trademark"));
        resp.getWriter().println("Creation date is: " + getServletContext().getInitParameter("creationDate"));
        resp.getWriter().close();
    }
}
