package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product")
public class ProductController extends HttpServlet {
    // Методы GET
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String query = req.getParameter("query");

        if (id != null) {
            getById(id, resp);
        } else if (query != null) {
            search(query, resp);
        } else {
            getAll(resp);
        }
    }

    // все товары
    private void getAll(HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Список всех товаров: Телефон, Ноутбук, Часы");
    }

    // товар по ID
    private void getById(String id, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Информация о товаре с ID: " + id);
    }

    // найти товар
    private void search(String query, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Результаты поиска для: " + query);
    }
}
