<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form tạo User</h2>
<%--@elvariable id="user" type="dong.model.User"--%>
<form:form method="post" modelAttribute="user" action="${addUser}">
    <form:input path="userName"/>
    <p style="color: red"><form:errors path="userName"/></p>
    <form:input path="passWord"/>
    <p style="color: red"><form:errors path="passWord"/></p>
    <form:input path="address"/>
    <p style="color: red"><form:errors path="address"/></p>
    <form:input path="phone"/>
    <p style="color: red"><form:errors path="phone"/></p>
    <form:input path="age"/><p style="color: red">
    <p style="color: red"><form:errors path="age"/></p>
    <button type="submit">Submit</button>
</form:form>
</body>
</html>
