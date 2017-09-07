<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<meta name="format-detection" content="telephone=no" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="author" content="liangtaikun" />
<title>权限管理界面</title>
</head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bottons.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.12.0.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/sweetalert.css">


<script type="text/javascript">
	window.onload = function() {
		var input1 = document.getElementById("div1");
		var ss = input1.value;
		alert(ss);
		if (ss != "") {
			swal(ss, "操作成功", "success");
		}
	}
	//控制所属功能组的显示
	function show(s) {
		if (s == "0") {
			document.getElementById("Groupid").style.display = "";
		}
		if (s == "1") {
			document.getElementById("Groupid").style.display = "none";
		}
	}
	function findcity(upcity){
		$.ajax({
			type : "POST",
			contentType : 'application/json',
			url : "${pageContext.request.contextPath}/OpInfo/findcity",
			data : upcity,
			dataType : "json",
			success : function(data) {
				 $.each(data.list, function(i, item){
			 $("#Op_btcity").append("<option value='"+item.bid+"'>"+item.brhname+"</option>"); 
				 });
			}
		});
	}
	//通过OPID获取操作员相关信息
	function findOPInfo() {
		var pid = $("#pid").val();

		if (pid.length == 14) {
			$.ajax({
				type : "POST",
				contentType : 'application/json',
				url : "${pageContext.request.contextPath}/OpInfo/findOpInfo",
				data : pid,
				dataType : "json",
				success : function(data) {
					if (data.msg == 1) {
						$("#pid").val("");
						$("#Op_name").val("");
						$("#Op_personid").val("");
						$("#Op_zctrank").val("");
						swal("工号失效");
					}

					if (data.msg == 0) {
						$("#pid").val("");
						$("#Op_name").val("");
						$("#Op_personid").val("");
						$("#Op_zctrank").val("");
						swal("工号无权限或不存在");
					}

					else {
						alert(data.t01PsnEntity.psnname);
						$("#Op_name").val(data.t01PsnEntity.psnname);
						$("#Op_personid").val(data.t01PsnEntity.t01personid);
						$("#Op_zctrank").val(data.t01PsnEntity.t01actrank);
						// $("#Op_btzc").val(data.psnname);
					}
				}
			});
		}
	}
	//提交数据
	function add() {
		var pid = $("#pid").val();

		if (pid.length > 0) {

			document.getElementById("formid").action = "${pageContext.request.contextPath}/OpInfo/addOpInfo";
			$("#formid").submit();
		}
		if (pid.length == 0) {
			swal("请输入工号");
		}
	}
</script>
<body>
	<div>
		<input type="hidden" name="msg" id="div1" value="${msg}" />
	</div>
<body class="gray-bg">
	<div style="text-align: center;">
		<img alt="logo"
			src="${pageContext.request.contextPath}/image/logo_clic.png"
			height=70px>
	</div>

	<div
		style="text-align: center; background-color: #FFD700; font-size: 18px">操作员信息</div>
	<br>
	<form id="formid" method="post">
		<div class="wrap">
			<div class="row">
				<div class="col-xs-1"></div>
				<div class="col-xs-4">
					<input class="form-control" value="操作员工号" disabled="disabled">
				</div>
				<div class="col-xs-6">
					<input type="text" id="pid" class="form-control" name="pid"
						placeholder="请输入工号" maxlength="14" onchange="findOPInfo()">
				</div>
				<div class="col-xs-1"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-xs-1"></div>
				<div class="col-xs-4">
					<input class="form-control" value="操作员姓名" disabled="disabled">
				</div>
				<div class="col-xs-6">
					<input type="text" id="Op_name" class="form-control" name="Op_name"
						placeholder="操作员姓名" style="text-align: right;">
				</div>
				<div class="col-xs-1"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-xs-1"></div>
				<div class="col-xs-4">
					<input class="form-control" value="操作员身份证号" disabled="disabled">
				</div>
				<div class="col-xs-6">
					<input type="text" id="Op_personid" class="form-control"
						name="Op_personid" placeholder="操作员身份证号"
						style="text-align: right;">
				</div>
				<div class="col-xs-1"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-xs-1"></div>
				<div class="col-xs-4">
					<input class="form-control" value="操作员职级" disabled="disabled">
				</div>
				<div class="col-xs-6">
					<input type="text" id="Op_zctrank" class="form-control"
						name="Op_zctrank" placeholder="操作员职级" style="text-align: right;">
				</div>
				<div class="col-xs-1"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-xs-1"></div>
				<div class="col-xs-4">
					<input class="form-control" value="操作员类型" disabled="disabled">
				</div>
				<div class="col-xs-6">
					<select id="OP_Type" name="OP_Type" class="form-control"
						onchange="show(this.options[this.options.selectedIndex].value)">
						<option value="0">功能组组长</option>
						<option value="1">岗位管理人员</option>
					</select>
				</div>
				<div class="col-xs-1"></div>
			</div>

			<div id="Groupid" class="row">
				<br>
				<div class="col-xs-1"></div>
				<div class="col-xs-4">
					<input class="form-control" value="所属功能组" disabled="disabled">
				</div>
				<div class="col-xs-6">
					<select id="OP_Group" name="OP_Group" class="form-control">
						<option value="增员组">增员组</option>
						<option value="日常组">日常组</option>
						<option value="辅训组">辅训组</option>
						<option value="销支组">销支组</option>
						<option value="绩效组">绩效组</option>
					</select>
				</div>
				<div class="col-xs-1"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-xs-1"></div>
				<div class="col-xs-4">
					<input class="form-control" value="所属地市" disabled="disabled">
				</div>
				<div class="col-xs-6">
					<select id="Op_btupcity" name="Op_btupcity" class="form-control"
					onchange="findcity(this.options[this.options.selectedIndex].value)">
						<option value=""></option>
						<option value="450100">南宁市</option>
						<option value="450200">柳州市</option>
						<option value="450300">桂林市</option>
						<option value="450400">梧州市</option>
						<option value="450500">北海市</option>
						<option value="450600">防城港市</option>
						<option value="452500">玉林市</option>
						<option value="452600">百色市</option>
						<option value="452700">河池市</option>
						<option value="452800">钦州市</option>
						<option value="452900">贵港市</option>
						<option value="453200">崇左市</option>
						<option value="453300">来宾市</option>
						<option value="453400">贺州市</option>
					</select>
				</div>
				<div class="col-xs-1"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-xs-1"></div>
				<div class="col-xs-4">
					<input class="form-control" value="所属支公司" disabled="disabled">
				</div>
				<div class="col-xs-6">
					<select id="Op_btcity" name="Op_btcity" class="form-control">
						
					
					</select>
				</div>
				<div class="col-xs-1"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-xs-1"></div>
				<div class="col-xs-4">
					<input class="form-control" value="所属职场" disabled="disabled">
				</div>
				<div class="col-xs-6">
					<input type="text" id="Op_btzc" class="form-control" name="Op_btzc"
						placeholder="所属职场" style="text-align: right;">
				</div>
				<div class="col-xs-1"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-xs-1"></div>
				<div class="col-xs-4">
					<input class="form-control" value="操作员状态" disabled="disabled">
				</div>
				<div class="col-xs-6">
					<select id="OP_State" name="OP_State" class="form-control">
						<option value="1">有效</option>
						<option value="0">失效</option>

					</select>
				</div>
				<div class="col-xs-1"></div>
			</div>
		</div>
		<div class="btn-wrap" style="text-align: center;">
			<div class="btn-group btn-group-justified">
				<div class="button-group">
					<button type="submit"
						class="button button-royal button-rounded button-raised"
						id="tijiao" onclick="add()">提交</button>
				</div>

			</div>
		</div>


	</form>
</body>
</body>
</html>