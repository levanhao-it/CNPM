package controller;

import entity.BookEntity;
import model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/loadBookDetail")
public class loadBookDetail extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String pid=request.getParameter("id");
        BookEntity pm= new BookEntity();
        List<Book> p = pm.getProductById(pid);
        request.setAttribute("detail",p);
        request.setAttribute("id",pid);
        request.getRequestDispatcher("/editBook.jsp").forward(request,response);

    }
}
