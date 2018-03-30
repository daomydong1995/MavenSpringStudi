<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form tạo Person</h2>
<%--@elvariable id="person" type="dong.model.Person"--%>
<form:form method="post" modelAttribute="person" action="${addPerson}">
    <form:input path="name"/>
    <form:input path="age"/>
    <button type="submit">Submit</button>
</form:form>
</body>
</html>
