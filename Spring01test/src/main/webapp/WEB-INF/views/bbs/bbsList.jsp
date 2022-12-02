<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../top.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/resources/css/shopping.css">

</head>

<body>

   <hr>
     
<%@ page import="java.util.*"%>
<%@ page import="com.human.vo.*" %>
<%
   ArrayList<springVO> al = (ArrayList)request.getAttribute("bList");
   //out.print(al.size() +" / 가나다라마바사 <br>" );

   //for(int i=0; i < al.size(); i++){
//      BoardVO bvo = al.get(i);
   //   out.print(bvo.getNum());
//      out.print(bvo.getName());
   //   out.print("<hr>");      
//   }
%>
   <div id="wrap" align="center">
      <h1>게시글 리스트</h1>
      <table class="list">
         <tr>
            <td colspan="6" style="border: white; text-align: right"><a
               href="wrForm">게시글 등록</a></td>
         </tr>
         <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
            <th>조회</th>
            <th>수정/삭제</th>
         </tr>
         <!-- 아래 Tr 이 게시글 수 만큼 반복.. -->
         
         <%
         if(al.size()==0){
            out.print("<tr class='record'>");
            out.print("<td colspan=6>등록된 글이 없습니다.</td>");   
            out.print("</tr>");
         }else{
            for(int i=0; i < al.size(); i++){
               springVO svo= al.get(i);
               out.print("<tr class='record'>");
               out.print("<td>"+svo.getNum()+"</td>");   
               out.print("<td><a href='"+request.getContextPath()+"/bbsView?vno="+svo.getNum()+"'>"+svo.getTitle()+"</td>");
               out.print("<td>"+svo.getName()+"</td>");
               out.print("<td>"+svo.getIndate()+"</td>");
               out.print("<td>"+svo.getCnt()+"</td>");
               out.print("<td><a href='bbsMod?vno="+svo.getNum()+"'>M/<a href='bbsDel?vno="+svo.getNum()+"'>D</td>");
               out.print("</tr>");
            }
         }      
         
         %>
           <!--  paging -->
           <tr>
           <td colspan=6>
           <c:if test="${pageVO.prev}">
           <a href="bbsList?page=${pageVO.startPage - 1 }">[이전페이지그룹]</a>
           </c:if>
           <c:forEach begin ="${pageVO.startPage}" end ="${pageVO.endPage}" var="idx">
           <c:if test="${pageVO.page==idx}">*</c:if>
           <a href="bbsList?page=${idx}">${idx}</a>
           </c:forEach>
           <c:if test="${pageVO.next}">
           <a href="bbsList?page=${pageVO.endPage + 1 }">[다음페이지 그룹]</a>
           </c:if>
           
           
           
           
           </td>
           </tr>
         <!-- 아래 Tr 이 게시글 수 만큼 반복.. -->
      </table>
   </div>
</body>
</html>