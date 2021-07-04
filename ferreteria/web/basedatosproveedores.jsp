<%-- 
    Document   : basedatosproveedores
    Created on : 22/06/2020, 07:35:21 PM
    Author     : Diego
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proveedores</title>
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

        <div class="container  alto " name="Principal">
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
            <div class="row mb-2" name="tablaProveedores">

                <div class="col mb-2">
                    <table border="2" class=" rounded ancho text-center mb-2"> 
                        <thead>
                            <tr><td class="bg-warning" colspan="7">Tabla Proveedores</td></tr>
                            <tr class="bg-dark text-white">
                                <td>Id</td>
                                <td>Nombre</td>
                                <td>Apellido paterno</td>
                                <td>Apellido materno</td>
                                <td>Contacto</td>
                                <td colspan="2">Acciones</td>
                            </tr>
                        </thead>

                        <%
                            //Abrimos un arraylist para poder guardar lo que se encuentra en el metodo de obtencion de lista de proveedores
                            ArrayList<Encapsulamiento.Dproveedores> al = new farreteria.DAOProveedores().getListaProveedores();
                            //Creamos una variable que sea igual al tamaño de la tabla
                            int tam = al.size();
                            for (int i = 0; i < tam; i++) {
                        %>

                        <tr>
                            <%
                                //Para obtener los valores necesitamos la posicion de i, y le agregamos el valor que nececitemos obtener
                            %>
                            <td><%=al.get(i).getIdproveedor()%></td>
                            <td><%=al.get(i).getNombre()%></td>
                            <td><%=al.get(i).getAp()%></td>
                            <td><%=al.get(i).getAm()%></td>
                            <td><%=al.get(i).getContacto()%></td>
                            <td>
                                <form action="BDProveedorES">
                                    <input type="hidden" name="eliminar" value="<%=al.get(i).getIdproveedor() %>">
                                    <input type="submit" class="btn btn-danger btn-sm ancho" value="Eliminar">
                                </form>
                            </td>
                            <td>
                                <form action="ModificarProveedores.jsp">
                                    <input type="hidden" name="modificar" value="<%=al.get(i).getIdproveedor() %>">
                                    <input type="submit" class="btn btn-primary btn-sm ancho" value="Modificar" >
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
                    <button class="btn btn-sm btn-success" onclick="location.href = 'NuevoProveedor.jsp'">
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
