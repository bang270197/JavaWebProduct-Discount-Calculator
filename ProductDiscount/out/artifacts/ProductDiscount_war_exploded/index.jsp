<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/18/2019
  Time: 8:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div id="content">
    <h1>Product Discount Calculator</h1>
    <form action="/display-discount" method="post">
        <div id="data">
            <label>Product Discription: </label>
            <input type="text" name="description"><br/>
            <label>List Price</label>
            <input type="text" name="price"><br/>
            <label>Discount Percent</label>
            <input type="text" name="percent"><br/>
        </div>
        <div id="button">
            <input type="submit" value="Calculate Discount">
        </div>
    </form>
</div>
</body>
</html>
