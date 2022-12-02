<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
     <%@ include file="../top.jsp"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/resources/css/shopping.css" rel="stylesheet"/> 
</head>
<script>
   //비동기로
   //서버에게 요청 작성자를 파라미터로 보낼 테니 중복여부 확인해줘
   // 응답을 받아서
   // 등록된 사용자라면 vlaue=1로 바꾸는 코드를 짠다. 

</script>
<body>
   <div id="wrap" align="center">
      <h1>게시글 등록</h1>
      <form name="frm" method="post" action="wrAction" encType="multipart/form-data">
                                                          <!-- encType을 적어줘야만 첨부파일이 서버로 전송된다. -->
         <table>
            <tr>
               <th>작성자</th>
               <td>${vno.name}
               
               </td>
            </tr>
            <tr>
               <th>제목</th>
               <td>${vno.title}</td>
            </tr>
            <tr>
               <th>조회수</th>
               <td>${vno.cnt}</td>
            </tr>
            <tr>
               <th>게시일</th>
               <td>${vno.indate}</td>
            </tr>
            <tr>
               <th>내용</th>
               <td>${vno.content}</td>
            </tr>
               <th>첨부파일</th>
               <td>
               <c:forEach items="${attachList}" var="fname">
               <a href ="download?filename=${fname}">${fname}</a><br>
               </c:forEach></td>
            </tr>
         </table>
         <br>
         <br> <input type="button" value="이전" onclick="history.go(-1)">
         <input type="button" value="목록" onclick="location.href='bbsList'">
      </form>
   </div>
   <script type="text/javascript">

   
   </script>
</body>
</html>