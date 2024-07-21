<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
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
        width: 90%;
        max-width: 400px;
    }
    h1 {
        color: #333;
        margin-bottom: 30px;
        font-size: 2em;
        text-align: center;
    }
    label {
        display: block;
        margin-bottom: 8px;
        font-size: 1em;
        color: #333;
    }
    input[type="text"], select {
        width: calc(100% - 22px);
        padding: 10px;
        margin-bottom: 20px;
        border-radius: 5px;
        border: 1px solid #ccc;
        font-size: 1em;
    }
    input[type="number"], select {
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
    <h1>Add Book</h1>
    <form action="addBook" method="post">
        <label for="book_id">Book ID:</label>
        <input type="text" id="book_id" name="book_id">
        
        <label for="book_name">Book Name:</label>
        <input type="text" id="book_name" name="book_name">
        
        
        <label for="book_author">Book Author:</label>
        <input type="text" id="book_author" name="book_author">
        
        <label for="book_edition">Book Edition:</label>
        <input type="number" id="book_edition" name="book_edition">
        
        
        <input type="submit" value="add">
    </form>
</div>
</body>
</html>