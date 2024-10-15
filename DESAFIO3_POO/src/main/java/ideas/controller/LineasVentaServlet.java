package ideas.controller;

import ideas.dao.LineaVentaDAO;
import ideas.model.LineaVenta;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class LineasVentaServlet extends HttpServlet {

    private LineaVentaDAO lineaVentaDAO;

    @Override
    public void init() throws ServletException {
        lineaVentaDAO = new LineaVentaDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<LineaVenta> lineas = lineaVentaDAO.listarLineas();
            request.setAttribute("lineas", lineas);
            request.getRequestDispatcher("lineas_de_venta.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException("Error al obtener líneas de venta", e);
        }
    }
}
