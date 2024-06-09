<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<style>
.block {
	margin: 100px 0px 0px 400px;
	height: 400px;
	width: 500px;
	border: 1px solid black;
}
</style>
<body>

	<%!String msg = "";%>
	<%
	Cookie[] cookie = request.getCookies();
	if (cookie != null) {
		for (Cookie c : cookie) {
			if (c.getName().equals("msg")) {
		msg = c.getValue().toString();
			}
		}
	}
	%>
	<%=msg%>
	<!--  <img alt="student" src=""> -->
	<div class="block">
		<form class="px-4 py-3" action="Login">
			<div class="mb-3">
				<label for="exampleDropdownFormEmail1" class="form-label">Email
					address</label> <input type="email" class="form-control" name="username"
					placeholder="email@example.com">
			</div>
			<div class="mb-3">
				<label for="exampleDropdownFormPassword1" class="form-label">Password</label>
				<input type="password" class="form-control" name="pass"
					placeholder="Password">
			</div>
			<div class="mb-3">
				<div class="form-check">
					<input type="checkbox" class="form-check-input" id="dropdownCheck">
					<label class="form-check-label" for="dropdownCheck">
						Remember me </label>
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Sign in</button>
			<a class="dropdown-item" href="signup.jsp">New around here? Sign up</a> <a
				class="dropdown-item" href="#">Forgot password?</a>
		</form>

	</div>
	<!-- <form action="Login">
		User : <input type="text" name="name"> Password : <input
			type="text" name="pass"> <input type="submit">
	</form>-->
</html>