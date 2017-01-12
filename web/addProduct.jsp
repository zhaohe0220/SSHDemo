<%--
  Created by IntelliJ IDEA.
  User: wade1
  Date: 2017-01-11
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>add product</title>
</head>
<body>
<s:form action="product_save" method="POST" namespace="/" theme="simple">
    <table border="1" width="400">
        <tr>
            <td>商品名称</td>
            <td><s:textfield name="pname"/> </td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td><s:textfield name="price"/> </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="添加"></td>
        </tr>
    </table>
</s:form>
</body>
</html>
