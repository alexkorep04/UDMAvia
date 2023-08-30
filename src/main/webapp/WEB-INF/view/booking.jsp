<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>UDMAvia</title>
</head>
<body>
    <form:form action="book/showAllFlights" modelAttribute="findFlight">
        <br>
        City from: <form:input path="cityFrom"/>
        <br>
        City to: <form:input path="cityTo"/>
        <br>
        Day: <form:input path="day"/>
        <br>
        Month: <form:input path="month"/>
        <br>
        Year: <form:input path="year"/>
        <br>
        <input type="submit" value="OK"/>
    </form:form>
</body>
</html>