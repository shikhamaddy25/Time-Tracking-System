package servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String role = req.getParameter("role");
        HttpSession session = req.getSession();
        session.setAttribute("role", role);

        if ("admin".equals(role))
            res.sendRedirect("adminDashboard.jsp");
        else
            res.sendRedirect("userDashboard.jsp");
    }
}
