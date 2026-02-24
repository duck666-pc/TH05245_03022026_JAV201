<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 03/02/2026
  Time: 12:35 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách phòng</title>
</head>
<body>
<h2>Bảng:</h2>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Mã Phòng</th>
        <th>Tên Phòng</th>
        <th>Ngày Thành Lập</th>
        <th>Hoạt Động</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listDepartments}" var="dp">
        <tr>
            <td>${dp.id}</td>
            <td>${dp.maPhong}</td>
            <td>${dp.tenPhong}</td>
            <td>${dp.ngayThanhLap}</td>
            <td>${dp.hoatDong}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
