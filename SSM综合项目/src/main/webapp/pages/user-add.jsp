<%--
  Created by IntelliJ IDEA.
  User: 86151
  Date: 2021/2/4
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--页面的资源引用--%>
<jsp:include page="ehead.jsp"></jsp:include>
<div class="wrapper">
    <!-- 页面头部 -->
    <jsp:include page="ahead.jsp"></jsp:include>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <jsp:include page="aside.jsp"></jsp:include>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">

        <%--    ============================================================================    --%>

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                用户管理 <small>用户添加</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="../pages/main.jsp.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="../product/findAll.do">用户管理</a></li>
                <li class="active">用户添加</li>
            </ol>
        </section>

        <!-- 内容头部 /-->

        <%--    ============================================================================    --%>


        <!-- 正文区域 -->
        <form action="${pageContext.request.contextPath}/user/add" method="post">
            <div class="row data-type">

                <div class="col-md-2 title">用户名称</div>
                <div class="col-md-4 data text">
                    <input type="text" class="form-control" placeholder="用户 名称" value="" name="username">
                </div>

                <div class="col-md-2 title">密码</div>
                <div class="col-md-4 data text">
                    <input type="password" placeholder="密码 设置" name="password" class="form-control">
                </div>

                <div class="col-md-2 title">邮箱</div>
                <div class="col-md-4 data text">
                    <input type="email" class="form-control" placeholder="邮箱" value="" name="email">
                </div>

                <div class="col-md-2 title">联系电话</div>
                <div class="col-md-4 data text">
                    <input type="text" class="form-control" placeholder="联系 电话" value="" name="phoneNum">
                </div>


                <div class="col-md-2 title">用户状态</div>

                <div class="col-md-10 data">
                    <select class="form-control" name="statusStr">
                        <option>激活</option>
                        <option>未激活</option>
                    </select>
                </div>


                <div class="col-md-10 data text-center">
                    <button type="submit" class="btn bg-maroon">保存</button>
                    <button type="button" class="btn bg-default">返回</button>
                </div>
            </div>
        </form>
        <!-- 正文区域 /-->


        <%--    ============================================================================    --%>
    </div>
    <!-- 内容区域 /-->

    <!-- 底部导航 -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.8
        </div>
        <strong>Copyright &copy; 2014-2017 <a href="http://www.itcast.cn">研究院研发部</a>.</strong> All rights reserved.
    </footer>
    <!-- 底部导航 /-->

</div>
<%--底部的Script--%>
<jsp:include page="footerScript.jsp"></jsp:include>


<script>

</script>
</body>
</html>
