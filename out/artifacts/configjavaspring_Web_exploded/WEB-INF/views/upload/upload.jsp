<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form up loadr</h2>
<form method="post" action="${uploadFile} " enctype="multipart/form-data">
    <input type="file" name="file">
    <button type="submit">Submit</button>
</form>
</body>
</html>
