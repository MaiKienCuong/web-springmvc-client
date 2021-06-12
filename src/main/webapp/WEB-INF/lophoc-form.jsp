<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
		
		<form:form action="save" method="post" modelAttribute="lophoc">
			<div class="form-group">
				<form:input path="id" type="hidden" class="form-control" />
			</div>

			<br>

			<div class="form-group">
				<form:label path="shortName">
					<strong>Mã lớp</strong>
				</form:label>
				<form:input path="shortName" class="form-control" placeholder="Mã lớp"/>
				<form:errors path="shortName" cssStyle="color:red"></form:errors>
			</div>

			<br>

			<div class="form-group">
				<form:label path="longName">
					<strong>Tên lớp</strong>
				</form:label>
				<form:input path="longName" class="form-control" placeholder="Tên lớp" />
				<form:errors path="longName" cssStyle="color:red"></form:errors>
			</div>
			
			<br>
			<hr>
			
			<a href="list" class="btn btn-danger">&ltQuay lại</a>
			<button type="submit" class="btn btn-success">Lưu</button>

		</form:form>
	</div>

</body>
</html>