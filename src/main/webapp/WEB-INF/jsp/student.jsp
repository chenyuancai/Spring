<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>学号</td>
			<td>姓名</td>
			<td>年龄</td>
		</tr>
		<tr>
			<td>${student.id}</td>
			<td>${student.stuno}</td>
			<td>${student.name}</td>
			<td>${student.age}</td>
		</tr>
	</table>
</body>
</html>