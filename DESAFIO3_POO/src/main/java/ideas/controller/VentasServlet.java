package ideas.controller;

import ideas.dao.VentaDAO;
import ideas.model.Venta;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class VentasServlet extends HttpServlet {

    private VentaDAO ventaDAO;

    @Override
    public void init() throws ServletException {
        // Inicializa el DAO de ventas
        ventaDAO = new VentaDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtiene la lista de ventas desde el DAO
            List<Venta> ventas = ventaDAO.listarVentas();
            // Establece la lista de ventas como atributo de la solicitud
            request.setAttribute("ventas", ventas);
            // Redirige a la página de ventas
            request.getRequestDispatcher("ventas.jsp").forward(request, response);
        } catch (SQLException e) {
            // Maneja la excepción y lanza una ServletException si ocurre un error
            throw new ServletException("Error al obtener ventas", e);
        }
    }
}

