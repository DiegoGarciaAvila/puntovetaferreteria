<%-- 
    Document   : ModificarProveedores
    Created on : 22/06/2020, 11:11:43 PM
    Author     : Diego
--%>

<%@page import="Encapsulamiento.Dproveedores"%>
<%@page import="farreteria.DAOProveedores"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar proveedores</title>
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

            <h1>Ingresa los datos a modificar</h1>

            <div class="row mb-2" name="tablaProveedores">

                <div class="col mb-2">
                    <form action="BDProveedoresMoS">

                        <table border="2" class=" rounded ancho text-center mb-2"> 
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

                            <%
                                String idproveedor = request.getParameter("modificar");
                                Dproveedores dp = new DAOProveedores().getMoficarProveedores(idproveedor);

                            %>

                            <tr>
                                <%                            //Para obtener los valores necesitamos la posicion de i, y le agregamos el valor que nececitemos obtener
                                %>
                                <td><input type="text" name="idproveedor" value="<%=dp.getIdproveedor()%>"> </td>
                                <td><input type="text" name="nombre" value="<%=dp.getNombre()%>"></td>
                                <td><input type="text" name="ap" value="<%=dp.getAp()%>"></td>
                                <td><input type="text" name="am" value="<%=dp.getAm()%>"></td>
                                <td><input type="text" name="contacto" value="<%=dp.getContacto()%>"></td>

                            </tr>

                        </table>

                        <br>

                        <input type="submit" class="btn btn-sm btn-success" value="Guardar">         
                        <input type="button" class="btn btn-sm btn-danger " value="Cancelar" onclick="location.href = 'basedatosproveedores.jsp'">         

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
