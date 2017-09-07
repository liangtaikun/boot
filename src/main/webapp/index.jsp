<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
<title>首页页面</title>
</head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.12.0.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>

<body class="gray-bg">
	<div style="text-align: center;">
		<img alt="logo"
			src="${pageContext.request.contextPath}/image/logo_clic.png"
			height=70px>
	</div>
	<br>
	<br>
	<!-- 由后台获取的权限值判定显示的按钮，权限值分类：0为系统管理员，1为岗位管理人员，2为增员组组长，3为日常组组长，
	           4为辅训组组长，5为销支组组长，6为绩效组长 -->
	<c:if test="${state==0}">
		<div
			style="text-align: center; background-color: #2BD56F; font-size: 18px">过程性指标</div>
		<a href="${pageContext.request.contextPath}/increasGroup.jsp"
			class="list-group-item">增员支持组</a>
	</c:if>
	<c:if test="${state==0}">
		<div
			style="text-align: center; background-color: #2BD56F; font-size: 18px">过程性指标</div>
		<a href="${pageContext.request.contextPath}/dailyGroup.jsp"
			class="list-group-item">日常管理组</a>
	</c:if>
	<c:if test="${state==0}">
		<div
			style="text-align: center; background-color: #2BD56F; font-size: 18px">过程性指标</div>
		<a
			href="${pageContext.request.contextPath}/assistTrainingGroup.jsp"
			class="list-group-item">辅导训练组</a>
	</c:if>
	<c:if test="${state==0}">
		<div
			style="text-align: center; background-color: #2BD56F; font-size: 18px">过程性指标</div>
		<a
			href="${pageContext.request.contextPath}/salesSupportGroup.jsp"
			class="list-group-item">销售支持组</a>
	</c:if>
	<c:if test="${state==0}">
		<div
			style="text-align: center; background-color: #2BD56F; font-size: 18px">过程性指标</div>
		<a
			href="${pageContext.request.contextPath}/performanceGroup.jsp"
			class="list-group-item">绩效管理组</a>
	</c:if>
	<c:if test="${state==0}">
		<div
			style="text-align: center; background-color: #2BD56F; font-size: 18px">统计查询</div>
		<a
			href="${pageContext.request.contextPath}/authorityManagement.jsp"
			class="list-group-item">操作员权限管理</a>

	</c:if>
	<c:if test="${state==0}">
		<div
			style="text-align: center; background-color: #2BD56F; font-size: 18px">统计查询</div>
		<a href="${pageContext.request.contextPath}/404.jsp"
			class="list-group-item">过程指标报表查询</a>
		<a href="${pageContext.request.contextPath}/processReport.jsp"
			class="list-group-item">过程指标标准查询</a>
	</c:if>
</body>
</body>
</html>