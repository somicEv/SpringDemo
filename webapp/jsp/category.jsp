<%--
  Created by IntelliJ IDEA.
  User: 浩瀚
  Date: 2017/7/18
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
	<h1>商品分类展示</h1>
	<c:forEach var="category" items="${model.resultList}">
		<p>
			分类ID:<c:out value="${category.cid}"></c:out>
		</p>
		<p>
			分类名称:<c:out value="${category.cname}"></c:out>
		</p>
	</c:forEach>
</body>
</html>
