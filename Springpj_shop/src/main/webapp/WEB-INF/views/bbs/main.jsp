<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../top.jsp"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet"/> 
</head>
<body>
  <div id="main">
   
    <section>
      <div id="S_ltable">
        <table>
          <tr>
            <td>
             <!--  <img src="./category.jpg"> -->
            </td>
          </tr>
          <tr>
            <td><li><a href="#">국내도서</a></li></td>
          </tr>
          <tr>
            <td><li><a href="#">외국도서</a></li></td>
          </tr>
          <tr>
            <td><li><a href="#">ebook</a></li></td>
          </tr>
          <tr>
            <td><li><a href="#">웹소설/코믹</a></li></td>
          </tr>
          <tr>
            <td><li><a href="#">CD/LP</a></li></td>
          </tr>
          <tr>
            <td><li><a href="#">문구</a></li></td>
          </tr>
          <tr>
            <td><li><a href="#">티켓</a></li></td>
          </tr>
          <tr>
            <td><li><a href="#">중고샵</a></li></td>
          </tr>
        </table>
      </div>
      <div id="center">
        <div id="today1">
          <p>
            <오늘의 추천책>
          </p>
        </div>
        <div id="today">
          <li><a href="#"><!-- <img src="pick3.jpg"> --></a></li><br>
          <li><a id="pick" href="#">더우면 벗으면되지<br>
              요시다케 신스케| 주니어 김영사</a></li>
        </div>
        <div id="today2">
          <li><a href="#"><!-- <img src="pick2.jpg"> --></a></li><br>
          <li><a id="pick" href="#">DO it!웹표준의 정석<br>
              고경희| 이지스퍼블리싱</a></li>
        </div>
        <div id="today3">
          <li><a href="#">
              <h1>독서습관 만들기</h1>
            </a></li><br>
          <!-- <li><a id="pick" href="#"><br> -->
        </div>
      </div>
      <div id="loginBox">
        <table>
          <tr>
            <td>아이디</td>
            <td><input type="text" name="id" size="10"></td>
          </tr>
          <tr>
            <td>비밀번호</td>
            <td><input type="text" name="pass" size="10"></td>
          </tr>
          <tr>
            <td id="Lbutton" colspan="2" style="text-align: center;">
              <form action="loginChk" method="post">
              <input id="loginButton" type="submit" value="로그인">
              <a href="joinForm"><input id="joinButton" type="button" value="회원가입"></a>
            </form>
            </td>
          </tr>
        </table>
      </div>
      <div id="best">
        <table>
          <tr>
            <td>베스트셀러</td>
          </tr>
          <tr>
            <td>
              <li><a href="#">1위 트렌드코리아2023</a>
            </td>
          </tr>
          <tr>
            <td>
              <li><a href="#">2위 아버지의 해방일기</a>
            </td>
          </tr>
          <tr>
            <td>
              <li><a href="#">3위 이은경쌤의 초등어휘력</a>
            </td>
          </tr>
          <tr>
            <td>
              <li><a href="#">4위 불편한 편의점2</a>
            </td>
          </tr>
          <tr>
            <td>
              <li><a href="#">5위 랑랑 형제 떡집</a>
            </td>
          </tr>
        </table>
      </div>
    </section>
    <footer>
      <div id="joo">
        <p>
          예스이십오(주)<br>
          경기도 수원시 팔달구 중부대로 100 3층<br>
          고객문의<br>
          1544-0000<br>
        </p>
      </div>
    </footer>
  </div>
</body>

</html>