<%@ page import="HienThiDanhSachKhanhHang.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: quan5
  Date: 6/7/2020
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Danh Sách Khách Hàng</title>
  </head>
  <style>
    table {
      margin-left: auto;
      margin-right: auto;
      width: 800px ;
      height: 300px ;

    }
    table,th,td{
      border: 1px solid black;
      border-collapse: collapse;
    }
    th, td {
      padding: 5px;
      font-size: 20px;
      font-weight:bold;
    }

  </style>
  <body>
  <table  >
    <tr>
      <th colspan = 4> <h2>Danh Sách Khách Hàng</h2></th>
    </tr>
    <tr>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach items="${requestScope.customer}" var="cus">
      <tr>
        <td>
            ${cus.name}
        </td>
        <td>
            ${cus.birthday}
        </td>
        <td>
            ${cus.address}
        </td>
        <td style=" text-align:center">

            <img   width= "100px" height="100" src="${cus.urlImage}" alt="not image">
        </td>
      </tr>
    </c:forEach>



  </table>
  </body>
</html>
