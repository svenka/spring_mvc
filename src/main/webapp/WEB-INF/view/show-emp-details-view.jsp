<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<DOCTYPE html>
<html>
<body>
<h2> Dear Employee you are welcome</h2>
<br>
<br>
<br>
<p>
<!--Your name:${param.employeeName}-->
Your name:${employee.name}
<br>
Your name:${employee.surname}
<br>
Your name:${employee.salary}
<br>
Your department:${employee.department}
<br>
Your car:${employee.carBrand}
<br>
Languages:
<ul>
<c:forEach var="lang" items="${employee.languages}">
<li>${lang}</li>

</c:forEach>
</ul>
Phone number:${employee.phoneNumber}
Your email:${employee.email}
</body>
</html>
