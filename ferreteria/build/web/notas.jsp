<%-- 
    Document   : notas
    Created on : 11/05/2020, 11:32:15 PM
    Author     : Diego
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Encapsulamiento.Dnotas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Ventas</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
              integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">




    </head>


    <style>
        .largo {
            width: 100%;
        }

        .alto {

            height: 550px;
        }

        .altoDescripcion {
            height: 400px;
        }
    </style>

    <body>

        <div class="container" name="principal">
            <div class="row mt-3" name="Navegador">
                <div class="col">
                    <nav aria-label="breadcrumb">

                        <ol class="breadcrumb">
                            <li class="breadcrumb-item">
                                <a href="ventas.jsp">Inicio</a>
                            </li>
                            <li class="breadcrumb-item active" aria-current="page">
                                <a href="notas.jsp">Notas</a>
                            </li>

                        </ol>

                    </nav>
                </div>
            </div>


            <div class="row mt-4 alto" name="dosfilas ">



                <div class="col border border-dark rounded ml-3" name="cuerpo">

                    <div class="row mt-4" name="nombre">
                        <div class="col largo text-center">
                            <h3>Notas</h3>
                        </div>
                    </div>
                    <hr>
                    <div class="row" name="descripcion">

                        <div class="col ">

                            <table border="1" class="largo text-center">

                                <thead>
                                    <tr>
                                        <td colspan="3" class="bg-warning"> Lista Actividades</td>
                                    </tr>
                                    <tr>
                                        <td class="bg-dark text-white">#</td>
                                        <td class="bg-dark text-white">Descripcion</td>
                                        <td class="bg-dark text-white">Dirigido a </td>
                                    </tr>
                                </thead>

                                <%

                                    ArrayList<Encapsulamiento.Dnotas> dn = new farreteria.DAONotas().getListaNotas();
                                    int tam = dn.size();
                                    for (int i = 0; i < tam; i++) {
                                %>        


                                <tr>
                                    <td class="bg-primary"><%=dn.get(i).getIdnotas()%></td>
                                    <td><%=dn.get(i).getDescripcion()%></td>
                                    <td><%=dn.get(i).getIdpersonal()%></td>
                                </tr>
                                <%    }

                                %>
                            </table>

                        </div>

                    </div>
                    <hr>

                    <div class="row justify-content-center text-center" name="nuevo">
                        <form action="NuevaNotaS">
                            <h6>Si deseas hacer una nueva nota llena los siguientes campos</h6>
                            <div class="col ">
                                <input type="text" name="idnotas" class="bg-info" value="idnotas(Numero)">
                                <input type="text" name="descripcion" class="bg-info"value="descripcion">
                                <input type="text" name="idpersonal" class="bg-info" value="idpersonal(Numero)">
                                <input type="submit" class="btn btn-success" value="Crear nuevo">
                            </div>

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
