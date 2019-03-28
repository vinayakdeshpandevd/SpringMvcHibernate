<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="added" method="post" modelAttribute="Student">


NAME      :<form:input path="name"/><br>
DEPARTMENT:<form:input path="dept"/><br>
MENTOR    :<form:input path="mentor"/><br>
AGE       :<form:input path="age"/><br>
SALARY    :<form:input path="salary"/><br>
<input type="submit">
</form:form>
</form>
</body>
</html>