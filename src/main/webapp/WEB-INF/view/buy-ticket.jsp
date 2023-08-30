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
<h1 align="center">Enter your data!</h1>
<form:form action="/UDMAvia/book/afterBooking" modelAttribute="reservation">
  <br>
  <label>Name: <form:input path="name" placeholder = "Enter your name:"/><form:errors path="name"></form:errors></label>
  <br>
  <label>Surname: <form:input path="surname" placeholder = "Enter your surname:"/><form:errors path="surname"></form:errors></label>
  <br>
  <label>Passport: <form:input path="passport" placeholder = "Enter your passport:"/><form:errors path="passport"></form:errors></label>
  <br>
  <label>Email: <form:input path="email" placeholder = "Enter your email:"/><form:errors path="email"></form:errors></label>
  <br>
  <form:hidden path="flight.id"/>
  <form:hidden path="flight.flight_name"/>
  <form:hidden path="flight.cityFrom"/>
  <form:hidden path="flight.cityTo"/>
  <form:hidden path="flight.day"/>
  <form:hidden path="flight.month"/>
  <form:hidden path="flight.year"/>
  <form:hidden path="flight.hours"/>
  <form:hidden path="flight.minutes"/>
  <form:hidden path="flight.amount"/>
  <form:hidden path="flight.plane"/>
  <form:hidden path="flight.price"/>
  <label2><input class="class1" type="submit" value="OK"/></label2>
</form:form>
</body>
</html>