<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改</title>
</head>
<body>
<a href="/MavenSSM/index.jsp">返回首页</a>
<form action="/MavenSSM/updstu" method="get">
<table>
		<tr>
			<td>编号</td>
			<td>学号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>操作</td>
			<td>操作</td>
		</tr>
		
		<tr>
			<td><input type="text" value="${id}" name="id" readonly="readonly"></td>
			<td><input type="text" name="stuno"></td>
			<td><input type="text" name="name"></td>
			<td><input type="text" name="age"></td>
			<td><button type="submit">保存</button></td>
		
			<td><a href="/MavenSSM/findall">取消</a></td>
		</tr>

</table>

	</form>

</body>
</html>