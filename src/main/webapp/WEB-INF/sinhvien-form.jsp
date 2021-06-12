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
		<form:form action="save" method="post" modelAttribute="sinhvien">
			<div class="form-group">

				<form:input path="id" type="hidden" class="form-control" />
				<form:input path="lophoc.id"  type="hidden" class="form-control" />
			</div>

			<br>
			<div class="form-group">
				<form:label path="firstName">
					<strong>First name</strong>
				</form:label>
				<form:input path="firstName" class="form-control" placeholder="First name"/>
			</div>

			<br>
			<div class="form-group">
				<form:label path="lastName">
					<strong>Last name</strong>
				</form:label>
				<form:input path="lastName" class="form-control"  placeholder="Last name"/>
				<form:errors path="lastName" cssStyle="color:red"></form:errors>
			</div>

			<br>
			<div class="form-group">
				<form:label path="email">
					<strong>Email</strong>
				</form:label>
				<form:input path="email" class="form-control" placeholder="Email" type="email"/>
			</div>
			<br>
			<hr>
			
			<a href="list" class="btn btn-danger">&ltQuay lại</a>
			<button type="submit" class="btn btn-success">Lưu</button>

		</form:form>
	</div>

</body>
</html>