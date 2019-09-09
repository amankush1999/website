<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="update" align="center" >
            <form action="updateservlet" method="get" >
               <h2 style="color: black">Update</h2>
    <input type="text" name="firstname" placeholder="First name"  required><br><br>
    <input type="text" name="lastname" placeholder="Last name" required ><br><br>
    <input type="password" name="password" placeholder="Password" required  ><br><br>    
    <input type="tel" name="phoneNo" maxlength="10" placeholder="phoneNo" required ><br><br>   
    <input type="email" name="email" placeholder="Email address" required ><br><br>  
    <input type="submit" value="update" >
      
        </form>
       </div>
 </body>
</html>