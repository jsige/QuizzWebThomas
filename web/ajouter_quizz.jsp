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
        <title>Ajout d'un quizz</title>
        <c:import url="_STYLESHEET.jsp" />
        
        
    </head>
    <body>
        <a href="films_liste">
            <div class="titre">
                <c:import url="_TITRE.jsp" />
            </div>
        </a>
        <div class="menu">
            <c:import url="_MENU.jsp" />
        </div>
        <div class="contenu">
            <form method="post">
                <br />
                <h3>Titre du quizz : <input name="quizzTitre"></h3>
                <br />
                <input type="submit" value="Créer" />
            </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
