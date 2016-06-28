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
        <title>Quizz en cours</title>
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
            <h1>Quizz n° ${quizzid}</h1>
            <h1>Nom du quizz : </h1>
            <h2>Question n° - (nb/nbTotal)</h2>
            <h3>Score : ${score}</h3>
            <br />
            <br />
            <h3>Intitulé : </h3>
            <form method="post">
            <h4>R1 : <input type="radio" name="repchoisie" value="1" ></h4>
            <h4>R2 : <input type="radio" name="repchoisie" value="2" ></h4>
            <h4>R3 : <input type="radio" name="repchoisie" value="3" ></h4>
            <h4>R4 : <input type="radio" name="repchoisie" value="4" ></h4>
            <br />
            <br />
            <input type="submit" value="Question suivante" />
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
