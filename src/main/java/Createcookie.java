import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Create")
public class Createcookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Create Cookie
        Cookie ck = new Cookie("username", "nomaan");
        ck.setMaxAge(60 * 60); // 1 hour

        response.addCookie(ck);

        out.println("<h2>Cookie Created Successfully!</h2>");
        out.println("<a href='Read'>Read Cookie</a>");

        out.close();
    }
}