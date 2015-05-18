<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="comm/inc.jsp" />
</head>
<body>
<div id="tt" class="easyui-tabs" data-options="fit:true,border:true">
	<div title="第一页图标" style="padding:0 10px;"
		data-options="fit:true,href:'/${webRoot}/icon01.jsp'"></div>
	<div title="第二页图标" style="padding:0 10px;"
		data-options="fit:true,href:'/${webRoot}/icon02.jsp'"></div>
</div>
</body>