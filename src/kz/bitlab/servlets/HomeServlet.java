package kz.bitlab.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<form action='/second' method='post' class='container mt-5'>");
        out.print("FULL NAME: <input class='form-control' type='text' name='user_fio'>");
        out.print("EXAM POINTS: <select class='form-control' name='user_points'>");
        for (int i = 0; i <= 100; i++) {
            out.print("<option>");
            out.print(i);
            out.print("</option>");
        }
        out.print("</select>");
        out.print("<br>");
        out.print("<button class='btn btn-secondary'> SUBMIT EXAM </button>");
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");

    }

}
