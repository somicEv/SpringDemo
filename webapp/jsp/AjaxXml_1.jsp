<%--
  Created by IntelliJ IDEA.
  User: 浩瀚
  Date: 2017/8/1
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>测试--xml json互相转换</title>
</head>
<body>
	<div>
		<textarea id="xml" rows="20" cols="80" >xml</textarea>
		<textarea id="json" rows="20" cols="80">json</textarea>
	</div>
	<input type="button" value="xml2json" onclick="fnXml2json()"/>
	<input type="button" value="json2xml" onclick="fnJson2xml()"/>
</body>
<script type="text/javascript" src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="/js/jkl-dumper.js"></script>
<script type="text/javascript" src="/js/ObjTree.js"></script>
<script type="text/javascript">
    function fnXml2json(){
        //将xml字符串转为json
        var xotree = new XML.ObjTree();
        var xmlText = document.getElementById("xml").value;
        var json = xotree.parseXML(xmlText);
        //将json对象转为格式化的字符串
        var dumper = new JKL.Dumper();
        var jsonText = dumper.dump(json);
        document.getElementById("json").value = jsonText;
    }
    function fnJson2xml(){
        var xotree = new XML.ObjTree();
        var jsonText = document.getElementById("json").value;
//将json字符串转为json对象后转为xml字符串
        var json = eval("(" + jsonText + ")");
        var xml = xotree.writeXML(json);
        //使用jkl-dumper.js中的formatXml方法将xml字符串格式化
        var xmlText = formatXml(xml);
        document.getElementById("xml").value = xmlText;
    }
</script>
</html>
