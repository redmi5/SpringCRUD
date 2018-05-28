<%--
  Created by IntelliJ IDEA.
  User: Roksana
  Date: 29.05.2018
  Time: 4:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Books Pages</title>
    <style type="text/css">
        .tg{
            border-collapse: collapse;
            border-spacing:0;
            border-color: #ccc;
        }
        .tg td{
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow:hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;

        }
        .tg th{
            font-family: Arial, sans-serif;
            font-size:14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width:1px;
            overflow: hidden;
            word-break: normal;
            border-color:#ccc;
            color:#333;
            background-color: #f0f0f0;
        }
        .tg .tg-4oph{
            background-color: #f9f9f9;
        }
    </style>
</head>
<body>
<a href="../../index.jsp" Back to main menu></a>
<br/>
<br/>
<h1>Book list</h1>
<c:if test="${!emty listBooks}">
    <table class="tg">
        <tr>
            <th with="80">ID</th>
            <th with="120">Title</th>
            <th width="120">Author</th>
            <th width="120">Price</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>

        </tr>
        <c:forEach items="${listbooks}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.bookTitle}</td>
                <td>${book.bookAuthor}</td>
                <td>${book.price}</td>
                <td><a href="<c:url value='/edit/${book.id}'/>">">Edit</a> </td>
                <td><a href="<c:url value='/remove/${book.id}'/>">">Delete</a> </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
