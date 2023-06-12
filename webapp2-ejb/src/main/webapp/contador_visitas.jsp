<%@ page contentType="text/html;charset=UTF-8" %>

<%
    String contador = (String)request.getAttribute("contador");
%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Contador de Visitas</title>
</head>
<body>

    <h1>Bienvenido</h1>

    <h3><%=contador%></h3>

</body>
</html>
