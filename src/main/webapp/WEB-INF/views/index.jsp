<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f7f7f7;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .login-form {
        background-color: #ffffff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
    }

    .login-form h2 {
        margin-bottom: 20px;
        color: #333;
    }

    .login-form label {
        display: block;
        margin-bottom: 8px;
        color: #555;
    }

    .login-form input[type="text"],
    .login-form input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    .login-form input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #4CAF50;
        border: none;
        border-radius: 5px;
        color: white;
        font-size: 16px;
        cursor: pointer;
    }

    .login-form input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<div class="login-form">
    <h2>Admin Login</h2>
    <form action="adminlogin" method="post">
        <label for="user">User Name:</label>
        <input type="text" id="user" name="user">
        
        <label for="pass">Password:</label>
        <input type="password" id="pass" name="pass">
        
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>