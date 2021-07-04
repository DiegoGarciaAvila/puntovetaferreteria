<%-- 
    Document   : basedatosproductos
    Created on : 23/06/2020, 11:02:05 AM
    Author     : Diego
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Base de datos productos</title>
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
            <div class="row mt-3" name="Navegador">
                <div class="col">
                    <nav aria-label="breadcrumb">

                        <ol class="breadcrumb">
                            <li class="breadcrumb-item">
                                <a href="ventas.jsp">Inicio</a>
                            </li>
                            <li class="breadcrumb-item active" aria-current="page">
                                <a href="basedatosproductos.jsp">Base de datos</a>
                            </li>

                        </ol>

                    </nav>
                </div>
            </div>
            <hr>
            <div class="row" name="tablaProductos">

                <div class="col mb-2">
                    <table border="2" class="ancho text-center ">  
                        <thead>
                            <tr><td class="bg-warning" colspan="8">Tabla Productos</td></tr>
                            <tr class="bg-dark text-white">
                                <td>Id</td>
                                <td>Nombre</td>
                                <td>Precio Venta</td>
                                <td>Precio Compra</td>                             
                                <td>Tocks</td>
                                <td>Proveedor</td>
                                <td colspan="2">Acciones</td>
                            </tr>
                        </thead>

                        <%

                            ArrayList<Encapsulamiento.Dproductos> al = new farreteria.DAOProductos().getListaProductos();
                            int tam = al.size();
                            for (int i = 0; i < tam; i++) {
                        %>


                        <tr>
                            <td><%=al.get(i).getIdproducto()%></td>
                            <td><%=al.get(i).getNombre()%></td>
                            <td><%=al.get(i).getPrecioventa()%></td>
                            <td><%=al.get(i).getPreciocompra()%></td>
                            <td><%=al.get(i).getTocks()%></td>
                            <td><%=al.get(i).getIdproveedor()%></td>
                            <td>
                                <form action="BDProductosES">
                                    <input type="hidden" name="eliminar" value="<%=al.get(i).getIdproducto()%>">
                                    <input type="submit" class="btn btn-danger btn-sm ancho" value="Eliminar">
                                </form>
                            </td>
                            <td>
                                <form action="ModificaProducto.jsp">
                                    <input type="hidden" name="modificar" value="<%=al.get(i).getIdproducto()%>">
                                    <input type="submit" class="btn btn-primary btn-sm ancho" value="Modificar">
                                </form>
                            </td>
                        </tr>

                        <%
                            }
                        %>
                    </table>

                </div>
                <div class="w-100"></div>
                <div class="col mb-2">
                    <input class="btn btn-sm btn-success" value="Nuevo" onclick="location.href='NuevoProducto.jsp'">
                </div>

            </div>
            <hr>
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
