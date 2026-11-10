<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Panel Principal - Hotel La 21</title>

    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>

<body class="blue lighten-5">

<nav class="blue darken-3">
    <div class="nav-wrapper container">
        <a href="#" class="brand-logo">Hotel La 21</a>

    <ul class="right">
        <li><a href="index.html">Inicio</a></li>
        <li><a href="Reservas.jsp">Reservas</a></li>
        <li><a href="ConsultaReservasServlet">Consultar Reservas</a></li>
        <li><a href="login.jsp">Cerrar Sesión</a></li>
    </ul>
    </div>
</nav>

<div class="container">

    <div class="section center">
        <h3>Bienvenido al Sistema Hotel La 21</h3>

        <p>
            Gestión de habitaciones, huéspedes y reservas.
        </p>
    </div>

    <div class="row">

        <div class="col s12 m4">
            <div class="card">
                <div class="card-content">
                    <span class="card-title">Habitaciones</span>
                    <p>Administración de habitaciones.</p>
                </div>
            </div>
        </div>

        <div class="col s12 m4">
            <div class="card">
                <div class="card-content">
                    <span class="card-title">Reservas</span>
                    <p>Control de reservas del hotel.</p>
                </div>
            </div>
        </div>

        <div class="col s12 m4">
            <div class="card">
                <div class="card-content">
                    <span class="card-title">Clientes</span>
                    <p>Administración de huéspedes.</p>
                </div>
            </div>
        </div>

    </div>

</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</body>
</html>