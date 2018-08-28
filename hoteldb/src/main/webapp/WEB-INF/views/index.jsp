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
<title>Hotel Search</title>
</head>
<body>
	<div class="container">
		<form action="list">
			<div class="dropdown">
				<button class="btn btn-default dropdown-toggle" type="button"
					id="menu1" data-toggle="dropdown">
					Hotel Search <span class="caret"></span>
				</button>
				<ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
					<c:forEach var="city" items="${cities}">
						<li role="presentation"><a role="menuitem"
							href="/city/${city}/hotlist">${city}</a></li>
					</c:forEach>
				</ul>
			</div>
		</form>
	</div>
</body>
</html>