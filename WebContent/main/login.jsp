<!-- 
/***********************************************************
*													
*														
*	项目名称：				
*	子系统名：			
*	功能名称：	
*	完成人员：					
*	完成时间：					
*								
*									
************************************************************/
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>小型图书资料管理系统登录页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body background="../photo/4.jpg">
	<form method="post" action="LoginAction.action" name="frm">
	 <center><font size="4" >欢迎进入小型图书资料管理系统</font><br/><br/>
	    用户账户： <input type="text" size="30" name="user.username" value="admin"><br/>
	    登录密码： <input type="password" size="30" name="user.userpass" value="123456"><br/><br/>
	  <input type="submit" value="登录系统" name="login">
	  <input type="reset" value="重新填写" name="reset"><br/><br/>
      <font size="1">Copyright@ 2009-2019 版权所有 辽宁师范大学</font></center>
	</form>
  </body>
</html>
