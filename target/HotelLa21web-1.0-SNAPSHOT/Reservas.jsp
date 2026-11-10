<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reservas - Hotel La 21</title>

    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>

<body class="blue lighten-5">

    <nav class="blue darken-3">
        <div class="nav-wrapper container">
            <a href="principal.jsp" class="brand-logo">Hotel La 21</a>

            <ul class="right">
                <li><a href="principal.jsp">Inicio</a></li>
            </ul>
        </div>
    </nav>

    <div class="container">

        <div class="row" style="margin-top:30px;">

            <div class="col s12 m8 offset-m2">

                <div class="card">

                    <div class="card-content">

                        <span class="card-title center">
                            Registro de Reserva
                        </span>

                        <form action="ReservaServlet" method="post">

                            <div class="input-field">
                                <input type="text"
                                       id="nombre"
                                       name="nombre"
                                       required>

                                <label for="nombre">
                                    Nombre del Huésped
                                </label>
                            </div>

                            <div class="input-field">
                                <input type="text"
                                       id="documento"
                                       name="documento"
                                       required>

                                <label for="documento">
                                    Documento
                                </label>
                            </div>

                            <div class="input-field">
                                <input type="date"
                                       id="fechaIngreso"
                                       name="fechaIngreso"
                                       required>
                            </div>

                            <div class="input-field">
                                <input type="date"
                                       id="fechaSalida"
                                       name="fechaSalida"
                                       required>
                            </div>

                            <div class="input-field">
                                <input type="number"
                                       id="habitacion"
                                       name="habitacion"
                                       required>

                                <label for="habitacion">
                                    ID Habitación
                                </label>
                            </div>

                            <div class="center">
                                <button class="btn green" type="submit">
                                    Registrar Reserva
                                </button>
                            </div>

                        </form>

                    </div>

                </div>

            </div>

        </div>

    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</body>
</html>