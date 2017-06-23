<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="category-popover" class="popover"
	style="padding: 1% 1% 1% 1%;">
	<div class="arrow"></div>
	<c:set var="categoryInfo" value="${categoryInfo}"></c:set>
	<div class="pull-left" style="padding: 5px 5px 0em 5px;">
		<ul class="list-unstyled">
			<c:forEach items="${categoryInfo}" var="categoryList">
				<!-- 一级目录 -->
				<li><a role="text" data-container="body" data-toggle="popover"
					data-content="#" data-placement="bottom" data-template="list-popver">${categoryList[0].categoryname}
						<span class="caret"></span>
				</a></li>
			</c:forEach>
			<hr />
			<li><a>全部商品分类</a></li>
		</ul>
	</div>
	<div id="list-popver" class="popover pull-right" style="width: 600px;">
		<h4>类别名</h4>
		<dl class="dl-horizontal">
			<dt>...</dt>
			<dd>...</dd>
		</dl>
	</div>
</div>