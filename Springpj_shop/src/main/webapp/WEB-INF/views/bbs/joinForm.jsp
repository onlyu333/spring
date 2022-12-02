<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../top.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/resources/css/shopping.css" rel="stylesheet"/>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<body>
 <div id="main">
    <section>
      <form action="joinAction" method="post">
        <div id="join">
          <table border="1">
            <tr>
              <th colspan="2">회원가입</th>
            </tr>
             <tr>
              <th>
                <labal for="username">이름</labal>
              </th>
              <td><input id="username" type="text" name="mname" placeholder="이름을 입력해 주세요."></td>
            </tr>
            <tr>
              <th>
                <labal for="userid">아이디</labal>
              </th>
              <td><input class="userid" type="text" name="mid" placeholder="아이디를 입력해 주세요.">
                <input type="button"  value="ID사용검사"><br>
                <span class="idError1" style="display:none; color: green;">사용가능한 아이디 입니다.</span>
                <span class="idError2" style="display:none; color: red;">아이디가 이미 존재합니다.</span>
                <span></span>
              </td>
            </tr>
            <tr>
              <th>
                <labal for="userpass">비밀번호</labal>
              </th>
              <td><input id="userpass" type="text" name="mpw" onchange="numberCheck()"
                  placeholder="비밀번호를 입력해 주세요"><br>
                <span id="numberError"></span>
              </td>
            </tr>
             <th>
                <labal for="userpass1">비밀번호 확인</labal>
              </th>
              <td><input id="userpass1" type="text"  onchange="numberCheck()"
                  placeholder="비밀번호 확인해주세요"><br>
                <span id="numberError"></span>
              </td>
            </tr>
            <tr>
              <th>
                <labal for="useremail">Email</labal>
              </th>
              <td><input id="useremail" type="text" name="email"></td>
            </tr>
            <tr>
              <th>
                <labal for="useraddr">주소</labal>
              </th>
              <td><input id="useraddr" type="text" name="maddr"></td>
            </tr>
           
              <td colspan="2" style="text-align: center;">
               <input id="saveB2" type="submit" value="가입하기"></a>
              </td>
            </tr>

          </table>
        </div>
      </form>
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
  <script>

  var idCheck =false;
  var idckCheck =false;
  var pwCheck =false;
  var pwckCheck =false;
  var pwckcorCheck =false;
  var nameCheck =false;
  var mailCheck =false;
  var addrCheck =false;
  
  /*   $(document).ready(function(){
	//회원가입 버튼(회원가입 기능 작동)
	$(".join_button").click(function(){
	$("#joinAction").attr("action", "//join"); 
	$("#joinForm").submit(); 
	var mid=$('.userid').val();
	});
});   */
//아이디 중복검사
$('.userid').on("propertychange change keyup paste input", function(){

	console.log("keyup 테스트");	
	var mid = $('.userid').val();			// .id_input에 입력되는 값
	var data = {mid : mid}				// '컨트롤에 넘길 데이터 이름' : '데이터(.id_input에 입력되는 값)'
	
	$.ajax({
		type : "post",
		url : "/shop/memberIdChk",
		data : data,
		success : function(result){
			 console.log("성공 여부" + result);
			 if(result != 'fail'){
					$('.idError1').css("display","inline-block");
					$('.idError2').css("display", "none");				
				} else {
					$('.idError2').css("display","inline-block");
					$('.idError1').css("display", "none");				
				}
			
		}// success 종료
	}); // ajax 종료	

});// function 종료

</script>
</body>

</html>