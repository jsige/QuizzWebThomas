<%-- 
    Document   : _TEMPLATE
    Created on : 17 juin 2016, 10:50:28
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion en Admin</title>
        <c:import url="_STYLESHEET.jsp" />


    </head>
    <body>
        <a href="films_liste">
            <div class="titre">
                <c:import url="_TITRE.jsp" />
            </div>
        </a>
            <h1>Connexion en Admin</h1>
        <div class="contenu">
            <form method="post">
                <h3>Login : <input name="login"></h3>
                <br />
                <h3>Mot de passe : <input name="mdp" type="password"></h3>
                <br />
                <br />

                <input type="submit" value="Connexion" />

            </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
