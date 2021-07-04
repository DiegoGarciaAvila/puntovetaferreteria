<%-- 
    Document   : ModificaProducto.jsp
    Created on : 23/06/2020, 12:45:46 PM
    Author     : Diego
--%>

<%@page import="farreteria.DAOProductos"%>
<%@page import="Encapsulamiento.Dproductos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modifica Producto</title>
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

            <h1>Llena los campos a modificar del producto</h1>


            <hr>

            <div class="row" name="tablaProductos">

                <div class="col mb-2">
                    <form action="BDProductoMoS">
                        <table border="2" class="ancho text-center ">  
                            <thead>
                                <tr><td class="bg-warning" colspan="6">Tabla Productos</td></tr>
                                <tr class="bg-dark text-white">
                                    <td>Id</td>
                                    <td>Nombre</td>
                                    <td>Precio Compra</td>
                                    <td>Precio Venta</td>
                                    <td>tocks</td>
                                    <td>Provedor</td>
                                </tr>
                            </thead>
                            
                            <%
                            String idproducto = request.getParameter("modificar");
                            Dproductos dp = new DAOProductos().getModificaProduto(idproducto);
                            %>
                            
                            <tr>
                                <td><input type="text" name="idproducto" value="<%=dp.getIdproducto() %>"</td>
                                <td><input type="text" name="nombre" value="<%=dp.getNombre() %>"></td>
                                <td><input type="text" name="precioventa" value="<%=dp.getPrecioventa() %>"></td>
                                <td><input type="text" name="preciocompra" value="<%=dp.getPreciocompra() %>"></td>
                                <td><input type="text" name="tocks" value="<%=dp.getTocks() %>"></td>
                                <td><input type="text" name="idproveedor" value="<%=dp.getIdproveedor() %>"></td>

                            </tr>
                        </table>
                        <hr>

                        <input type="submit" name="idproveedor" value="Guardar" class="btn btn-success">
                        <input type="button" name="idproveedor" value="Cancelar" class="btn btn-danger" onclick="location.href = 'basedatosproductos.jsp'">

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
