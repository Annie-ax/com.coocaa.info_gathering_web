<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: keaxiang
  Date: 2015/12/29
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Log info page</title>
    <%--<meta http-equiv="refresh" content="1">--%>

    <link href="/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="/css/find.css" rel="stylesheet" type="text/css" />

    <script src="/js/jQuery-2.1.4.min.js"></script>
    <script src="/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="/js/app.min.js" type="text/javascript"></script>

</head>
<body >
<div class="content">
    <table class="table table-bordered table-hover table-responsive" id = "dataTable">
        <thead>
        <tr>
            <th>时间</th>
            <th>来源</th>
            <th>PID</th>
            <th>等级</th>
            <th>内容</th>
        </tr>
        </thead>
    <c:forEach items="${logList }" var="log">
        <tbody>
        <tr>
            <td>${log.happentime }</td>
            <td>${log.queue }</td>
            <td>${log.pid }</td>
            <td>${log.level }</td>
            <td>${log.msg }</td>
        </tr>
        </tbody>
    </c:forEach>
    </table>

    <div class="pageDiv">
    <ul class="pagination" style="align-content: center">
        <li><a href="#">&laquo;</a></li>
        <c:forEach items="${pageList }" var="currentPage">
        <li><a href="/pagequery?currentPage=${currentPage }&pageSum=${pageSum }">${currentPage }</a></li>
        </c:forEach>
        <li><a href="#">&raquo;</a></li>
        <li><span>您当前在第${page }页</span></li>
    </ul>
    </div>
</div>
</body>
</html>
