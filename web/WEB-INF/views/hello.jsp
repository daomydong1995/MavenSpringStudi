<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HelloWorld</title>
        <link type="text/css" href="<c:url value='/adminres/css/style.css'/>" rel="stylesheet"/>
        <script type="application/javascript" src="<c:url value='/adminres/js/main.js'/>"></script>
    </head>
    <body>
        <p>Xin chào ${data}</p>
    </body>
</html>