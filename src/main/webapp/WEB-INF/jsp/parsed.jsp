<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>HtmlParse</title>
  <link type="text/css" rel="stylesheet" href="/resources/css/base.css">
  <link type="text/css" rel="stylesheet" href="/resources/css/elements.css">
</head>
<body>
<div id="wrapper">
  <div id="side">
    <div class="inner">
      <p>Sidebar content here</p>
    </div>
  </div>
  <div id="content">
    <div class="inner">
      <c:forEach items="${document.tags}" var="tag">
        <c:set var="tag" scope="request" value="${tag}"/>
        <c:import url="tag.jsp"/>
      </c:forEach>
    </div>
  </div>
  <div id="footer">
    <div class="inner">
      <p>Footer</p>
    </div>
  </div>
</div>
</body>
</html>
