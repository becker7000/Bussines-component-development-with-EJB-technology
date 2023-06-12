<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Área de un circulo</title>
    <style>
        label,input,button{
            margin: 4px;
        }
    </style>
</head>
<body>

  <h2>Calcula el área de un círculo.</h2>

  <form action="area-circulo-servlet" method="get">
    <div>
      <label for="radio">Escribe el radio: </label><br/>
      <input type="text" id="radio" name="radio" size="8" required><br/>
      <button type="submit">Calcular área</button>
    </div>
  </form>
  <br/>

  <div>
    <h2>Resultado: </h2>
    <p>${area}</p>
  </div>

</body>
</html>