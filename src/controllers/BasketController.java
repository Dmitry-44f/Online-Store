package controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/basket")
public class BasketController extends HttpServlet {
    // логика GET
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Вызван метод: doGet. Содержимое корзины отображено");
    }

    // логичка POST
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String action = req.getParameter("Action");

        if ("add".equals(action)) {
            add(req, resp);
        } else if ("delete".equals(action)) {
            delete(req, resp);
        }
    }

    // метод add
    private void add(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Вызван метод: add. Товар добавлен.");
    }

    // метод delete
    private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Вызван метод: delete. Товар удален.");
    }
}