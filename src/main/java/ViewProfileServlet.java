import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        boolean isUser = false;
        try{
            isUser = (boolean) session.getAttribute("user");
        }
        catch (Exception e){
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        if(isUser){
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        }
        else{
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
