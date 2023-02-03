<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: tripp
  Date: 2/2/23
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row p- m-1">
        <form class="form-control" method="post" action="login.jsp">
            <div class="row">
                <label class="col-form-label" for="username">User Name</label>
                <input type="text" placeholder="Input you user name here" id="username" name="username">
                <label class="col-form-label" for="password">Password</label>
                <input type="password" placeholder="Password" id="password" name="password">
                <button type="submit" class="btn-primary btn" id="form-submit-button">Login!</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    System.out.println(username +" ," + password);
    if (Objects.equals(username, "admin") && Objects.equals(password, "password")){
        response.sendRedirect("/profile.jsp");
    }
%>

