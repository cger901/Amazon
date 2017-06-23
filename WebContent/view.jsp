<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ taglib prefix="lzq" uri="/WEB-INF/lib/datetag.tld"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ZH">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="script/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css" />
<link rel="shortcut icon" href="image/amazon-icon.png" />
<link rel="stylesheet" type="text/css"
	href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
<script type="text/javascript" src="script/view.js"></script>
<jsp:useBean id="product" class="com.amazon.entity.Product"
	scope="request" />
<jsp:useBean id="user" class="com.amazon.entity.User" scope="session"></jsp:useBean>
<title>${product.productName}</title>
</head>
<body>
	<div class="container">
		<!-- 头部 -->
		<jsp:include page="components/header.jsp"></jsp:include>
		<!-- 内容 -->
		<div class="row clearfix component">
			<!-- 面包屑 -->
			<div class="row clearfix">
				<div class="col-md-12 column">
					<ol class="breadcrumb">
						<li><a href="#">全部商品</a></li>
						<li><a href="#">类别</a></li>
						<li><a href="">子类别</a>
						<li class="active">${product.productName}</li>
					</ol>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="row clearfix">
						<div class="col-md-5 column">
							<img alt="${product.productName}" src="${product.filePath}"
								class="img-responsive center-block">
						</div>
						<div class="col-md-5 column">
							<div class="row clearfix">
								<div class="col-md-12 column">
									<label class="center-block"><h2>${product.productName}</h2></label>
									<hr />
									<dl class="dl-horizontal">
										<dt>售价</dt>
										<dd>${product.price}</dd>
										<dt>促销信息</dt>
										<dd>--</dd>
										<dt>库存</dt>
										<dd id="stock">${product.stock}</dd>
										<dt>购买数量</dt>
										<dd>
											<div class="input-group input-group-sm input-sm" role="group"
												aria-label="...">
												<span class="input-group-btn"><a role="button"
													type="button" class="btn btn-default"
													onclick="clickMinus()">-</a></span> <input type="text"
													class="form-control" id="counts" placeholder="数量" value="1"
													name="count"> <span class="input-group-btn"><a
													role="button" type="button" class="btn btn-default"
													onclick="clickPlus()">+</a></span>
											</div>
										</dd>
										<dt>配送至</dt>
										<dd>${user.address}</dd>
										<dt>送达日期</dt>
										<jsp:useBean id="now" class="java.util.Date" />
										<%-- <dd><lzq:date value="${now.time + 2592000}"/></dd> --%>
										<dd>${now}
										<dd>
										<dt>销售配送</dt>
										<dd>由亚马逊直接销售和发货。</dd>
										<dt>退换承诺</dt>
										<dd>
											此商品支持<b>30天免费退换</b>
										</dd>
									</dl>
									<div class="col-md-8 column"></div>
								</div>
							</div>
						</div>
						<div class="col-md-1 column"></div>
					</div>
				</div>
			</div>
			<!-- 广告 -->
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h4>购买此商品的顾客也同时购买</h4>
					<jsp:include page="components/recommend.jsp"></jsp:include>
				</div>

			</div>
			<!-- 商品描述 -->
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h3>商品描述</h3>
				</div>
				<div class="col-md-12 column">${product.description}</div>
			</div>
			<!-- 产品信息 -->
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h3>产品信息</h3>
				</div>
				<div class="col-md-6 column">
					<table class="table table-striped">
						<caption>技术细节</caption>
						<tbody>
							<tr>
								<th>产地</th>
								<td>中国</td>
							</tr>
							<tr>
								<th>颜色</th>
								<td>不详</td>
							</tr>
							<tr>
								<th>Size</th>
								<td>不详</td>
							</tr>
							<tr>
								<th>厂商推荐适用年龄</th>
								<td>12个月以上</td>
							</tr>
							<tr>
								<th>材质</th>
								<td>不详</td>
							</tr>
							<tr>
								<th>填充物材质</th>
								<td>不详</td>
							</tr>
							<tr>
								<th>是否需要电池</th>
								<td>不是</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="col-md-6 column">
					<table class="table table-striped">
						<caption>更多信息</caption>
						<tbody>
							<tr>
								<th>ASIN</th>
								<td>B01IP3X3N4</td>
							</tr>
							<tr>
								<th>用户评分</th>
								<td>平均4星</td>
							</tr>
							<tr>
								<th>亚马逊热销商品排名</th>
								<td>10</td>
							</tr>
							<tr>
								<th>发货重量</th>
								<td>41g</td>
							</tr>
							<tr>
								<th>Amazon.cn上架时间</th>
								<td>2017年5月31日</td>
							</tr>
						</tbody>
					</table>
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