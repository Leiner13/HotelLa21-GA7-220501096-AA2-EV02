<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro de Usuarios - Hotel La 21</title>

    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>

<body class="blue lighten-5">

<div class="container">

    <div class="row">
        <div class="col s12 m8 offset-m2">

            <div class="card">

                <div class="card-content">

                    <h4 class="center">
                        Registro de Usuario
                    </h4>

                    <form action="RegistroServlet" method="POST">

                        <div class="input-field">
                            <input type="text"
                                   id="nombre"
                                   name="nombre"
                                   required>

                            <label for="nombre">
                                Nombre Completo
                            </label>
                        </div>

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
                            <button class="btn green"
                                    type="submit">
                                Registrarse
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