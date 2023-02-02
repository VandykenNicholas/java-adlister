import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
   public int count = 0;
    public String name;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String oldName = name;
        String reset = req.getParameter("reset");
        if(Objects.equals(reset, "yes")){
            count = 0;
        }
        name = req.getParameter("name");
        if(!Objects.equals(name, oldName)){
            count  = 0;
        }
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        count++;
        if(name == null){
            out.println("<div><h1>"+ count +"</h1></div><div><h1>Hello, World!</h1></div>");
        }
        else{
            out.println("<div><h1>"+ count +"</h1></div><div><h1>Hello, "+ name+ "!</h1>");
        }
    }
}
