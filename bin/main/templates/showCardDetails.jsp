<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details of your card</title>
</head>
<body>
	<h1 style="font-family:verdana;color:violet;">Below are the details of card :</h1>
	<font size = "5">
	<p style="font-family:Courier;color:blue;">
		<p> Scheme : 
	  <span th:text="${scheme}"/>
	  </p>
	  <p> Type : 
	  <span th:text="${type}"/>
	  </p>
	  <p> Bank : 
	  <span th:text="${bank}"/>
	  </p>
	</p>
	</font>
</body>
</html>