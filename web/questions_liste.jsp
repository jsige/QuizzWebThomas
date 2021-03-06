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
        <title>Liste des questions du questionnaire ${quizzid}</title>
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
            <h1>Liste des questions du questionnaire ${quizzid}</h1>
            <table>
                <c:forEach items="${questionsDuQuizz}" var="quizquest">
                    <tr>
                        <td>
                            <h3><a href="details_quizz?id_quizz=${quizquest.id}">${quizquest.titre}</a></h3>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td>
                        <c:if test="${role=='admin'}">
                            <h2>
                                <a href="question_creer">Ajouter une question</a>
                            </h2>
                        </c:if>

                    </td>
                </tr>
            </table>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
