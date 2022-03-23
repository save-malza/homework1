var userid = document.querySelector("#userid");
   
function checkid(){
       
        if(userid.value==""){
            alert("아이디를 입력해주세요");
            userid.select();
        }
    };
    
	$.ajax({ // 컨트롤러와 통신
		type: "POST",
		url: "/login.do",
		data: {"id": userid, 'pw': pw},
		
		});

