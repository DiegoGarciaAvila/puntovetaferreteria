<%-- 
    Document   : basedatos
    Created on : 13/05/2020, 08:25:44 PM
    Author     : Diego
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ventas</title>

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


<style>

</style>

<body>

    <div class="container  alto " name="Principal">

        <div class="row mt-3" name="Navegador">
            <div class="col">
                <nav aria-label="breadcrumb">

                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="ventas.jsp">Inicio</a>
                        </li>
                        <li class="breadcrumb-item active" aria-current="page">
                            <a href="basedatos.jsp">Base de datos</a>
                        </li>

                    </ol>

                </nav>
            </div>
        </div>
        <hr>
        <div class="row text-center my-3 " name ="botones">

            <div class="col">
                <button class="btn btn-primary btn-sm text-dark">Productos</button>
            </div>

            <div class="col">
                <button class="btn btn-primary btn-sm text-dark"> Proveedores</button>
            </div>

            <div class="col">
                <button class="btn btn-primary btn-sm text-dark">Empleados</button>
            </div>
        </div>

        <div class="row" name="tabla3">

            <div class="col mb-2">
                <table border="2" class="ancho text-center"> 
                    <thead>
                        <tr><td  class="bg-warning " colspan="10">Tabla Empleados</td></tr>
                        <tr class="bg-dark text-white">
                            <td>Id</td>
                            <td>Nombre</td>
                            <td>Apellido Materno</td>
                            <td>Apellido Paterno</td>
                            <td>Salario</td>
                            <td>Password</td>
                            <td>Cargo</td>
                            <td>Contacto</td>
                            <td colspan="2">Acciones</td>
                        </tr>
                    </thead>

                    <%
                        //Creamos un arraylist que pueda contener a un personal, y le daremos valor segun lo que encuentre el metodo llamanado
                        ArrayList<Encapsulamiento.Dpersonal> personal = new farreteria.DAOPersonal().ListaPersonal();
                        int tam = personal.size();
                        for (int i = 0; i < tam; i++) {
                    %>       


                    <tr>
                        <td name="id"><%=personal.get(i).getIdpersonal()%></td>
                        <td name="nombre"><%=personal.get(i).getNombre()%></td>
                        <td name="am"><%=personal.get(i).getAm()%></td>
                        <td name="am"><%=personal.get(i).getAp()%></td>
                        <td name="salario"><%=personal.get(i).getSalario()%></td>
                        <td name="contra"><%=personal.get(i).getContra()%></td>
                        <td name="cargo"><%=personal.get(i).getSalario()%></td>
                        <td name="contacto"><%=personal.get(i).getTelefono()%></td>
                        <td>
                            <form name="btnEliminar" action="DBUsuarioES">
                                <input type="hidden" name ="eliminar" value="<%=personal.get(i).getIdpersonal()%>">
                                <input type="submit"class="btn btn-sm btn-danger ancho" value="Eliminar">
                            </form>
                        </td>
                        <td>
                            <form name="btnModificar" action="modificaPersonal.jsp">
                                <input type="hidden" name ="modificar" value="<%=personal.get(i).getIdpersonal()%>">
                                <input type="submit"class="btn btn-sm btn-info ancho" value="Modificar">
                            </form>
                        </td>

                    </tr>
                    <%  }

                    %>

                </table>

            </div>
            <div class="w-100"></div>
            <div class="col mb-2">
                <button class="btn btn-sm btn-success" onclick="location.href = 'NuevoPersonal.jsp'">
                    Nuevo
                </button>

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