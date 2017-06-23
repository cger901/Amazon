<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="now" class="java.util.Date" />
<c:set var="time" value="${now.time}" />
<script type="text/javascript" src="script/comb.js"></script>
<script type="text/javascript">$(function(){showComb(${param.id},${time})})</script>
<link rel="stylesheet" type="text/css" href="css/comb.css" />
<div class="row clearfix component">
	<div class="col-md-12 column">

		<div>
			<img src="image/icon/comb${param.id}.png">
			<h3>
				<b>海外购</b>
			</h3>
			<ul class="list-unstyled list-inline">
				<li><a>奶粉</a></li>
				<li><a>美妆</a></li>
				<li><a>箱包</a></li>
				<li><a>热门品牌</a></li>
			</ul>
		</div>
		<div id="comb${param.id}_a1${time}" class="comb pull-left">
			<h4>图书</h4>
		</div>
		<div id="comb${param.id}_a2${time}" class="comb pull-left">
			<div id="comb${param.id}_c1${time}" class="arrow"></div>
		</div>
		<div id="comb${param.id}_a3${time}" class="comb pull-left">
			<h4>音像</h4>
		</div>
		<div id="comb${param.id}_a4${time}" class="comb combs pull-left">
			<div id="comb${param.id}_c2${time}" class="arrow"></div>
		</div>
		<div id="comb${param.id}_a5${time}" class="comb pull-left"></div>
		<div id="comb${param.id}_a6${time}" class="comb pull-left"></div>

		<div id="comb${param.id}_b1${time}" class="comb pull-left">
			<h4>图书</h4>
		</div>
		<div id="comb${param.id}_b2${time}" class="comb pull-left">
			<div id="comb${param.id}_c3${time}" class="arrow"></div>
		</div>
		<div id="comb${param.id}_b3${time}" class="comb pull-left">
			<h4>音像</h4>
		</div>
		<div id="comb${param.id}_b4${time}" class="comb combs pull-left">
			<div id="comb${param.id}_c4${time}" class="arrow"></div>
		</div>
		<div id="comb${param.id}_b5${time}" class="comb pull-left"></div>
		<div id="comb${param.id}_b6${time}" class="comb pull-left"></div>
	</div>
</div>