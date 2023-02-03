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
        <form class="form-control" method="post" action="/pizza-order">
            <div class="row">
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="crust" id="crust1" value="thin">
                        <label class="form-check-label" for="crust1">
                            Thin
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="crust" id="crust2" value="Regular">
                        <label class="form-check-label" for="crust2">
                            Regular
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="crust" id="crust3" value="Stuffed">
                        <label class="form-check-label" for="crust3">
                            Stuffed
                        </label>
                    </div>
                </div>
                <div class="col">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="sauce" id="sause1" value="tomato">
                        <label class="form-check-label" for="sause1">
                            Tomato
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="sauce" id="sause2" value="alfredo">
                        <label class="form-check-label" for="sause2">
                            Alfredo
                        </label>
                    </div>
                </div>
                <div class="col">
                    <ul class="list-group">
                        <li class="list-group-item">
                            <input class="form-check-input me-1" type="checkbox" value="sausage" name="toppings" id="firstCheckbox">
                            <label class="form-check-label" for="firstCheckbox">Sausage</label>
                        </li>
                        <li class="list-group-item">
                            <input class="form-check-input me-1" type="checkbox" value="pepperoni" name="toppings" id="secondCheckbox">
                            <label class="form-check-label" for="secondCheckbox">Pepperoni</label>
                        </li>
                        <li class="list-group-item">
                            <input class="form-check-input me-1" type="checkbox" value="xCheese" name="toppings" id="thirdCheckbox">
                            <label class="form-check-label" for="thirdCheckbox">Extra Cheese</label>
                        </li>
                    </ul>
                </div>
                <button type="submit" class="btn-primary btn" id="form-submit-button">Submit Order!</button>
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

