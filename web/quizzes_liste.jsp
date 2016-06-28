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
        <title>Liste des quizzes disponibles</title>
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
            <h1>Liste des quizzes disponibles</h1>
            <table>
                <c:forEach items="${quizzes}" var="quizz">
                    <tr>
                        <td>
                            <h3><a href="set_quizz?id_quizz=${quizz.id}">${quizz.titre}</a></h3>
                        </td>
                    </tr>
                </c:forEach>
                    <tr>
                        <td>
                            <h2>
                                <c:if test="${role=='admin'}">
                                    <a href="quizz_creer">Ajouter un nouveau quizz</a>
                                </c:if>
                            </h2>
                        </td>
                    </tr>
            </table>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
