<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//基本路径
	String path = request.getContextPath();
%>
<meta charset="utf-8">
<meta http-equiv="Cache-Control" content="no-store"/>
<!-- HTTP 1.0 -->
<meta http-equiv="Pragma" content="no-cache"/>
<meta http-equiv="Expires" content="0"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- 引入jquery --%>
<script src="<%=path %>/jscss/jquery-easyui-1.4.2/jquery.min.js"></script>
<%-- 引入my97日期时间控件 --%>
<script type="text/javascript" src="<%=path%>/jscss/My97DatePicker/WdatePicker.js" charset="utf-8"></script>
<!--引入ztree  -->
<script type="text/javascript"	src="<%=path%>/jscss/zTree_v3/js/jquery.ztree.all-3.5.min.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=path%>/jscss/zTree_v3/css/zTreeStyle/zTreeStyle.css" type="text/css">
<!-- 引入artdialog -->
<script type="text/javascript" src="<%=path%>/jscss/artDialog4.1.7/jquery.artDialog.js?skin=simple"></script>
<script type="text/javascript" src="<%=path%>/jscss/artDialog4.1.7/plugins/iframeTools.js"></script>
<%-- 引入EasyUI --%>
<link rel="stylesheet" id="easyuiTheme" href="<%=path%>/jscss/jquery-easyui-1.4.2/themes/default/easyui.css" type="text/css">
<link rel="stylesheet"	href="<%=path%>/jscss/jquery-easyui-1.4.2/themes/icon.css" type="text/css">
<script type="text/javascript"	src="<%=path%>/jscss/jquery-easyui-1.4.2/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript"	src="<%=path%>/jscss/jquery-easyui-1.4.2/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>
<%-- 引入扩展图标 --%>
<link rel="stylesheet" href="<%=path%>/jscss/extIcon/extIcon1.css" type="text/css">
<%-- 引入扩展图标 --%>
<link rel="stylesheet" href="<%=path%>/jscss/extIcon/extIcon2.css" type="text/css">
<%-- 引入扩展样式 --%>
<link rel="stylesheet" href="<%=path%>/jscss/extIcon/extCss.css" type="text/css">