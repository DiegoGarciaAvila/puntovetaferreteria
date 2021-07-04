<%-- 
    Document   : encargos
    Created on : 12/05/2020, 12:29:47 PM
    Author     : Diego
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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

        <div class="container" name="Principal">


            <div class="row mt-3" name="Navegador">
                <div class="col">
                    <nav aria-label="breadcrumb">

                        <ol class="breadcrumb">
                            <li class="breadcrumb-item">
                                <a href="ventas.jsp">Inicio</a>
                            </li>
                            <li class="breadcrumb-item active" aria-current="page">
                                <a href="encargos.jsp">Encargos</a>
                            </li>

                        </ol>

                    </nav>
                </div>
            </div>

            <div class="row justify-content-center alto" name="DosFilas">

                <div class="col rounded border border-dark" name="BarraLaterarl">

                    <div class="row justify-content-center mt-3  px-1">
                        <div class="col  ">

                            <table border="2" class="ancho bg-dark  text-center">
                                <thead>
                                    <tr>
                                        <td colspan="6" class="bg-warning rounded"> Encargos </td>
                                    </tr>
                                    <tr>
                                        <td class="bg-dark text-white">#</td>
                                        <td class="bg-dark text-white">A nombre de: </td>
                                        <td class="bg-dark text-white">Fecha realizado </td>
                                        <td class="bg-dark text-white">total </td>

                                        <td class="bg-dark text-white" colspan="2">Acciones </td>
                                    </tr>
                                </thead>

                                <%
                                    ArrayList<Encapsulamiento.DEncargos> al = new farreteria.DAOEncargos().getListaEncargos();
                                    int tam = al.size();
                                    for (int i = 0; i < tam; i++) {


                                %>


                                <tr class="text-white">
                                    <td> <%=al.get(i).getIdencargo()%> </td>
                                    <td> <%=al.get(i).getNombre()%> </td>
                                    <td> <%=al.get(i).getFecharealizado()%> </td>
                                    <td> <%=al.get(i).getTotal()%></td>
                                    <td> 
                                        <form action="TotalEncargoS" >
                                            <input type="hidden" name="total" value="<%=al.get(i).getIdencargo()%>">
                                            <input type="submit"  class="btn btn-primary" value="Sacar Total">
                                        </form>
                                    </td>
                                    <td> 
                                        <form action="encargos.jsp" >
                                            <input type="hidden" name="ver" value="<%=al.get(i).getIdencargo()%>">
                                            <input type="submit"  class="btn btn-success" value="Ver">
                                        </form>
                                    </td>
                                </tr>

                                <%     }
                                %>
                            </table>

                        </div>
                    </div>
                    <form action="NuevoEncargoS">
                        <div class="row mt-5 text-start" >
                            <div class="col">
                                <h6>Si deseas agreagar un nuevo encargo llena los siguientes campos</h6>
                                <br>

                                <input type="text" class="bg-info text-dark" name="idencargo" value="Num">
                                <input type="text" class="bg-info text-dark" name="nombre"    value="nombre">
                                <input type="text" class="bg-info text-dark" name="fecharealizado" value="fecharealizado">

                                <br>  
                                <br>  
                                <input type="submit" class="btn btn-success" text-white value="+">
                            </div>

                        </div>                         
                    </form>



                </div>

                <div class="col ml-2 pt-1 rounded border border-dark" name="Cuerpo">

                    <div class="row justify-content-center ">
                        <div class="col  ">
                            <table border="1" class="ancho mt-3 rounded bg-dark text-center text-white">
                                <thead>
                                    <tr>
                                        <td class="bg-warning text-dark" colspan="8">Productos</td>
                                    </tr>
                                    <tr>
                                        <td>#</td>
                                        <td>Nombre</td>
                                        <td>Cantidad</td>
                                        <td>Precio Pieza</td>
                                        <td>Subtotal</td>
                                        <td>Acciones</td>

                                    </tr>
                                </thead>
                                <%
                                    String idencarg = request.getParameter("ver");
                                    ArrayList<Encapsulamiento.DDetalleEncargo> al2 = new farreteria.DAODetalleEncargo().getListaDetalleEncargos(idencarg);
                                    int lag = al2.size();
                                    for (int i = 0; i < lag; i++) {


                                %>

                                <tr>
                                    <td><%=al2.get(i).getIdencargo()%></td>
                                    <td><%=al2.get(i).getIdproducto()%></td>
                                    <td><%=al2.get(i).getCantidad()%></td>
                                    <td><%=al2.get(i).getPreciopieza()%></td>
                                    <td><%=al2.get(i).getSubtotal()%></td>
                                    <td> 
                                        <form action="EliminarDetalleEncargoS">
                                            <input type="hidden" name="idencargo" value="<%=al2.get(i).getIdencargo() %>">
                                            <input type="hidden" name="idproducto" value="<%=al2.get(i).getIdproducto() %>">
                                            <input type="submit" class="btn bg-danger text-white" value="Elminar">
                                        </form>
                                    </td>

                                </tr>
                                <%                                    }
                                %>
                            </table>
                        </div>

                    </div>
                    <form action="NuevoDetalleEncargoS">
                        <div class="row mt-5 text-start" >
                            <div class="col">
                                <h6>Si deseas agregar un nuevo producto llena los siguientes campos</h6>
                                <br>

                                <input type="text" class="bg-info text-dark" name="idencargo" value="NumEncargo(numero)">
                                <input type="text" class="bg-info text-dark" name="idproducto" value="NumProducto(numero)">
                                <input type="text" class="bg-info text-dark" name="cantidad" value="cantidad">

                                <br>  
                                <br>  
                                <input type="submit" class="btn btn-sm btn-danger" text-white value="Agregar">
                            </div>

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