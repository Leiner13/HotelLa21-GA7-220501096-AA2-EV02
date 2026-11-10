<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Iniciar Sesión - Hotel La 21</title>

    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>

<body class="blue lighten-5">

<div class="container">

    <div class="row">
        <div class="col s12 m6 offset-m3">

            <div class="card">
                <div class="card-content">

                    <h4 class="center">
                        Iniciar Sesión
                    </h4>

                    <form action="LoginServlet" method="POST">

                        <div class="input-field">
                            <input type="email"
                                   id="correo"
                                   name="correo"
                                   required>

                            <label for="correo">
                                Correo Electrónico
                            </label>
                        </div>

                        <div class="input-field">
                            <input type="password"
                                   id="password"
                                   name="password"
                                   required>

                            <label for="password">
                                Contraseña
                            </label>
                        </div>

                        <div class="center">
                            <button class="btn blue darken-3"
                                    type="submit">
                                Ingresar
                            </button>
                        </div>

                    </form>

                    <br>

                    <div class="center">
                        <a href="Registro.jsp">
                            Registrarse
                        </a>
                        |
                        <a href="#">
                            Recuperar contraseña
                        </a>
                    </div>

                </div>
            </div>

        </div>
    </div>

</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</body>
</html>