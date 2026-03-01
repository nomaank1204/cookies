import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Read")
public class Readcookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        boolean found = false;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    out.println("<h2>Username: " + c.getValue() + "</h2>");
                    found = true;
                }
            }
        }

        if (!found) {
            out.println("<h2>No Username Cookie Found!</h2>");
        }

        out.println("<br><a href='Create'>Create Cookie Again</a>");

        out.close();
    }
}