<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 03/02/2026
  Time: 12:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Bảng:</h2>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Mã nhân viên</th>
        <th>Tên</th>
        <th>Giới Tính</th>
        <th>Email</th>
        <th>Số điện thoại</th>
        <th>Lương</th>
        <th>Trạng thái</th>
        <th>Phòng</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listEmployees}" var="ep">
        <tr>
            <td>${ep.id}</td>
            <td>${ep.maNhanVien}</td>
            <td>${ep.ten}</td>
            <td>${ep.gioiTinh}</td>
            <td>${ep.email}</td>
            <td>${ep.soDienThoai}</td>
            <td>${ep.luong}</td>
            <td>${ep.trangThai}</td>
            <td>${ep.idPhong != null ? ep.DepartmentsId.id : 'N/A'}</td
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
