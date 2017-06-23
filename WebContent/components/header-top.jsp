<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="css/header.css">
<script type="text/javascript" src="script/header.js"></script>
<div class="row clearfix">
	<div class="col-md-2 column">
		<div class="amazon center-block" onclick="location='index.jsp'"></div>
	</div>
	<div class="col-md-8 column">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="input-group">
					<label class="input-group-addon"> <select name="category">
							<option><a href="#">全部分类</a></option>
							<c:forEach
								items="Kindle商店,应用程序和游戏,亚马逊海外购,图书,音乐,游戏/娱乐,音像,软件,教育音像,手机/通讯,摄影/摄像,电子,数码影音,电脑/IT,办公用品,小家电,大家电,电视/音响,家用,家居,厨具,家居装修,宠物用品,食品,酒,美容化妆,个护健康,母婴用品,玩具,运动户外休闲,服饰箱包,鞋靴,钟表,珠宝首饰,汽车用品,乐器,礼品卡,LuxuryBeauty高级美妆店,Z实惠"
								var="i">
								<option>${i}</option>
							</c:forEach>
					</select>
					</label> <input name="search" type="text" placeholder="Search" class="form-control" aria-label="...">
					<div class="input-group-btn">
						<a role="button" type="button" class="btn btn-success" onclick="doSearch()"><label class="glyphicon glyphicon-search"></label></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="col-md-2 column">
		<img src="image/advertisement/adtop.jpg" class="img-responsive" />
	</div>
</div>