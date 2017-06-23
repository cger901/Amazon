<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List" %>
<%@ page import="com.amazon.entity.Product" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ZH">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${param.cate}-亚马逊</title>
<script type="text/javascript" src="script/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css" />
<link rel="shortcut icon" href="image/amazon-icon.png" />
<link rel="stylesheet" type="text/css"
	href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<!-- 头部 -->
		<jsp:include page="components/header.jsp"></jsp:include>
		<!-- 内容 -->
		<div class="row clearfix component">
			<div class="col-md-12 column">
				<c:set var="list" target="${viewProduct}" />
				<c:if test="${fn:length(list)>1}">
					<div class="row">
						<c:forEach var="p" items="${list}">
							<div class="col-sm-6 col-md-3">
								<a class="thumbnail" href="view?p=${p.productId}"> <img
									src="${p.filePath}" alt="${p.productName}"> <label>${p.productName}</label>
									<p>￥${p.price}</p>
								</a>
							</div>
						</c:forEach>
					</div>
				</c:if>
			</div>
			<c:if test="${fn:length(list)>1}">
				<div class="col-md-12 column">
					<nav aria-label="Page navigation">
					<ul class="pagination">
						<li><a href="#" aria-label="Previous"> <span
								aria-hidden="true">&laquo;</span>
						</a></li>
						<c:forEach begin="1" end="${fn:length(list)}" var="i">
							<li><a href="doShow?cate=${param.cate}&page=${i}">${i}</a></li>
						</c:forEach>
						<li><a href="#" aria-label="Next"> <span
								aria-hidden="true">&raquo;</span>
						</a></li>
					</ul>
					</nav>
				</div>
			</c:if>
		</div>
		<!-- 足迹 -->
		<jsp:include page="components/records.jsp"></jsp:include>
		<!-- 页脚 -->
		<jsp:include page="components/footer.jsp"></jsp:include>
	</div>
</body>
</html>