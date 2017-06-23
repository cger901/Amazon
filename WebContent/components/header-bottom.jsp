<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<link rel="stylesheet" type="text/css" href="css/header.css">
<div class="row clearfix backgrounds">
	<div class="col-md-2 column">
		<a id="viewCategory" role="button" class="btn btn-default"
			data-container="body" data-toggle="popover" data-content="#"
			data-placement="bottom">浏览全部商品分类 <span class="caret"></span></a>
		<jsp:include page="category.jsp"></jsp:include>
	</div>
	<div class="col-md-5 column">
		<ul class="list-unstyled list-inline pull-left">
			<li><a>我的亚马逊</a></li>
			<li><a>Z秒杀</a></li>
			<li><a>礼品卡</a></li>
			<li><a>我要开店</a></li>
			<li><a>海外购</a></li>
			<li><a>帮助</a></li>
			<li><a>In English</a></li>
		</ul>
	</div>
	<div class="col-md-5 column">
		<div class="col-md-4 column">
			<c:set value="${sessionScope.user}" var="user"></c:set>
			您好,
			<c:choose>
				<c:when test="${user!=null}">
								${user.userName}
							</c:when>
				<c:otherwise>请登录</c:otherwise>
			</c:choose>
		</div>
		<div class="col-md-4 column">
			<a id="myAccount" role="button" class="btn btn-default"
				data-container="body" data-toggle="popover" data-content="#"
				data-placement="bottom">我的账户<span class="caret"></span></a>
			<div id="account-popover" class="popover">
				<div class="arrow"></div>
				<div class="col-md-12 column" style="padding: 5px 5px 5px 5px;word-spacing: 5px;">
					<ul class="list-unstyled">
						<li><a href="account/login.jsp" role="button"
							class="btn btn-primary">立即登录</a></li>
						<li><a href="account/doQuit" role="button"
							class="btn btn-danger">注销登录</a></li></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="col-md-4 column">
			<a role="button" type="button" class="btn btn-default" href="cart.jsp">购物车 <span class="badge">${fn:length(cart)}</span></a>
		</div>
	</div>
</div>