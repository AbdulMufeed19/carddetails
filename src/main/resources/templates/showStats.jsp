<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stats of Hits</title>
</head>
<body style="font-family:Courier;color:blue;">
		<table>
		<tbody>		
					
					 <tr> <p> 
					 		Start : <span th:text= "${start}"/>
                    	 </p>
                    </tr>
                    
					 <tr> <p> 
					 		Limit : <span th:text= "${limit}" />
                    	 </p>
                    </tr>
					 <tr> <p> 
					 		Size : <span th:text="${size}"/>
                    	 </p>
                    </tr>
					<tr th:each="employee : ${dtls}" >
                       Card Id : <span th:text="${employee.cardId}"/>
                       <br>
                        Number of Hits : <span th:text="${employee.numberofHits}"/>
                        <br>
                    </tr>
                   
		</tbody>
        </table>
</body>
</html>