<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home - Manage Personal Expenses</title>
<style>
	.error { 
		color: red;font-family:sans-serif"
	}
	
	.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body onload='document.loginForm.username.focus();'>

	<h1 align="center" style="color: #95B9C7; font-family: sans-serif">Welcome
		to Personal Expense Manager</h1>
		
	<div align="center">
		<h2>Login</h2>
		<table bgcolor="#E3E4FA" border="1">
		<form:form action="login" commandName="userAccountForm" method="POST">
		<form:errors path="*" cssClass="errorblock" element="div" />
				<tr  style="font-family: sans-serif">
					<td >AccountNumber: </td>
					<td ><form:input path="accountNumber" size="30"/></td>
				<%-- 	<td align="left"><form:errors path="accountNumber" cssClass="error"/></td> --%>
				</tr>
				<tr  style="font-family: sans-serif">
					<td>Password: </td>
					<td><form:password path="password" size="30"/></td>
				<%-- 	<td align="left"><form:errors path="password" cssClass="error"/></td> --%>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit" value="Login"/></td>
		</form:form>
		</table>
	</div>
</body>
</html>