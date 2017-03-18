<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录界面</title>
</head>
<body style="background-image:url(img.jpg);background-repeat:no-repeat;background-size:100% 100%">
<center>
<!-- <fieldset style="background-color:#C4E1FF;width:600px;height:300px"><br/> --> 
<br/><br/><br/><br/><br/><br/><font size="6">欢迎进入登录界面</font><br/><br/><br/>
<form method = "post" action="log" >
<br/><br/>
	账&nbsp;号:&nbsp;<input type="text" id="id" name="id"/><br/><br/>
	密&nbsp;码:&nbsp;<input type="password" id="pwd" name="pwd" /><br/><br/>
	<input type="submit" value="登&nbsp;录" />&nbsp;&nbsp;
	<input type="button" value="注&nbsp;册" onclick="window.location.href='regist.jsp'"/>
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
</form>
<!-- </fieldset> -->
</center>
</body>
</html>