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
		<table class="table table-striped text-center">
			<thead class="table-dark">
				<tr>
					<th>STT</th>
					<th>First name</th>
					<th>Last name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="sv" items="${sinhviens}" varStatus="i">
					<tr>
						<td>${i.count }</td>
						<td>${sv.firstName }</td>
						<td>${sv.lastName }</td>
						<td>${sv.email }</td>
						<td>
							<a href="update?id=${sv.id }" class="btn btn-outline-primary">Cập nhật</a> 
							<a href="delete?id=${sv.id }" class="btn btn-outline-danger" onclick="return confirm('Bạn có muốn xóa không?')">Xóa</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<hr>

		<a href="${pageContext.request.contextPath }/lophoc/list"
			class="btn btn-success">Xem DS lớp học</a>
	</div>

</body>
</html>