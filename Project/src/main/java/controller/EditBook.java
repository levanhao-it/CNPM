package controller;

import entity.BookEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/EditBook")
public class EditBook extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String pId=request.getParameter("id");
        String publisher=request.getParameter("publisher");
        String nameBook=request.getParameter("nameBook");
        String author=request.getParameter("author");
        String addDate=request.getParameter("addDate");
        int amount=Integer.parseInt(request.getParameter("amount"));
        int remainAmount=Integer.parseInt(request.getParameter("remainAmount"));
        System.out.println(publisher);
        System.out.println(nameBook);
        System.out.println(author);
        System.out.println(addDate);
        System.out.println(amount);



        BookEntity pm= new BookEntity();


        pm.updateBook(pId,publisher,nameBook,author,addDate,amount,remainAmount);
        response.sendRedirect("ManagerBook");

    }
}
