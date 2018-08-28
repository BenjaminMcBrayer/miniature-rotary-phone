<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>${city}Hotels</title>
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price per Night</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="sortedHotels" items="${sortedHotels}">
				<tr>
					<td>${sortedHotels.name}</td>
					<td>${sortedHotels.pricePerNight}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>