<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
	
<script	src='http://code.jquery.com/jquery-1.7.1.min.js'></script>
<style>
.block {
	margin: 100px 0px 0px 400px;
	height: 500px;
	width: 500px;
	border: 1px solid black;
	padding: 20px;
}
</style>
<script>
function signup(){
	var name = $("input[name='name']").val();
	var email = $("input[name='username']").val();
	var conpass = $("input[name='conpass']").val();
	var password = $("input[name='pass']").val();
	
	if(conpass!=password){
		alert("password didn't matched");
		return false;
	}

	$.ajax(function(){
		aync : false,
		url : "../StudentMangement/signup",
		data : "name="+name+"&username="+email+"&password="+password,
		success : function(data){
			console.log(data);
		},
		error : function(err){
			
		}
	});
}
</script>
<body>
	<div class="block">
		<div class="mb-3">
				<label for="exampleDropdownFormEmail1" class="form-label">Name</label> <input type="text" class="form-control" name="name"
					placeholder="Full Name" id="name">
			</div>
			<div class="mb-3">
				<label for="exampleDropdownFormEmail1" class="form-label">Email
					address</label> <input type="email" class="form-control" name="username"
					placeholder="email@example.com">
			</div>
			<div class="mb-3">
				<label for="exampleDropdownFormPassword1" class="form-label">Create Password</label>
				<input type="password" class="form-control" name="conpass"
					placeholder="Password">
			</div>
			<div class="mb-3">
				<label for="exampleDropdownFormPassword1" class="form-label">Password</label>
				<input type="password" class="form-control" name="pass"
					placeholder="Password">
			</div>
			
			<button type="submit" class="btn btn-primary" onclick="signup();">Sign up</button>
	</div>
</body>

</html>