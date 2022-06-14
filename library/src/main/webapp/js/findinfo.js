function id_search() { 
	 	var frm = document.idfindscreen;
			console.log(frm);
	 	if (frm.name.value.length < 1) {
		  alert("이름을 입력해주세요");
		  return;
		 }

		 if (frm.tel.value.length != 13) {
			  alert("핸드폰번호를 정확하게 입력해주세요");
			  return;
		 }

	 frm.method = "post";
	 frm.action = "findIdResult.do"; //넘어간화면
	 frm.submit();
	 }