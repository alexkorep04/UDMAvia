<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>UDMAvia</title>
    <style>
        body {
        background-color: lavender;
    }
        form {
            width: 30%;
            margin-left: 35%;
        }
        input{
            width: 70%;
        }
        form label {
            display: flex;
            justify-content: space-between;
            padding: 5px;
        }
        form label2 {
            background-color: #4CAF50;
            border: black;
            margin-left: 35%;
            width: 30%;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }
    </style>
</head>
<body>
    <h1 align="center">Enter your parameters!</h1>
    <form:form action="book/showAllFlights" modelAttribute="findFlight">
        <br>
        <label>City from: <form:input path="cityFrom"/></label>
        <br>
        <label> City to: <form:input path="cityTo"/> </label>
        <br>
        <label>Day: <form:input path="day"/> </label>
        <form:errors path="day"></form:errors>
        <br>
        <label>Month: <form:input path="month"/></label>
        <form:errors path="month"></form:errors>
        <br>
        <label>Year: <form:input path="year"/></label>
        <form:errors path="year"></form:errors>
        <br>
        <label2><input type="submit" value="OK"/></label2>
    </form:form>
</body>
</html>