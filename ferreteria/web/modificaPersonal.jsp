<%-- 
    Document   : modificaPersonal.jsp
    Created on : 18/06/2020, 12:40:30 PM
    Author     : Diego
--%>

<%@page import="farreteria.DAOPersonal"%>
<%@page import="Encapsulamiento.Dpersonal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <h1>Llena los campos a modificar</h1>

        <div class="col mb-2">
            <form name="DBUsuario" action="DBUsuarioMoS">
                <table border="2" class="ancho text-center"> 
                    <thead>
                        <tr><td  class="bg-warning " colspan="8">Tabla Empleados</td></tr>
                        <tr class="bg-dark text-white">
                            <td>Id</td>
                            <td>Nombre</td>
                            <td>Apellido Materno</td>
                            <td>Apellido Paterno</td>
                            <td>Salario</td>
                            <td>Password</td>
                            <td>Cargo</td>
                            <td>Contacto</td>
                        </tr>

                    </thead>

                    <%
                        String idpersonal = request.getParameter("modificar");
                        // Encapsulamiento.Dpersonal dp= new farreteria.DAOPersonal().getModificarP(idpersonal);
                        Dpersonal dp = new DAOPersonal().getModificarP(idpersonal);


                    %>
                    <tr>

                        <td><input type="text" value="<%=dp.getIdpersonal()%>" name="idpersonal"></td>
                        <td><input type="text" value="<%=dp.getNombre()%>" name="nombre"></td>
                        <td><input type="text" value="<%=dp.getAm()%>" name="ap"></td>
                        <td><input type="text" value="<%=dp.getAp()%>" name="am"></td>
                        <td><input type="text" value="<%=dp.getSalario()%>" name="salario"></td>
                        <td><input type="text" value="<%=dp.getContra()%>" name="contra"></td>
                        <td><input type="text" value="<%=dp.getCargo()%>" name="cargo"></td>
                        <td><input type="text" value="<%=dp.getTelefono()%>" name="telefono"></td>

                    </tr>


                </table>
                <br>
                
                <input type="submit" value="Guardar" class="btn btn-info text-dark">

                <input type="button" class="btn btn-danger" onclick="location.href = 'basedatos.jsp'" value="Cancelar">

            </form>

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
