<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Error Page</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #f06, #4a90e2);
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        color: #fff;
        text-align: center;
    }
    .container {
        background-color: rgba(255, 255, 255, 0.9);
        padding: 40px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
        border-radius: 10px;
        max-width: 500px;
        width: 90%;
    }
    h1 {
        color: #333;
        font-size: 2em;
        margin-bottom: 20px;
    }
    .error-icon {
        font-size: 5em;
        color: #f06;
        margin-bottom: 20px;
    }
</style>
</head>
<body>
<div class="container">
    <div class="error-icon">&#9888;</div>
    <h1>${error}</h1>
</div>
</body>
</html>