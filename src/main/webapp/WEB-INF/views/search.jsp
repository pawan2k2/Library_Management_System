<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Find Student</title>
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
        padding: 40px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
        border-radius: 10px;
        text-align: center;
        width: 90%;
        max-width: 400px;
    }
    h3 {
        color: #333;
        margin-bottom: 20px;
        font-size: 1.5em;
    }
    label {
        display: block;
        margin-bottom: 10px;
        font-size: 1em;
        color: #333;
    }
    input[type="text"] {
        width: calc(100% - 22px);
        padding: 10px;
        margin-bottom: 20px;
        border-radius: 5px;
        border: 1px solid #ccc;
        font-size: 1em;
    }
    input[type="submit"] {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 5px;
        background-color: #007bff;
        color: #fff;
        font-size: 1em;
        cursor: pointer;
        transition: background-color 0.3s ease, transform 0.3s ease;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
        transform: translateY(-3px);
    }
    input[type="submit"]:active {
        transform: translateY(0);
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    }
</style>
</head>
<body>
<div class="container">
    <h3>Find Student</h3>
    <form action="findstudent" method="post">
        <label for="student_id">Student ID:</label>
        <input type="text" id="student_id" name="student_id">
        <input type="submit" value="Search">
    </form>
</div>
</body>
</html>