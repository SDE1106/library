<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>QnA 목록</h1>
		</div>
		<div>
			<form id="frm" action="" method="POST">
				<select id="key" name="key">
					<option value="1">전체</option>
					<option value="1">작성자</option>
					<option value="1">QnA 제목</option>
					<option value="1">QnA 내용</option>
				</select>&nbsp; <input type="text" id="val" name="val">&nbsp; <input
					type="button" value="검색" onclick="search()">
			</form>
		</div>
		<div>
			<table border="1">
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
							<td>${qna.boardNumber }</td>
							<td>${qna.id }</td>
							<td>${qna.title }</td>
							<td>${qna.content }</td>
							<td>${qna.wdate }</td>
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
	function search(){
		let param = 'key='+frm.key.value+"&val="+frm.val.value;
		let fields = ['boardNumber', 'id', 'title', 'content', 'wdate']
		let allTr = document.querySelectorAll('tbody>tr');
		allTr.forEach(function (tr){
			tr.remove();
		});
		
		let list = document.querySelector('tbody');
		
		fetch('ajaxSearchList.do',{
			method: 'POST',
			headers: {'Content-type':'application/x-www-form-urlencoded'},
			body: param
		})
		.then(response => response.json())
		.then(data=>{
			console.log(data);
			data.forEach(d =>{
				let tr = document.createElement('tr'); 
				fields.forEach(f=>{ 
					let td = document.createElement('td'); 
					td.innerHTML = d[f];	
					tr.appendChild(td);	
				})
				list.appendChild(tr); 
			})
		})
	}
</script>
</body>
</html>