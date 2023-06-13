<%@page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Productos</title>
</head>
<body>

  <h2>Listando productos</h2>

  <ul>
      <c:forEach items="${listado}" var="producto">
        <li>${producto.nombre}</li>
      </c:forEach>
  </ul>

</body>
</html>