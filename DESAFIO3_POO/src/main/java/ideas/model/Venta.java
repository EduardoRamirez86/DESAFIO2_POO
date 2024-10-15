package ideas.model;

import java.util.Date;

public class Venta {
    private int idVenta;
    private int idLinea;
    private Date fechaVenta;
    private String descripcion;

    public Venta(int idVenta, int idLinea, Date fechaVenta, String descripcion) {
        this.idVenta = idVenta;
        this.idLinea = idLinea;
        this.fechaVenta = fechaVenta;
        this.descripcion = descripcion;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
