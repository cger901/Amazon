<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ZH">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>亚马逊-网上购物商城：要网购，就来Z.cn！</title>
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
		<!-- 横幅广告 -->
		<div class="row clearfix">
			<jsp:include page="components/ad1.jsp"></jsp:include>
		</div>
		<!-- 头部 -->
		<jsp:include page="components/header.jsp"></jsp:include>
		<!-- 内容 -->
		<div class="row clearfix component">
			<div class="col-md-12 column">
				<!-- 轮播广告 -->
				<jsp:include page="components/carousel.jsp"></jsp:include>
				<!-- 橱窗 -->
				<div class="row clearfix component">
					<!-- 展示柜 -->
					<div id="main" class="col-md-9 column">
						<jsp:include page="components/content.jsp"></jsp:include>
					</div>
					<!-- 促销栏 -->
					<div class="col-md-3 column">
						<jsp:include page="components/news.jsp"></jsp:include>
					</div>
				</div>
			</div>
		</div>
		<!-- 足迹 -->
		<jsp:include page="components/records.jsp"></jsp:include>
		<!-- 页脚 -->
		<jsp:include page="components/footer.jsp"></jsp:include>
	</div>
</body>
</html>