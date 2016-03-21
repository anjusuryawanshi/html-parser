<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>HtmlParse</title>
  <link type="text/css" rel="stylesheet" href="/resources/css/base.css">
</head>
<body>
<div id="wrapper">
  <div id="content">
    <div class="inner" style="width: 100%; text-align: center;padding: 50px">
      <form action="/parse">
        enter url <input type="text" name="url">
        <input type="submit" value="Submit">
      </form>
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
