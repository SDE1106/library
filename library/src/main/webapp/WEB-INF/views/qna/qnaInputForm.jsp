<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>QnA 등록</h1>
		</div>
		<div>
			<form id="frm" action="qnaInput.do" method="POST">
				<div>
					<table border="1">
						<tr>
							<th>작성자</th>
							<td><input type="text" id="id" name="id"
								required="required"></td>
							<th>작성일자</th>
							<td><input type="date" id="wdate" name="wdate"
								required="required"></td>
						</tr>
						<tr>
							<th>QnA 제목</th>
							<td colspan="3"><input type="text" size="66" id="title"
								name="title" required="required"></td>
						</tr>
						<tr>
							<th>내용</th>
							<td colspan="3"><textarea rows="6" cols="66" id="content"
									name="content"></textarea></td>
						</tr>
					</table>
				</div><br />
				<div>
					<input type="submit" value="문의 저장">&nbsp;&nbsp;
					<input type="reset" value="문의 취소">&nbsp;&nbsp;
					<input type="button" value="QnA목록가기" onclick="location.href='qnaList.do'">
				</div>
			</form>
		</div>
	</div>
</body>
</html>