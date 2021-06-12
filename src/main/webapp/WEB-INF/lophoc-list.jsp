<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div style="margin-top: 50px"></div>
		<c:url value="/sinhvien" var="UrlSinhvien"></c:url>
		<table class="table table-striped text-center">
			<thead class="table-dark">
				<tr>
					<th>STT</th>
					<th>Mã lớp</th>
					<th>Tên lớp</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="lop" items="${lophocs}" varStatus="i">
					<tr>
						<td>${i.count }</td>
						<td>${lop.shortName }</td>
						<td>${lop.longName }</td>
						<td>
							<a href="update?id=${lop.id }" class="btn btn-outline-primary">Cập nhật</a> 
							<a href="delete?id=${lop.id }" class="btn btn-outline-danger" onclick="return confirm('Bạn có muốn xóa không?')">Xóa</a>
							<a href="${UrlSinhvien }/add?idLophoc=${lop.id }" class="btn btn-outline-secondary">Thêm sinh viên</a> 
							<a href="${UrlSinhvien }/list?idLophoc=${lop.id }" class="btn btn-outline-success">Xem DS sinh viên</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<hr>
		<a class="btn btn-success" href="add">Thêm lớp học mới</a> 
		<a class="btn btn-primary" href="${UrlSinhvien }/list">Xem DS sinh viên</a>
	</div>

</body>
</html>