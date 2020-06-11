<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<div style=" text-align: center;"><h2>HTTP Status 404 – Not Found</h2></div>


<form action="/MavenSSM/inStudent" method="post">
    学号：<input type="text" name="stuno" /><br/>
    姓名：<input type="text" name="name" /><br/>
    年纪：<input type="text" name="age" /><br/>
    <input type="submit" value="保存"/><br/>
</form>

<form action="/MavenSSM/findStudentById" method="post">

查询：<input type="text" name="id"><br/>
<input type="submit" value="查询"/><br/>
</form>
<a href="/MavenSSM/findall"><button>查询全部</button></a>
</body>
</html>
