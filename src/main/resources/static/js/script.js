function login(){
	if(form1.username.value==''){
		alert('用户名不能为空！');
		return false;
	}
	if(form1.password.value==''){
		alert('密码不能为空！');
		return false;
	}
	form1.action="imgvrifyControllerDefaultKaptcha";
	form1.submit();
}
function register(){
	var pwd1=document.getElementById("password")
    var pwd2=document.getElementById("password2")
	console.log(pwd1)
    console.log(pwd2)
    if(pwd1.value!=pwd2.value){
        alert('两次密码输入不一致');
        return false;
    }
    form1.action="registerin";
    form1.submit();
}
window.onload = function(){
	var i3 = document.getElementsByClassName('input_3');
	for(var i=0;i<i3.length;i++){
		i3[i].onmouseover = function(){
			this.style.backgroundColor = "#23271F";
			this.style.color = "#fff";
		}
		i3[i].onmouseout = function(){
			this.style.backgroundColor = "#fff";
			this.style.color = "#23271F";
		}
	}
	var pass = document.getElementById("password");
	pass.onfocus = function(){
		pass.type = "password";	
	}
}