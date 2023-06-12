<%@ page contentType="text/html;charset=UTF-8" %>

<%
    String dias = (String)request.getAttribute("dias");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fechas</title>
    <style>
        div{
            margin: 4px;
            padding: 4px;
        }
    </style>
</head>
<body>

  <h2>Contando los días entre hoy y una fecha futura.</h2>

  <form action="./fecha-servlet" method="post">
      <div>
          <label for="dia">Día: </label>
          <input type="text" id="dia" name="dia" />
      </div>
      <div>
          <label for="mes">Mes: </label>
          <input type="text" id="dia" name="mes" />
      </div>
      <div>
          <label for="anio">Año: </label>
          <input type="text" id="dia" name="anio" />
      </div>
      <div>
          <input type="submit" value="Calcular">
      </div>
  </form>

  <% if(dias!=null){ %>
          <h3><%=dias%></h3>
  <% } %>

</body>
</html>