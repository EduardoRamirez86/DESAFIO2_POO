package ideas.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import ideas.model.LineaVenta;

public class LineaVentaDAO {

    public List<LineaVenta> listarLineas() throws SQLException {
        List<LineaVenta> lineas = new ArrayList<>();
        String sql = "SELECT * FROM lineas_de_venta";

        try (Connection conn = Conexion.ConectarBD("inventario"); // Cambia "inventario" por el nombre de tu base de datos
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                LineaVenta linea = new LineaVenta(rs.getInt("id_linea"), rs.getString("Linea"));
                lineas.add(linea);
            }
        }
        return lineas;
    }
}
