<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Amazon 登录</title>
<link rel="stylesheet" type="text/css"
	href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../css/login.css">
<script type="text/javascript" src="../script/jquery-3.2.1.min.js"></script>
<link rel="shortcut icon" href="../image/amazon-icon.png" />
<link rel="stylesheet" href="../css/account.css">
<script type="text/javascript"
	src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../script/login.js"></script>
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class=col-md-12column">
				<div class="amazon center-block" onclick="location='../'"></div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-4 column"></div>
			<div class="col-md-4 column list-group">
				<div class="row clearfix list-group-item">
					<h2>登录</h2>
					<div class="bs-example">
						<form action="../doLogin" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1">用户名或邮箱地址</label> <input
									type="text" name="username" class="form-control"
									id="exampleInputEmail1" placeholder="Email">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">密码</label> <a href=""
									class="pull-right">忘记密码</a> <input type="password"
									name="password" class="form-control" id="exampleInputPassword1"
									placeholder="Password">
							</div>
							<div class="checkbox">
								<label> <input type="checkbox">记住登录状态。
								</label>
							</div>
							<a role="button" type="submit" class="btn btn-primary" style="width: 100%">登录</a>
							<div class="form-group">
								<span>登录即表示您同意网站的<a>使用条件</a>及<a>隐私声明</a>。</span>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="col-md-4 column"></div>
		</div>
	</div>
</body>
</html>