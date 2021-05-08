<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/28
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>hello</title>
  </head>
  <body>
<%--  <h1>简单参数传递演示</h1>--%>
<%--  <form method="post" action="${pageContext.request.contextPath}/parameter01">--%>
<%--      <input type="text" name="username"/>--%>
<%--      <input value="提交" type="submit" />--%>
<%--  </form>--%>
<%--  <h1>复杂参数传递演示</h1>--%>
<%--  <form method="post" action="${pageContext.request.contextPath}/parameter03" enctype="multipart/form-data">--%>
<%--      id <input type="text" name="user.id"/><br>--%>
<%--      name <input type="text" name="user.name"/><br>--%>
<%--      外号 <input name="user.alias" type="checkbox" checked value="小胖墩"> 小胖墩<br>--%>
<%--           <input name="user.alias" type="checkbox" checked value="腹肌哥"> 腹肌哥<br>--%>
<%--      爱好 <input name="user.hobbies[0]" type="checkbox" checked value="打麻将"> 打麻将<br>--%>
<%--           <input name="user.hobbies[1]" type="checkbox" checked value="斗地主"> 斗地主<br>--%>
<%--      亲属 <input name="user.relatives['father']" type="checkbox" checked value="爸爸"> 爸爸<br>--%>
<%--           <input name="user.relatives['mother']" type="checkbox" checked value="妈妈"> 妈妈<br>--%>
<%--      角色 <input name="user.role.id" value="1"> 编号<br>--%>
<%--           <input name="user.role.name" value="管理员"> 名字<br>--%>
<%--      朋友 <input name="user.friends[0].name" value="张三"> 张三<br>--%>
<%--           <input name="user.friends[1].name" value="李四"> 李四<br>--%>
<%--      role对象属性赋值:<input name="role.id" value="2"> role对象编号--%>
<%--              <input name="role.name" value="架构师"> role对象名字--%>
<%--      <input value="提交" type="submit" />--%>
<%--  </form>--%>


<h1>查询操作演示</h1>
<form method="get" action="${pageContext.request.contextPath}/restful/user/1">
    <input value="提交" type="submit" />
</form>

<h1>新增操作演示</h1>
<form method="post" action="${pageContext.request.contextPath}/restful/user">
    <input type="text" name="id">
    <input type="text" name="name"/>
    <input value="提交" type="submit" />
</form>

<h1>修改操作演示</h1>
<form method="post" action="${pageContext.request.contextPath}/restful/user/2">
    <input type="hidden" name="_method" value="put">
    <input type="text" name="id">
    <input type="text" name="username"/>
    <input value="提交" type="submit" />
</form>

<h1>删除操作演示</h1>
<form method="post" action="${pageContext.request.contextPath}/restful/user/3">
    <input type="hidden" name="_method" value="delete">
    <input value="提交" type="submit" />
</form>

  <p>session域${sessionScope.psw}</p>
  <p>request域${requestScope.psw}</p>
  </body>
</html>
