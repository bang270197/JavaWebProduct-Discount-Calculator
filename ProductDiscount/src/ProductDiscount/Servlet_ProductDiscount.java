package ProductDiscount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_ProductDiscount", urlPatterns = "/display-discount")
public class Servlet_ProductDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        double percentt = percent * 0.1;
        double discountAmount = price * percentt;

        double discountprice = price - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<table border=1px soild= #ccc>");
        writer.println("<tr>");
        writer.println("<td>");
        writer.println("<h1 color=navy>Product Discount Calculator</h1>");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>");
        writer.println("Product Description: " + description);
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>");
        writer.println("Price: " + price + "$");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>");
        writer.println("percent: " + percentt + "%");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>");
        writer.println("Discount Amount: " + discountAmount + "$");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>");
        writer.println("Discount Price: " + discountprice + "$");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("<table>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
