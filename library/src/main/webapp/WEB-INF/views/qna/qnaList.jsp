<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.0.min.js"></script>
</head>
<body>
	<div align="center">
		<div>
			<h1>QnA 목록</h1>
		</div>
		<div>
			<form id="frm" action="" method="post">
				<select id="key" name="key">
					<option value="1">전체</option>
					<option value="2">작성자</option>
					<option value="3">QnA 제목</option>
					<option value="4">QnA 내용</option>
				</select>&nbsp; <input type="text" id="val" name="val">&nbsp; <input
					type="button" value="검색" onclick="search2()">
			</form>
		</div>
		<br />
		<div>
			<table border="1" id="ta">
				<thead>
					<tr>
						<th width="100">게시글 번호</th>
						<th width="100">작성자</th>
						<th width="150">문의 제목</th>
						<th width="200">문의 내용</th>
						<th width="100">문의 날짜</th>
					</tr>
				</thead>
				<tbody id="tb">
					<c:forEach items="${list }" var="qna">
						<tr>
							<td align="center">${qna.boardNumber }</td>
							<td align="center">${qna.id }</td>
							<td align="center">${qna.title }</td>
							<td>${qna.content }</td>
							<td align="center">${qna.wdate }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<br />
		<div>
			<button type="button" onclick="location.href='qnaInputForm.do'">문의글
				작성하기</button>
		</div>
	</div>
	<script type="text/javascript">
		function search2() {
			$.ajax({
				url : "ajaxSearchList.do",
				type : "POST",
				data : {
					"key" : $("#key").val(),
					"val" : $("#val").val()
				},
				dataType : "json",
				success : function(data) {
					htmlConvert(data);
				},
				error : function() {
					//실패시 구현
				}
			});
		}

		function htmlConvert(data) {
			$("tbody").remove();
			let tb = $("<tbody/>");
			$.each(data, function(index, item) {
				let tr = $("<tr />").append($("<td />").text(item.boardNumber),
						$("<td />").text(item.id),
						$("<td />").text(item.title),
						$("<td />").text(item.content),
						$("<td />").text(item.wdate),
						$("<td />").text(item.fileName));
				tb.append(tr);
			});
			$("#ta").append(tb);
		}
</script>
</body>
</html>