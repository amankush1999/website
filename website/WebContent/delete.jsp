<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="delete" align="center" >
     <form action="deleteservlet" method="get">
        <h2 style="color:black">Delete</h2>
        
            <input type="text" name="email" placeholder="Enter Username/Email " required><br><br>
            <input type="password" name="password" placeholder="Enter your password" required><br><br>
            <input type="submit" onclick="location.href='index.html'"  value="delete"></input>
     
     </form>
     </div>
</body>
</html>