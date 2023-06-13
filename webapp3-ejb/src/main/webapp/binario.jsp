<%@ page contentType="text/html;charset=UTF-8" %>

<%
    String respuesta = (String)request.getAttribute("respuesta");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Conversor de numeros</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>

  <h2>Transforma un número de decimal a binario</h2>

  <form action="conversor-num-servlet" id="formulario" method="get">

    <div>
      <label for="decimal">Decimal: </label>
      <input type="text" id="decimal" name="decimal" />
      <input type="submit" value="Convertir a binario" />
    </div>

  </form>

  <% if(respuesta!=null){ %>
    <h3><%=respuesta%></h3>
  <% } %>

</body>
</html>