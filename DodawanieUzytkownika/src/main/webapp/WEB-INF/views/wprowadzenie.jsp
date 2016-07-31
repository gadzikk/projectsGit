<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>wprowadzenie</title>
</head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    border: 1px solid #e7e7e7;
    background-color: #ffb366;
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
    background-color: #ff3333;
}

</style>
<body>
<div align="Left">
<ul>
<li><a href="http://localhost:8080/DodawanieUzytkownika/">home</a></li>
<li><a href="http://localhost:8080/DodawanieUzytkownika/widok">widok</a></li>
</ul>
</div>
<h3><mark>Dodawanie uzytkownika</mark></h3>
<form action="http://localhost:8080/DodawanieUzytkownika/dodawanie" method="post" modelAttribute="KOMENDA">
<table border="1">
<tr>
<td>
<label for="imie">imie</label>
</td> <td><input type="text" name="imie"/></td>
</tr>
<tr>
<td>
<label for="nazwisko">nazwisko</label>
</td> 
<td><input type="text" name="nazwisko"/></td>
</tr>
<tr>
<td>
<label for="wiek">wiek</label>
</td> <td><input type="text" name="wiek"/></td>
</tr>
<tr>
</table>
<input type="submit" value="dodaj">
</form>
</body>
</html>