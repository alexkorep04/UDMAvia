<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>UDMAvia</title>
</head>
<body>
<h2>All flights</h2>
<br>
<table>
    <tr style="border-bottom:1px solid black">
        <th colspan="100%">Flight name</th>
        <th colspan="100%">City from</th>
        <th colspan="100%">City to</th>
        <th colspan="100%">Day</th>
        <th colspan="100%">Month</th>
        <th colspan="100%">Year</th>
        <th colspan="100%">Places left</th>
        <th colspan="100%">Plane</th>
        <th colspan="100%">Time</th>
        <th colspan="100%">Minimal price</th>
    </tr>
    <c:forEach var="flight" items="${allFlights}">
        <c:url var="bookButton" value="/UDMAvia/book/buy">
            <c:param name="flightId" value="${flight.id}"/>
        </c:url>
        <tr style="border-bottom:1px solid black">
            <td colspan="100%">${flight.flight_name}</td>
            <td colspan="100%">${flight.cityFrom}</td>
            <td colspan="100%">${flight.cityTo}</td>
            <td colspan="100%">${flight.day}</td>
            <td colspan="100%">${flight.month}</td>
            <td colspan="100%">${flight.year}</td>
            <td colspan="100%">${flight.amount}</td>
            <td colspan="100%">${flight.plane}</td>
            <td colspan="100%">${flight.hours}:${flight.minutes}</td>
            <td colspan="100%">${flight.price}</td>
            <td>
                <input type="button" value="Book" onclick="window.location.href = '${bookButton}'">
            </td>
        </tr>
    </c:forEach>
</table>
<br>
</body>
</html>