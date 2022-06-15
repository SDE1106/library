<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="pwfindscreen" method = "POST">
			<div class = "search-title">
				<h3>등록한 정보로 인증</h3>
			</div>
		<section class = "form-search">
			<div class = "find-id">
				<label>아이디</label>
				<input type="text" name="id" class = "btn-name" placeholder = "등록된 ID">
			<br>
			</div>
		
		 <div class = "find-phone">
				<label>번호</label>
				<input type="text" onKeyup = "addHypen(this);" name="tel" class = "btn-phone" placeholder = "등록한 휴대폰 번호" maxlength="13">
			</div> 
			<br>
	</section>
	<div class ="btnSearch">
		<input type="button" name="enter" value="찾기"  onClick="pw_search()">
		<input type="button" name="cancle" value="취소" onClick="history.back()">
 	</div>
 </form>
 <script type="text/javascript" src="js/findinfo.js"></script>
 <script type="text/javascript" src="js/addHypen.js"></script>
</body>
</html>