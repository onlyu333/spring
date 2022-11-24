<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="wrap" align="center">
      <h1>게시글 상세보기</h1>
      <table>
         <tr>
            <th>작성자</th>
            <td>${svo.name }</td>
            <th>아이디</th>
            <td></td>
         </tr>
         <tr>
            <th>작성일</th>
            <td></td>
            <th>글번호</th>
            <td></td>
         </tr>
         <tr>
            <th>제목</th>
            <td colspan="3">${svo.title}</td>
         </tr>
         <tr>
            <th>내용</th>
            <td colspan="3">${svo.content}</td>
         </tr>
      </table>
      <br> <br> <input type="button" value="게시글 수정"
         >
      <input type="button" value="게시글 삭제"
         >
      <input type="button" value="게시글 리스트"
         > 
      <input type="button" value="게시글 등록"
         >
   </div>
</body>
</html>