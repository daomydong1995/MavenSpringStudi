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
<h2>View File</h2>
<p>Tên file là : ${ file.getOriginalFilename()}</p>
</body>
</html>
