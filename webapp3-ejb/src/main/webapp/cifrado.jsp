<%@ page contentType="text/html;charset=UTF-8" %>

<%
    String mensaje = (String)request.getAttribute("mensaje");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cifrando mensaje</title>
</head>
<body>

  <h2>Usando la interfaz local.</h2>
  <p>Nos sirve para indicar que un EJB es local dentro del servidor de aplicaciones.</p>

  <form action="cifrar-servlet" method="get">
    <label for="mensaje">Mensaje a cifrar</label>
    <input type="text" id="mensaje" name="mensajeCifrar"/>
     <button type="submit">Cifrar</button>
  </form>

  <% if(mensaje!=null){ %>
    <h2><%=mensaje%></h2>
  <% } %>

</body>
</html>