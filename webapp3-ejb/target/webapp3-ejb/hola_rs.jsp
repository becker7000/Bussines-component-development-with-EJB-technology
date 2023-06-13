<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Request Scope</title>
</head>
<body>

  <h2>Usando CDI en vez del contexto de EJB</h2>
  <h3>${mensaje1}</h3>
  <h3>${mensaje2}</h3>

  <p>CDI: Contexts and dependency injection.</p>
  <p>En este caso el contador se mantiene fijo, ya que estamos usando Request Scope</p>
  <p> Cada solicitud HTTP tiene su propio conjunto de objetos asociados a ella.
      Los objetos creados en este contexto están disponibles durante toda la duración
      de la solicitud y se destruyen al finalizar.</p>
  <p>Por eso el contador siempre vale 1 y 2 porque estos valores se reinician con cada solicitud nueva.</p>
  <p>Por eso la instancia del EJB stateful cambia con cada solicitud nueva.</p>

</body>
</html>