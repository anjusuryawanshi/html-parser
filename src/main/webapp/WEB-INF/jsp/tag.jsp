<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="tag" value="${requestScope.tag}"/>
<div class="htmltag tag-<c:out value="${tag.name}" />">
  <div class="tag-depth">
    <c:out value="<${tag.name}"/><c:forEach items="${tag.attributes}" var="attribute">
    <c:out value="${attribute.key}"/>="<c:out value="${attribute.value}"/>"</c:forEach>&gt;<c:forEach
      items="${tag.children}" var="child">
    <c:set var="tag" scope="request" value="${child}"/>
    <c:import url="tag.jsp"/>
  </c:forEach><c:out value="${tag.text}"/><c:out value="<\\${tag.name}>"/>
  </div>
</div>
