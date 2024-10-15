<%@ page import="ideas.model.LineaVenta" %>
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
  <title>Líneas de Venta</title>
  <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-sm-12">
      <h2>Líneas de Venta</h2>
      <table class="table table-striped">
        <thead>
        <tr>
          <th>ID</th>
          <th>Línea</th>
        </tr>
        </thead>
        <tbody>
        <%
          // Suponiendo que la lista de líneas de venta se pasa como atributo "lineas"
          List<LineaVenta> lineas = (List<LineaVenta>) request.getAttribute("lineas");
          for (LineaVenta linea : lineas) {
        %>
        <tr>
          <td><%= linea.getIdLinea() %></td>
          <td><%= linea.getLinea() %></td>
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



