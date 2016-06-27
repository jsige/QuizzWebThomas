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
        <title>Ajouter une question au Quizz n°${quizzid}</title>
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
                <h3>Titre de la question : <input name="titre"></h3>
                <br />
                <h3>Ordre de la question : <input name="ordre"></h3>
                <br />
                <h3>R1 : <input name="r1"><input type="radio" name="fruit" value="1" ></h3>
                <br />
                <h3>R2 : <input name="r2"><input type="radio" name="fruit" value="2" ></h3>
                <br />
                <h3>R3 : <input name="r3"><input type="radio" name="fruit" value="3" ></h3>
                <br />
                <h3>R4 : <input name="r4"><input type="radio" name="fruit" value="4" ></h3>
                <br />
                <br />

                <input type="submit" value="Créer" />

            </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
