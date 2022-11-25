<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/resources/css/shopping.css" rel="stylesheet"/> 
</head>
<body>
	<h1>학생 회원 등록</h1>
	<form id="inputform" action="joinAction" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" id="id" name="id"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" id="phone" name="phone"></td>
			</tr>
			<tr>
				<td>등급</td>
				<td><input type="text" id="grade" name="grade"></td>
			</tr>
			<tr>
				<td colspan="2"><center>
						<input type="submit" value="등록" > 
						<input type="button" value="조회">
					</center></td>
			</tr>





		</table>

	</form>
</body>
</html>