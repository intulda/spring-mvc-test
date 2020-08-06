<%--
  Created by IntelliJ IDEA.
  User: kimbogeun
  Date: 2020/07/28
  Time: 9:41 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
    <button id="pageMoveBtn">페이지 23423432 하기두더지</button>
<script>
    (()=> {
        const pageMoveBtnElem = document.querySelector('#pageMoveBtn');
        pageMoveBtnElem.addEventListener('click', function(event){
           location.href = 'board/list';
        });
    })();
</script>
</body>
</html>
