<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
  <title>UDMAvia</title>
</head>
<body>
<form:form action="afterBooking" modelAttribute="reservation">
  <br>
  Name: <form:input path="name"/>
  <br>
  Surname: <form:input path="surname"/>
  <br>
  Passport: <form:input path="passport"/>
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
  <input type="submit" value="OK"/>
</form:form>
</body>
</html>