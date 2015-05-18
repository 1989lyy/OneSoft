<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="comm/inc.jsp" />
<script type="text/javascript">
	$(function() {
		if (top.location != self.location){  
			top.location=self.location;  
		}
		$('#loginDialog').dialog({
			modal : true,
			closable : false,
			draggable:false,
			iconCls : 'icon01_lock',
			buttons : [ {
				text : '注册',
				handler : function() {
				}
			}, {
				id : 'loginBtn',
				text : '登录',
				handler : function() {
					loginFun();
				}
			} ],
			onOpen : function() {
				$('form :input:first').focus();
				$('form :input').keyup(function(event) {
					if (event.keyCode == 13) {
						loginFun();
					}
				});
			}
		});
	});
	function loginFun(){
		var account = $('#account').val();
		var pwd = $("#pwd").val();
		if($.trim(account)===""){
			$("#wmsg").html("用户名不能为空！");
			return;
		}
		if($.trim(pwd)===""){
			$("#wmsg").html("密码不能为空");
			return;
		}
		var url ="/${webRoot}/user/login.do";
		$.post(url,{account:account,pwd:pwd},function(r) {  
			if(r.flag){
				window.location.href="/${webRoot}/user/to_main_nosec.do";
			}else{
				$("#wmsg").html(r.msg);
				return;
			}
		},"json"); 
	}
</script>
</head>
<body>
	<div id="loginDialog" title="系统登录" style="width: 320px; height: 180px;">
		<div style="overflow: hidden; padding: 10px;">
			<form method="post" class="form" id="loginForm">
				<table class="login_table" style="width: 100%; height: 100%;">
					<tr>
						<th width="50">登录名</th>
						<td><input name="account" type="text"  id="account" class="easyui-validatebox" data-options="required:true,iconCls:'icon01_user'" style="width: 210px;" />
						</td>
					</tr>
					<tr>
						<th>密码</th>
						<td><input name="pwd" type="password" id="pwd" class="easyui-validatebox" data-options="required:true,type:'password'" style="width: 210px;" />
						</td>
					</tr>
					<tr>
						<th>验证码</th>
						<td><input name="validatecode" style="width: 80px;" />
						</td>
					</tr>
					<tr>
						<td colspan="2" style="text-align:center">
							<span id="wmsg" style="color:red"></span>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>