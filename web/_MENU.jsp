<%-- 
    Document   : _TITRE
    Created on : 17 juin 2016, 10:54:34
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<a href="liste_quizzes">Jouer</a>
<a href="connexion">Gérer</a>


<c:if test="${role=='admin'}">
    <a href="deconnexion">Déconnexion</a>
</c:if>

