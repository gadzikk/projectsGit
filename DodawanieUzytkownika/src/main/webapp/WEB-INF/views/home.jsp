<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>home</title>
</head>
<style>
header {
    background-color:#47d147;
    color:white;
    text-align:center;
    padding:5px;	 
}
nav {
    
    background-color:#eeeeee;
    height:400px;
    width:200px;
    float:left;
    	      
}
section {
	font-size: 130%;
    width: 650px;
    float:left;
    padding:10px;	 	 
}
footer {
    background-color:#248f24;
    clear:both;
    text-align:center;
    padding:5px;	 	 
}
ul {
    list-style-type: none;
    width: 150px;
}
li a {
    display: block;
    color: #000;
    padding: 8px 0 10px 20px;
    text-decoration: none;
}

/* Change the link color on hover */
li a:hover {
    background-color: #555;
    color: white;
}
</style>
<body>
<header>
<h1>
	Strona domowa  
</h1>
</header>
<nav>
<ul>
<li><a href="http://localhost:8080/DodawanieUzytkownika/">home</a></li>
<li><a href="http://localhost:8080/DodawanieUzytkownika/wprowadzUsera">rejestracja</a></li>
<li><a href="http://localhost:8080/DodawanieUzytkownika/widok">widok</a></li>
</ul>
</nav>
<section>
<p>witaj na stronie dzieki ktorej bedziesz mogl dodac i utrwalic uzytkownika
 w bazie danych za pomoca wspolpracujacych ze soba SPRINGMVC HIBERNATE MAVEN nastepnie usunac go
 jezeli bedzie to wymagane , aby zobaczyc dzialanie projektu dodaj osoby do bazy danych klikajac REJESTRACJA
 i wprowadz dane a nastepnie przejdz do zakladki WIDOK aby zobaczyc efekt dzialan   </p>
</section>
<footer>
</footer>
<marquee width="650px">**** SPRINGMVC*HIBERNATE*MAVEN*INTEGRACJA ****</marquee>
</body>
</html>
