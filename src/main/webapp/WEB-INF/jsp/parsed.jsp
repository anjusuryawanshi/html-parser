<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>HtmlParse</title>
  <link type="text/css" rel="stylesheet" href="/resources/css/base.css">
  <link type="text/css" rel="stylesheet" href="/resources/css/elements.css">
  <script type="text/javascript" src="/resources/js/jquery-1.12.2.min.js"></script>
  <script type="text/javascript" src="/resources/js/elements.js"></script>
</head>
<body>
<div id="wrapper">
  <div id="side">
    <div class="inner">
      <c:forEach items="${document.tagCounts}" var="tagCount">
        <div class="tagcount tag-<c:out value="${tagCount.key}"/>">
          <a href="#<c:out value="${tagCount.key}"/>"><c:out value="${tagCount.key}"/></a>
          &gt;
          <c:out value="${tagCount.value}" />
        </div>
      </c:forEach>
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
