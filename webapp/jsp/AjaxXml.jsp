<%--
  Created by IntelliJ IDEA.
  User: 浩瀚
  Date: 2017/8/1
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>测试--Ajax请求（xml格式）</title>
</head>
<body>
</body>
<script type="text/javascript" src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        sendxml();
    });

    function sendxml(){
        var xmlData = "<book><id>1</id><name>疯狂Java讲义</name><author>李刚</author></book>";
        $.ajax("${pageContext.request.contextPath}/sendxml",// 发送请求的URL字符串。
            {
                type : "POST", //  请求方式 POST或GET
                contentType:"application/xml", //  发送信息至服务器时的内容编码类型
                // 发送到服务器的数据。
                data: xmlData,
                async:  true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
            });
    }
</script>
</html>
