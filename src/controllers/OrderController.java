package controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/orders")
public class OrderController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // getStatus
        String orderId = req.getParameter("id");
        resp.getWriter().println("Статус заказа " + orderId + ": Оплачен");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String action = req.getParameter("action");

        if ("create".equals(action)) {
            create(req, resp);
        } else if ("cancel".equals(action)) {
            cancel(req, resp);
        }
    }

    private void create(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Заказ успешно создан!");
    }

    private void cancel(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Заказ отменен.");
    }
}
