<html>
<head>
<title>Home - Manage Personal Expenses</title>
<link rel="stylesheet" type="text/css" href="../../resources/style.css">
</head>
<body onload='document.loginForm.username.focus();'>

	<h1 align="center" style="color: #95B9C7;font-family: sans-serif ">Welcome to Personal Expense Manager</h1>

	<div id="login-box" align="center">

		<h2>Login with Username and Password</h2>

		<form name='loginForm' action="login" method='POST'>

			<table bgcolor="#E3E4FA" border="1">
				<tr  style="font-family: sans-serif">
					<td>Account Number:</td>
					<td><input type='text' name='user' value=''></td>
				</tr>
				<tr style="font-family:sans-serif">
					<td>Password:</td>
					<td><input type='password' name='pass' /></td>
				</tr>
				<tr>
					<td colspan='2' align="center"><input name="submit" type="submit"
						value="submit" /></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>