package ideas.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import ideas.model.Venta;

public class VentaDAO {

    public List<Venta> listarVentas() throws SQLException {
        List<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM ventas";

        try (Connection conn = Conexion.ConectarBD("inventario"); // Cambia "inventario" por el nombre de tu base de datos
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Venta venta = new Venta(
                        rs.getInt("id_venta"),
                        rs.getInt("id_linea"),
                        rs.getDate("fecha_venta"),
                        rs.getString("descripcion")
                );
                ventas.add(venta);
            }
        }
        return ventas;
    }
}

