<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page isELIgnored="false" %>
    <%@ page import="java.util.List" %>
    <%@ page import="in.ta.main.entity.Issue" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Issued Books</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #f06, #4a90e2);
            color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
            padding: 20px;
            box-sizing: border-box;
        }
        .container {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 40px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
            border-radius: 10px;
            width: 90%;
            max-width: 800px;
            text-align: center;
        }
        .book-entry {
            background-color: #f9f9f9;
            color: #333;
            padding: 20px;
            margin: 10px 0;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .book-entry b {
            font-size: 1.2em;
        }
        .book-entry p {
            margin: 10px 0;
            font-size: 1em;
        }
        .book-entry a {
            text-decoration: none;
            color: #007bff;
            display: inline-block;
            margin-top: 10px;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        .book-entry a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Issued Books</h1>
        <%
            List<Issue> list = (List<Issue>) request.getAttribute("bookIssued");
            for (Issue issue : list) {
        %>
            <div class="book-entry">
                <b>Book ID: <%=issue.getBook_id()%></b>
                <p>Issue Date: <%=issue.getIssue_date()%></p>
                <a href="returnbook/<%=issue.getStudent_id()%>/<%=issue.getBook_id()%>">Return the Book</a>
            </div>
        <%
            }
        %>
    </div>
</body>
</html>