<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>UDMAvia</title>
    <style>
        body {
            background-color: lavender;
        }
        input {
            background-color: #4CAF50;
            border: black;
            color: white;
            margin-left: 40%;
            width: 20%;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 100px;
        }

    </style>
</head>
<body>
    <h1 align="center"><b>Welcome to UDMAvia Website</b></h1>
    <h2 align="center">Hear you can reserve tickets for flights</h2>
    <input type="button" align="center"  value="Book"  onclick="window.location.href ='UDMAvia/book'">
</body>
</html>