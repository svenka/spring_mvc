<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<DOCTYPE html>
<html>
<body>
<h2> Employee please enter your details</h2>
<br>
<br>
<br>


<form:form action="showDetails" modelAttribute="employee">

Name <form:input path="name"/>
<form:errors path="name"/>
<br>
<br>
Surname <form:input path="surname"/>
<form:errors path="surname"/>
<br>
<br>
Salary <form:input path="salary" />
<form:errors path="salary"/>
<br>
<br>
Department
<form:select path="department">
<!--<form:option value="Information Technology" label="IT"/>-->
<!--<form:option value="Human resources" label="HR"/>-->
<!--<form:option value="Sales" label="Sales"/>-->
<form:options items="${employee.departments}"/>
</form:select>
<br>
<br>
Which car do you want?
<!--BMW<form:radiobutton path="carBrand" value="BMW"/>-->
<!--Audi<form:radiobutton path="carBrand" value="Audi"/>-->
<!--MB<form:radiobutton path="carBrand" value="Mercedes-Benz"/>-->

<form:radiobuttons path="carBrand" items="${employee.carbrands}"/>
<br>
<br>
Foreign Language(s)
<!--EN <form:checkbox path="languages" value="English"/>-->
<!--DE <form:checkbox path="languages" value="Deutsch"/>-->
<!--FR <form:checkbox path="languages" value="French"/>-->
<form:checkboxes path="languages" items="${employee.languagesList}"/>
<br>
<br>
PhoneNumber <form:input path="phoneNumber"/>
<form:errors path="phoneNumber"/>
<br>
<br>
<input type="submit" value="OK">
</form:form>
</body>
</html>
