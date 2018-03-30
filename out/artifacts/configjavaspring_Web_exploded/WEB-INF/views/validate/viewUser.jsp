<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href=""/>
</head>
<body>
<%--@elvariable id="user" type="dong.model.User"--%>
<h2>View User</h2>
<p>Tên : ${user.userName}</p>
<p>Tên : ${user.passWord}</p>
<p>Tên : ${user.address}</p>
<p>Tên : ${user.phone}</p>
<p>Tên : ${user.age}</p>
</body>
</html>
