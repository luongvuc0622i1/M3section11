<%--
  Created by IntelliJ IDEA.
  User: gialuong
  Date: 27/09/2022
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Delete Product</title>
</head>
<body>
<c:if test="${requestScope['message']!=null}">
  <span style="color: green">${requestScope['message']}</span>
</c:if>
<p>
  <a href="products"> Back to list</a>
</p>
<form method="post">
  <table>

    <tr><td>Price: </td><td><input type="text" id="price" name="price" value="${requestScope['product'].getPrice()}"></td></tr>
    <tr><td>description: </td><td><input type="text" id="description" name="description" value="${requestScope['product'].getDescription()}"></td></tr>
    <tr><td>supplier: </td><td><input type="text" id="supplier" name="supplier" value="${requestScope['product'].getSupplier()}"></td></tr>
    <tr><td>image: </td><td><input type="text" id="image" name="image" value="${requestScope['product'].getImage()}"></td></tr>
    <tr><td><input type="submit" value="Delete"></td></tr>
  </table>
</form>
</body>
</html>
