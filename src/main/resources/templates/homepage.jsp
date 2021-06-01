
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage of card details/ stats</title>
<p>Enter the card number to get details of card</p> 
</head>
<body>
	<form action="/card-scheme/verify" method="POST">
		<div>
	   <input type="text" name="cardNumber" id ="cardNumber"  required/>
	   <input type = "submit" id="submit" value="Details">
	   </div>
	</form>
	
	<form action="/card-scheme/stats" method="GET">
	<p>Enter the start and Limit details to get stats</p> 
	<label for="startdtls">Start:</label><br>
 	<input type="text" name="start" id ="start"  required/>
 	<br>
 	<label for="limitdtils">Limits :</label><br>
 	<input type="text" name="limit" id ="limit"  required/><br>
 	<input type = "submit" id="start2" value="Get stats" >
 			</form>
</body>
</html>