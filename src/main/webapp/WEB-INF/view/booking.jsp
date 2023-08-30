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
            width: 40%;
        }
        form label {
            display: flex;
            justify-content: space-between;
            padding: 5px;
        }
        .class1{
            background-color: #4CAF50;
            border: black;
            color: white;
            margin-left: 30%;
            width: 40%;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 50px;
        }
        form label errors {
            margin-left: 200px;
        }
    </style>
</head>
<body>
    <h1 align="center">Enter your parameters!</h1>
    <form:form action="/UDMAvia/book/showAllFlights" modelAttribute="findFlight">
        <br>
        <label>City from: <form:input path="cityFrom"  placeholder = "Enter departure city:"/>         <form:errors path="cityFrom"></form:errors></label>
        <br>
        <label> City to: <form:input path="cityTo"  placeholder = "Enter arrival city:"/>         <form:errors path="cityTo"></form:errors></label>
        <br>
        <label>Day: <form:input path="day" type="number"  placeholder = "Enter number of day:"/>               <form:errors path="day"></form:errors>  </label>
        <br>
        <label>Month: <form:input path="month" type="number"  placeholder = "Enter number of month:"/>         <form:errors path="month"></form:errors></label>
        <br>
        <label>Year: <form:input path="year" type="number"  placeholder = "Enter number of year:"/>         <form:errors path="year"></form:errors></label>
        <br>
        <label2><input class="class1" type="submit" value="OK"/></label2>
    </form:form>
</body>
</html>