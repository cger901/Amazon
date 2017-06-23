<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="promotion">
	<div style="padding: 2% 2% 2% 2%;">
		<jsp:include page="ad3.jsp"><jsp:param value="0"
				name="id" /></jsp:include>
		<hr />
		<div class="row clearfix">
			<div class="col-md-12 column">
				<ul class="list-unstyled">
					<li>活动正在准备中，敬请期待</li>
				</ul>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column"></div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column"></div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column"></div>
		</div>
		<hr />
		<img alt="" class="img-responsive" src="image/alert.png">
		<hr />
		<c:forEach var="i" items="1,2">
			<jsp:include page="ad3.jsp"><jsp:param value="${i}"
					name="id" /></jsp:include></c:forEach>
	</div>
</div>