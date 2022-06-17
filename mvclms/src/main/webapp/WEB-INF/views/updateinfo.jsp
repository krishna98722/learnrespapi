<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register For Booking</h1>
	<div style="width: 500px;">
		<fieldset>
			<form action="employee/update" method="POST">
				<table>
					<tr>
						<td><input type="number" placeholder="Enter Your id : "
							name="id"></td>
					</tr>
					<tr>
						<td><input type="text" placeholder="Enter Your name : "
							name="name"></td>
					</tr>
					<tr>
						<td><input type="text" placeholder="Enter Your email : "
							name="email"></td>
					</tr>
					<tr>
						<td><input type="number" placeholder="Enter Your age : "
							name="age"></td>
					</tr>
					<tr>
						<td>
							<button type="submit">Submit Here</button>
						</td>
					</tr>
				</table>
			</form>
		</fieldset>
	</div>
</body>
</html>