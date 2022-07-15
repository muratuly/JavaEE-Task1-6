package kz.bitlab.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/second")
public class SecondServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String fio = request.getParameter("user_fio");
        int point = Integer.parseInt(request.getParameter("user_points"));
        if((point >= 50) && (point <=59)){
            out.print(fio + " got 'D' for exam!");
        } else if ((point >= 60) && (point <=74)) {
            out.print(fio + " got 'C' for exam!");
        }else if ((point >= 75) && (point <=89)) {
            out.print(fio + " got 'B' for exam!");
        }else if (point >= 90) {
            out.print(fio + " got 'A' for exam!");
        }else{
            out.print(fio + " got 'F' for exam!");
        }
    }
}
