<%@ page import="ideas.model.Venta" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: eduardo
  Date: 14/10/2024
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Ventas</title>
  <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-sm-12">
      <h2>Lista de Ventas</h2>
      <table class="table table-striped">
        <thead>
        <tr>
          <th>ID Venta</th>
          <th>ID Línea</th>
          <th>Fecha Venta</th>
          <th>Descripción</th>
        </tr>
        </thead>
        <tbody>
        <%
          // Suponiendo que la lista de ventas se pasa como atributo "ventas"
          List<Venta> ventas = (List<Venta>) request.getAttribute("ventas");
          for (Venta venta : ventas) {
        %>
        <tr>
          <td><%= venta.getIdVenta() %></td>
          <td><%= venta.getIdLinea() %></td>
          <td><%= venta.getFechaVenta() %></td>
          <td><%= venta.getDescripcion() %></td>
        </tr>
        <% } %>
        </tbody>
      </table>
      <a href="index.jsp" class="btn btn-primary">Volver</a>
    </div>
  </div>
</div>
</body>
</html>

