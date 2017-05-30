<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
  </head>
  <body>
    <p>Hello <c:out value="${model.name}" />!</p>
  </body>
</html>
