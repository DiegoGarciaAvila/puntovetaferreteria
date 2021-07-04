<%-- 
    Document   : login.jsp
    Created on : 6/05/2020, 02:25:55 PM
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
              integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <style>

            .login{
                height: 550px;
                background-color: #0000cc;
                text-align: center;


            }

        </style>


    </head>

    <body>

        <div class="container login m-5 ">

            <div class="row justify-content-center p-5">
                <div class="col-4">
                    <img src="img/contructor.jpg" alt="Aqui va una imagen" class="img-fluid rounded">
                </div>
            </div>

            <br>

            <div class="row justify-content-center mx-auto">
                
                <form name="ventas" action="LoginS" method="post">

                    <div class="col">
                        <input name="usuario" type="text" placeholder="Usuario" class="rounded">
                    </div>
                    <br>
                    <div class="col">
                        <input name="password" type="password" placeholder="Password" class="rounded">
                    </div>
                    <br>
                    <div class="col">
                        <input type="submit" value="Ingresar" class="btn btn-warning rounded">
                    </div>
                </form>

            </div>
            <br>
            <div class="row justify-content-center">
                <div class="col">
                    <p> 
                        <a href="#" class="text-white">¿Olvido la contraseña? </a>
                    </p>
                </div>
            </div>



        </div>         
    </body>

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
    integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
    integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
    integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</html>
