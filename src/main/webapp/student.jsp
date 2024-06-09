<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
#alert {
	position: absolute;
	left: 0px;
	top: 0px;
	z-index: -1;
}
</style>
<script>
	$(document).ready(function() {
		$("#main-content").find("input").each(function() {
			$(this).attr("disabled", true);
		});
	});
	function enable(main) {
		main.find("input").each(function() {
			$(this).attr("disabled", false);
		});
	}
</script>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li><a href="#">Home</a></li>
				<li><a href="#">Attendence Info</a></li>
				<li><a href="#">Leave</a></li>
				<li><a href="#">Documents</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Profile</a></li>
				<li><a href="/StudentMangement/Logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout </a></li>
			</ul>
		</div>
	</nav>
	<br>
	<div class="container-fluid">
		<span style="float: right;">
			<button class="btn btn-primary" id="edit"
				onclick="enable($('#main-content'));">Edit</button>
		</span> <br>
		<form class="px-4 py-3" action="save" method="post">

			<div class="row" id="main-content">
				<div class="form-group col-sm-4 required">
					<label for="uname">Name</label> <input type="uname"
						class="form-control" value="${student.name}" name="uname">
				</div>
				<div class="form-group col-sm-4 required">
					<label for="uname">email</label> <input type="email"
						class="form-control" value="${student.email}" name="email">
				</div>
				<div class="form-group col-sm-4">
					<label for="phone">Phone no </label> <input type="text"
						class="form-control" value="${student.phoneno}" name="phoneno">
				</div>
				<div class="form-group col-sm-4">
					<label for="pwd">Adhaar id</label> <input type="text"
						class="form-control" value="${student.adhaarid}" name="addharid">
				</div>
				<div class="form-group col-sm-4">
					<label for="add">Address </label> <input type="text"
						class="form-control" value="${student.address}" name="add">
				</div>
				<div class="form-group col-sm-4">
					<label for="uni">University </label> <input type="text"
						class="form-control" value="${student.university}" name="uni">
				</div>
				<div class="form-group col-sm-4">
					<label for="pwd">Branch</label> <input type="text"
						class="form-control" value="${student.branch}" name="branch">
				</div>
				<div class="form-group col-sm-4">
					<label for="cgpa">CGPA/Percentage </label> <input type="text"
						class="form-control" value="${student.marks}" name="cgpa">
				</div>
			</div>
		</form>
		<!--<div class="form-group col-sm-4">
					<label for="pwd">Phone no</label> <input type="text"
						class="form-control" value="${student.phoneno}" name="phoneno">
				</div>-->
		<div class="form-group col-sm-4">
			<br>
			<button type="submit" class="btn btn-primary">Save</button>
		</div>
	</div>

	</div>
</body>
</html>