<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Record</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #f06, #4a90e2);
            color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 40px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
            border-radius: 10px;
            width: 90%;
            max-width: 600px;
            text-align: center;
        }
        h1 {
            color: #333;
            margin-bottom: 20px;
            font-size: 2em;
        }
        .student-info {
            font-size: 1.2em;
            color: #333;
        }
        .student-info b {
            color: #555;
        }
        .student-info a {
            text-decoration: none;
            color: #007bff;
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        .student-info a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Student Record</h1>
        <div class="student-info">
            <p><b>Name:</b> ${student.getStudent_name()}</p>
            <p><b>Department:</b> ${student.getDepartment()}</p>
            <p><b>Section:</b> ${student.getSection()}</p>
            <p><b>Roll Number:</b> ${student.getRoll_num()}</p>
            <a href="studentrecord/${student.getStudent_id()}">Check Issued Books</a>
        </div>
    </div>
</body>
</html>