<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<h3>推荐</h3>
	<hr />
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
				<div class="col-sm-6 col-md-3">
					<a class="thumbnail" href="view.jsp"> <img src="image/product/p0.jpg"
						alt="通用的占位符缩略图"> <label>GUND 小BOO毛绒玩具</label>
						<p>￥119.00</p>
					</a>
				</div>
				<div class="col-sm-6 col-md-3">
					<a class="thumbnail"> <img src="image/product/p0.jpg"
						alt="通用的占位符缩略图"> <label>GUND 小BOO毛绒玩具</label>
						<p>￥119.00</p>
					</a>
				</div>
				<div class="col-sm-6 col-md-3">
					<a class="thumbnail"> <img src="image/product/p0.jpg"
						alt="通用的占位符缩略图"> <label>GUND 小BOO毛绒玩具</label>
						<p>￥119.00</p>
					</a>
				</div>
				<div class="col-sm-6 col-md-3">
					<a class="thumbnail"> <img src="image/product/p0.jpg"
						alt="通用的占位符缩略图"> <label>GUND 小BOO毛绒玩具</label>
						<p>￥119.00</p>
					</a>
				</div>
				<div class="col-sm-6 col-md-3">
					<a class="thumbnail"> <img src="image/product/p0.jpg"
						alt="通用的占位符缩略图"> <label>GUND 小BOO毛绒玩具</label>
						<p>￥119.00</p>
					</a>
				</div>
			</div>
		</div>
	</div>
	<hr />
	<!-- 蜂窝 -->
	<jsp:include page="comb.jsp"><jsp:param value="0"
			name="id" /></jsp:include>
	<!-- 广告 -->
	<jsp:include page="ad2.jsp">
		<jsp:param value="0" name="id" /></jsp:include>
	<!-- 蜂窝 -->
	<c:forEach var="i" items="1,2,3"><jsp:include
			page="comb.jsp"><jsp:param value="${i}" name="id" /></jsp:include></c:forEach>
	<!-- 广告 -->
	<jsp:include page="ad2.jsp">
		<jsp:param value="1" name="id" /></jsp:include>
	<!-- 蜂窝 -->
	<c:forEach var="i" items="4,5,6"><jsp:include
			page="comb.jsp"><jsp:param value="${i}" name="id" /></jsp:include></c:forEach>
</div>