<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>widok</title>
</head>
<style>
h3 {
 background-color:#0040ff;
 width: 190px;
 color:white;}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    border: 1px solid #e7e7e7;
    background-color: #66d9ff;
}
li a {
 float: left;
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
li a:hover {
    background-color: #0073e6;
}

</style>
<body>
<ul>
<li><a href="http://localhost:8080/DodawanieUzytkownika/">home</a></li>
<li><a href="http://localhost:8080/DodawanieUzytkownika/wprowadzUsera">rejestracja</a></li>
</ul>
<h3>Lista uzytkownikow</h3>
<c:if test="${!empty listaaosob}">
<table border="1">
<tr>
<th width="50">Id</th>
<th width="150">Imie</th>
<th width="150">Nazwisko</th>
<th width="50">Wiek</th>
<th width="150">Usun</th>
</tr>
<c:forEach items="${listaaosob}" var="osoby">
<tr>
<td width="50" align="center">${osoby.id}</td>
<td width="150" align="center">${osoby.imie}</td>
<td width="150" align="center">${osoby.nazwisko}</td>
<td width="50" align="center">${osoby.wiek}</td>
<td width="150" align="center"><a href="http://localhost:8080/DodawanieUzytkownika/usuwanie/${osoby.id}">usuwanie</a></td>
</tr>
</c:forEach>
</table>
</c:if>

</body>
</html>