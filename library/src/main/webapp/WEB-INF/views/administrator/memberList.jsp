<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container-fluid">
		<h1 class="h3 mb-2 text-gray-800">회원 목록보기</h1>
		<p class="mb-4">
			관리자만 볼 수 있는 회원정보 및 목록보기 게시판입니다.
		</p>
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">회원 목록</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"
						cellspacing="0">
						<thead>
							<tr>
								<th>아이디</th>
								<th>비밀번호</th>
								<th>이름</th>
								<th>전화번호</th>
								<th>주소</th>
								<th>대여한 책</th>
								<th>책 대여기간</th>
								<th>블랙리스트</th>
							</tr>
						</thead>
						<tbody>
								<tr>
									<td>${id }</td>
									<td>${password }</td>
									<td>${name }</td>
									<td>${tel }</td>
									<td>${address }</td>
									<td>${booktitle }</td>
									<td>${rentalcount }</td>
									<td>${sdfsdf }</td>
								</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

</body>
</html>