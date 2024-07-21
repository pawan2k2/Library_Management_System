<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Library Management System</title>
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
    }
    .container {
        background-color: rgba(255, 255, 255, 0.9);
        padding: 30px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
        border-radius: 10px;
        text-align: center;
        width: 90%;
        max-width: 500px;
    }
    h1 {
        color: #333;
        margin-bottom: 25px;
        font-size: 2em;
    }
    a {
        display: inline-block;
        margin: 15px 10px;
        padding: 12px 25px;
        text-decoration: none;
        color: #fff;
        background-color: #007bff;
        border-radius: 5px;
        transition: background-color 0.3s ease, transform 0.3s ease;
        box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
        font-size: 1em;
    }
    a:hover {
        background-color: #0056b3;
        transform: translateY(-3px);
    }
    a:active {
        transform: translateY(0);
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    }
</style>
</head>
<body>
<div class="container">
    <h1>Library Management System</h1>
    <a href="newRegistration">New Registration</a>
    <a href="addBook">Add New Book</a>
    <a href="issueBook">Issue Book</a>
    <a href="searchStudent">Search Student</a>
    <a href="logout">Logout</a>
</div>
</body>
</html>