<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form tạo User</h2>
<%--@elvariable id="person" type="dong.model.User"--%>
<form:form method="post" modelAttribute="person" action="${addUser}">
    <form:input path="userName"/>
    <form:errors path="userName"/>
    <form:input path="passWord"/>
    <form:errors path="passWord"/>
    <form:input path="address"/>
    <form:errors path="address"/>
    <form:input path="phone"/>
    <form:errors path="phone"/>
    <form:input path="age"/>
    <form:errors path="age"/>
    <button type="submit">Submit</button>
</form:form>
</body>
</html>
