<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户信息显示</title>
<style type="text/css" >
	table,td,th {
		border: 1px solid black; 
		border-collapse: collapse;
		text-align: center;
		
	}
/* 	.odd { 
	background-color: #ffc; /* pale yellow for odd rows */ 
	} 
	.even { 
	background-color: #cef; /* pale blue for even rows */ 
	}
	 */
</style>
<script type="text/javascript" src="jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("tr").addClass("odd");
		$("tr:even").addClass("even");
		
	})
</script>
</head>
<body>
<center>
	<font size="6" color="red">以下是您的所有信息</font><br/><br/><br/>
	<table border="8" cellspacing="10">
		<tr>
			<td>手机号</td>
			<c:forEach items="${list}" var="l" >
			<td><b>${l.num}</b></td>
			</c:forEach>
		</tr>
		<tr>
			<td>姓名</td>
			<c:forEach items="${list}" var="l" >
			<td><b>${l.name}</b></td>
			</c:forEach>
		</tr>
		<tr>
			<td>用户ID</td>
			<c:forEach items="${list}" var="l" >
			<td><b>${l.id}</b></td>
			</c:forEach>
		</tr>
	</table>
</center>
</body>
</html>