<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fibonacci</title>
</head>
<body>

  <h1>Sucesión de Fibonacci</h1>
  <form action="fibonacci-servlet" method="GET">
    <label for="numero">Ingrese un número:</label>
    <input type="number" name="numero" id="numero" required>
    <button type="submit">Generar</button>
  </form>
  <br>
  <h2>Sucesión:</h2>
  <p>${sucesion}</p>

</body>
</html>