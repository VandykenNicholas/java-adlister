import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;


@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/pizza-order-page.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String[] toppings = request.getParameterValues("toppings");
        String combined = Arrays.toString(toppings);

        System.out.println(combined + " with " + sauce + " sauce, with "+ crust+" crust");
        response.sendRedirect("/pizza-order");
    }

}
