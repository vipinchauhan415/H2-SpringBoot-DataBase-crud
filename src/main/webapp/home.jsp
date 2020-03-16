<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>H2 DB SP Boot</title>
</head>
<body>

<form action="addPerson">
<h4>Spring Boot JPA H2 Database	</h4>
Enter Person Id<input type="text" name="person_Id">
<br>
Enter Person Name:<input type="text" name="person_Name">
<br>
Enter Person Technology:<input type="text" name="person_Tech">
<input type="submit">
</form>

<form action="getPerson">
<h4>Spring Boot JPA H2 Database	</h4>
Enter Person Id<input type="text" name="Person_Id">
<input type="submit">
</form>

</body>
</html>