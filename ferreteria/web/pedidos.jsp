<%-- 
    Document   : pedidos
    Created on : 13/05/2020, 07:45:55 PM
    Author     : Diego
--%>

<%@page import="Encapsulamiento.DDetallePedido"%>
<%@page import="farreteria.DAODetallePedido"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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
                height: 400px;
            }

            .ancho {
                width: 100%;
            }
        </style>


    </head>


    <style>

    </style>

    <body>

        <div class="container  alto" name="Principal">


            <div class="row mt-3" name="Navegador">
                <div class="col">
                    <nav aria-label="breadcrumb">

                        <ol class="breadcrumb">
                            <li class="breadcrumb-item">
                                <a href="ventas.jsp">Inicio</a>
                            </li>
                            <li class="breadcrumb-item active" aria-current="page">
                                <a href="pedidos.jsp">Pedidos</a>
                            </li>

                        </ol>

                    </nav>
                </div>
            </div>

            <div class="row bg-dark text-center py-3 rounded" name="Buscador">

                <div class="col ">
                    <button class="btn btn-primary">
                        Proveedores
                    </button>
                </div>

            </div>

            <div class="row  rounded justify-content-center my-4" name="dosfilas">

                <div class="col col-xl-3 col-md-4 border border-dark rounded " name="notas">

                    <hr>

                    <div class="row " name="tablaNotas">
                        <div class="col ">
                            <table border="2" class="ancho text-center ">
                                <thead>
                                    <tr class="bg-warning">
                                        <td colspan="4"> Pedidos </td>
                                    </tr>

                                    <tr class="bg-dark text-white">
                                        <td> # </td>
                                        <td> Fecha</td>
                                        <td colspan="2">Accion</td>
                                    </tr>
                                </thead>

                                <%

                                    ArrayList<Encapsulamiento.Dpedidos> al = new farreteria.DAOPedidos().getListaPedidos();
                                    int tam = al.size();
                                    for (int i = 0; i < tam; i++) {

                                %>



                                <tr class="bg-dark">
                                    <td class="bg-dark text-white"><%=al.get(i).getIdpedido()%></td>
                                    <td class="bg-dark text-white"><%=al.get(i).getFecha()%></td>
                                    <td>
                                        <form action="VerDetallePedidoS" name="generar">
                                            <input type="hidden" name="verdetallepedido" value="<%=al.get(i).getIdpedido()%>">
                                            <input type="submit" value="Generar" class="btn btn-primary ancho">
                                        </form>
                                    </td>
                                    <td>
                                        <form action="pedidos.jsp" name="ver">
                                            <input type="hidden" name="verpedido" value="<%=al.get(i).getIdpedido()%>">
                                            <input type="submit" value="Ver" class="btn btn-success ancho">
                                        </form>
                                    </td>

                                </tr>
                                <%     }
                                %>
                            </table>
                        </div>


                    </div>

                    <hr>
                    <form action="VerPedidosS" name="NuevoPedido">
                        <div class=" row mt-5 justify-content-center text-center" name="nuevo">
                            <h6 >Si deceas agregar un nuevo llena los siguientes campos</h6>

                            <input type="text" name="idpedido" class="bg-info rounded my-2" value="Numero Pedido">

                            <input type="text" name="fecha" class="bg-info rounded my-2" value="Fecha de realizacion">

                        </div>

                        <div class="row mt-3 justify-content-center" name="agregar">

                            <input type="submit" class="btn btn-primary rounded my-2" value="+">

                        </div>
                    </form>


                </div>

                <div class="col" name ="tablaDetallePedido">

                    <table border="1" class="ancho rounded text-center">

                        <thead>
                            <tr class="text-center bg-warning ">
                                <td colspan="7">Lista Pedidos a Proveedores</td>
                            </tr>
                            <tr class="bg-dark text-white ">
                                <td>N.Pedido</td>
                                <td>Nombre Producto</td>                                
                                <td>Tocks</td>
                            </tr>

                        </thead>


                        <%
                            String idpedido = request.getParameter("verpedido");
                            ArrayList<DDetallePedido> dpp = new farreteria.DAODetallePedido().getDetallePedido(idpedido);
                            for (int i = 0; i < dpp.size(); i++) {
                        %>     


                        <tr>

                            <td><%=dpp.get(i).getIdpedido()%></td>
                            <td><%=dpp.get(i).getIdproducto()%></td>
                            <td><%=dpp.get(i).getCantidad()%></td>

                        </tr>
                        <%      }
                        %>
                    </table>

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
