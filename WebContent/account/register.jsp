<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Amazon 注册</title>
<link rel="stylesheet" type="text/css"
	href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../css/login.css">
<script type="text/javascript" src="../script/jquery-3.2.1.min.js"></script>
<link rel="shortcut icon" href="../image/amazon-icon.png" />
<link rel="stylesheet" href="../css/account.css">
<script type="text/javascript"
	src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class=col-md-12column">
				<div class="amazon center-block" onclick="location='../'"></div>
			</div>
			<div class="row clearfix">
				<div class="col-md-4 column"></div>
				<div class="col-md-4 column list-group">
					<div class="row clearfix list-group-item">
						<h2>创建用户</h2>
						<div class="bs-example">
							<form action="../doLogin" method="post">
								<div id="name" class="form-group">
									<label for="exampleInputEmail1">设置一个用户名</label> <input
										type="text" name="username" class="form-control" id="username"
										placeholder="由a-z或A-Z的字母和0-9的数字组成">
								</div>
								<div id="pwd" class="form-group">
									<label for="exampleInputPassword1">设置一个密码</label> <input
										type="password" name="password" class="form-control" id="pwd"
										placeholder="由a-z或A-Z的字母和0-9的数字组成">
								</div>
								<div id="repwd" class="form-group">
									<label for="exampleInputPassword1">再次输入密码</label> <input
										type="password" name="password" class="form-control"
										id="repwd" placeholder="确认与密码一致">
								</div>
								<div id="sex" class="form-group">
									<label>性别</label>
									<label class="checkbox-inline"> <input type="radio"
										name="sex" id="optionmale" value="male" checked>男性
									</label> <label class="checkbox-inline"> <input type="radio"
										name="sex" id="optionsfamale" value="famale">女性
									</label>
								</div>
								<div id="uid" class="form-group">
									<label for="exampleInputEmail1">身份证号</label> <input
										type="text" name="identity_code" class="form-control" id="identity_code"
										placeholder="15或18位中国公民身份证号">
								</div>
								
								<div id="uemail" class="form-group">
									<label for="exampleInputEmail1">邮箱地址</label> <input
										type="email" name="email" class="form-control" id="email"
										placeholder="abc@amazon.com">
								</div>
								<div id="umobile" class="form-group">
									<label for="exampleInputEmail1">手机号码</label> <input
										type="text" name="mobile" class="form-control" id="mobile"
										placeholder="11位中国大陆手机号码">
								</div>
								<div id="uaddr" class="form-group">
									<label for="exampleInputEmail1">地址</label> <input
										type="text" name="address" class="form-control" id="address"
										placeholder="请设置您的默认收货地址">
								</div>
								<div id="uok" class="checkbox">
									<label> <input name="ok" type="checkbox">我已阅读并同意网站的<a>使用条件</a>及<a>隐私声明</a>。
									</label>
								</div>
								<a role="button" type="submit" class="btn btn-warning"
									style="width: 100%">继续</a>
							</form>
						</div>
					</div>
				</div>
				<div class="col-md-4 column"></div>
			</div>
		</div>
	</div>
</body>
</html>