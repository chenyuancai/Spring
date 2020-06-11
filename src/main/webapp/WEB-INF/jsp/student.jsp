<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
</head>
<body>
<a href="/MavenSSM/index.jsp">返回首页</a>
	<table>
		<tr>
			<td>编号</td>
			<td>学号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>操作</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.ll}" var="student">
		<tr>
			<td>${student.id}</td>
			<td>${student.stuno}</td>
			<td>${student.name}</td>
			<td>${student.age}</td>
			<td><a href="/MavenSSM/goupd?id=${student.id}"><button>编辑</button></a></td>
			<td><a href="/MavenSSM/delstu?id=${student.id}"><button>删除</button></a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>