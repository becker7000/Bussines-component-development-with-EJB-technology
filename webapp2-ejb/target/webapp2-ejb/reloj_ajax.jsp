<!DOCTYPE html>
<html>
<head>
  <title>Reloj AJAX</title>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
  <h1>Reloj con AJAX:</h1>
  <h1 id="clock"></h1>
  <script>
    $(document).ready(function() {
      setInterval(obtenerTiempo, 1000);
    });

    function obtenerTiempo() {
      $.ajax({
        url: "reloj-servlet", // Ruta del servlet Java
        type: "GET",
        success: function(response) {
          $("#clock").text(response);
        },
        error: function(xhr, status, error) {
          console.log("Error al obtener la hora: " + error);
        }
      });
    }
  </script>
</body>
</html>