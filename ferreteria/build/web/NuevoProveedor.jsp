<%-- 
    Document   : NuevoProveedor.jsp
    Created on : 22/06/2020, 08:24:42 PM
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Proveedor</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
              integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


        <style>
            .alto {
                height: 600px;
            }

            .altoTabla {
                height: 100px;
            }

            .ancho {
                width: 100%;
            }
        </style>
    </head>
    <body>

        <div class="container">
            <h1>Llena los campos para ingresar un nuevo proveedor</h1>

            <div class="row mt-3" name="Navegador">
                <div class="col">
                    <nav aria-label="breadcrumb">

                        <ol class="breadcrumb">
                            <li class="breadcrumb-item">
                                <a href="ventas.jsp">Inicio</a>
                            </li>
                            <li class="breadcrumb-item active" aria-current="page">
                                <a href="basedatosproveedores.jsp">Base de datos</a>
                            </li>

                        </ol>

                    </nav>
                </div>
            </div>
            <hr>
            <div class="row" name="tabla2">

                <div class="col altoTabla mb-2">
                    <form action="BDProveedorIS">


                        <table border="2" class=" rounded ancho text-center"> 
                            <thead>
                                <tr><td class="bg-warning" colspan="5">Tabla Proveedores</td></tr>
                                <tr class="bg-dark text-white">
                                    <td>Id</td>
                                    <td>Nombre</td>
                                    <td>Apellido paterno</td>
                                    <td>Apellido materno</td>
                                    <td>Contacto</td>

                                </tr>
                            </thead>



                            <tr>

                                <td><input type="text" value="idproveedor" name="idproveedor"> </td>
                                <td><input type="text" value="nombre" name="nombre"> </td>
                                <td><input type="text" value="ap" name="ap"> </td>
                                <td><input type="text" value="am" name="am"> </td>
                                <td><input type="text" value="contacto" name="contacto"> </td>


                            </tr>


                        </table>
                        <br>

                        <input type="submit" class="btn btn-danger" value="Guardar">
                        <input type="button" class="btn btn-primary " onclick="location.href = 'basedatosproveedores.jsp'" value="Cancelar">
                    </form>

                </div>
            </div>
        </div>



    </body>

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
            integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
    crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
    crossorigin="anonymous"></script>
</html>
