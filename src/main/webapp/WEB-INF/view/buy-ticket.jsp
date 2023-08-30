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
<h1 align="center">Enter your data!</h1>
<form:form action="afterBooking" modelAttribute="reservation">
  <br>
  <label>Name: <form:input path="name"/></label>
  <br>
  <label>Surname: <form:input path="surname"/></label>
  <br>
  <label>Passport: <form:input path="passport"/></label>
  <br>
  <label>Email: <form:input path="email"/></label>
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
  <label2><input type="submit" value="OK"/></label2>
</form:form>
</body>
</html>