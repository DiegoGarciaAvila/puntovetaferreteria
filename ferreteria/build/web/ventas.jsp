<%-- 
    Document   : ventas
    Created on : 6/05/2020, 08:03:40 PM
    Author     : Diego
--%>

<%@page import="Encapsulamiento.DDetalleVenta"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"><html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Ventas</title>

            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
                  integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


            <style>
                .busqueda {
                    width: 100%;
                }

                .ventas {

                    height: 100%;
                }

                .productos {
                    height: 350px;
                }

                .info {
                    height: 100px;
                }
            </style>


        </head>

        <body>


            <div class="container" name="Principal">
                <div class="row mt-4" name="Navegador">
                    <div class="col">
                        <nav aria-label="breadcrumb">

                            <ol class="breadcrumb">

                                <li class="breadcrumb-item active" aria-current="page">
                                    <a href="ventas.jsp">Inicio-Ventas</a>
                                </li>

                            </ol>
                        </nav>
                    </div>
                </div>


                <div class="row">


                    <div class="col-2 btn-toolbar bg-white mt-4 mx-3 rounded" name="BarraOpciones">

                        <div class=" btn-group-vertical bg-dark">

                            <div class="btn btn-outline-info py-3 ">
                                <a href="ventas.jsp" class="text-white">Ventas</a>
                            </div>
                            <div class="btn btn-outline-info py-3">
                                <a href="encargos.jsp" class="text-white">Encargos</a>
                            </div>
                            <div class="btn btn-outline-info py-3">
                                <a href="notas.jsp" class="text-white">Notas</a>
                            </div>
                            <div class="btn btn-outline-info py-3">
                                <a href="pedidos.jsp" class="text-white">Pedidos</a>
                            </div>
                            <div class="btn btn-outline-info py-3">
                                <a href="GraficaVentas.jsp" class="text-white">Grafica ventas</a>
                            </div>

                            <div class="btn btn-outline-info py-3">
                                <a href="GraficaGanancias.jsp" class="text-white">Grafica ganancias</a>
                            </div>
                            <div class="btn btn-outline-info py-3">
                                <select  value="Base de datos" class="btn  text-white" name="basedatos" onchange="location = this.value;">
                                    <option class="text-dark" value="ventas.jsp">
                                        Bases de datos ...
                                    </option>

                                    <option class="text-dark" value="basedatos.jsp">
                                        Empleados 
                                    </option>

                                    <option class="text-dark" value="basedatosproveedores.jsp">
                                        Proveedores
                                    </option>

                                    <option class="text-dark" value="basedatosproductos.jsp">
                                        Inventario
                                    </option>
                                </select>
                            </div>

                            <div class="btn btn-outline-info py-3">
                                <a href="ventas.jsp" class="text-white">Salir</a>
                            </div>

                        </div>

                    </div>

                    <div class="col-4 mx-3 mt-4 " name="barraventas">

                        <table border="2" class="ancho bg-dark  text-center">
                            <thead>
                                <tr>
                                    <td colspan="6" class="bg-warning rounded"> Encargos </td>
                                </tr>
                                <tr>
                                    <td class="bg-dark text-white">#</td>                                   
                                    <td class="bg-dark text-white">Fecha realizado </td>
                                    <td class="bg-dark text-white">total </td>
                                    <td class="bg-dark text-white">Personal que lo realizo </td>
                                    <td class="bg-dark text-white" colspan="2">Acciones </td>
                                </tr>
                            </thead>

                            <%
                                ArrayList<Encapsulamiento.DVentas> al = new farreteria.DAOVentas().getListaVentas();
                                int tam = al.size();
                                for (int i = 0; i < tam; i++) {

                            %>


                            <tr class="text-white">
                                <td> <%=al.get(i).getIdventa()%> </td>
                                <td> <%=al.get(i).getFecha()%> </td>
                                <td> <%=al.get(i).getTotal()%></td>
                                <td> <%=al.get(i).getIdpersonal()%> </td>

                                <td> 
                                    <form action="TotalVentaS" >
                                        <input type="hidden" name="total" value="<%=al.get(i).getIdventa()%>">
                                        <input type="submit"  class="btn btn-primary" value="Sacar Total">
                                    </form>
                                </td>
                                <td> 
                                    <form action="ventas.jsp" >
                                        <input type="hidden" name="ver" value="<%=al.get(i).getIdventa()%>">
                                        <input type="submit"  class="btn btn-success" value="Ver">
                                    </form>
                                </td>
                            </tr>

                            <%     }
                            %>
                        </table>
                        <form action="NuevaVentaS">
                            <div class="row mt-5 text-start" >
                                <div class="col">
                                    <h6>Si deseas agreagar una nueva venta llena los siguientes campos</h6>
                                    <br>

                                    <input type="text" class="bg-info text-dark" name="idventa" value="idventa">
                                    <input type="text" class="bg-info text-dark" name="fecha"    value="fecha">
                                    <input type="text" class="bg-info text-dark" name="idpersonal" value="idpersonal">

                                    <br>  
                                    <br>  
                                    <input type="submit" class="btn btn-success" text-white value="+">
                                </div>

                            </div>                         
                        </form>

                    </div>



                    <div class="col-5 mt-4 ml-3 "  name="ventas">


                        <div class="row rounded " name="productos ">

                            <div class="col col-lx-8 busqueda">
                                <table border="2" >

                                    <thead class="text-center py-4 ">
                                        <tr class="text-center  bg-warning" >

                                            <td colspan="8">
                                                Lista Productos
                                            </td>
                                        </tr>

                                        <tr class="text-center  bg-dark">
                                            <td class="text-white">#</td>
                                            <td class="text-white">Nombre</td>
                                            <td  class="text-white">Cantidad</td>
                                            <td  class="text-white"> Precio Pieza</td>                               
                                            <td  class="text-white"> Subtotal</td>
                                            <td  class="text-white"> Acciones</td>
                                        </tr>

                                    </thead>

                                    <%
                                        String idvent = request.getParameter("ver");
                                        ArrayList<DDetalleVenta> des = new farreteria.DAODetalleVenta().getListaDetalleVentas(idvent);
                                        int tam2 = des.size();
                                        for (int i = 0; i < tam2; i++) {

                                    %>


                                    <tr class="text-center">
                                        <td ><%=des.get(i).getIdventa()%></td>
                                        <td ><%=des.get(i).getIdproducto()%></td>
                                        <td ><%=des.get(i).getCantidad()%></td>
                                        <td ><%=des.get(i).getPreciopieza()%></td>
                                        <td > <%=des.get(i).getSubtotal()%></td>
                                        <td >
                                            <form action="EliminarDetalleVentaS">
                                                <input type="hidden" name="eliminar" value="<%=des.get(i).getIdventa()%>">
                                                <input type="hidden" name="eliminar2" value="<%=des.get(i).getIdproducto() %>">
                                                <input type="submit" class="btn bg-danger text-white" value="Elminar">
                                            </form>

                                        </td>
                                    </tr>
                                    <%                                        }
                                    %>
                                </table>

                            </div>
                        </div>
                        <br>

                        <form action="NuevoDetalleVentaS">
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

