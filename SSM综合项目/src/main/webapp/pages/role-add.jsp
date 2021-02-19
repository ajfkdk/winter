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
                角色管理 <small>角色表单</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="${pageContext.request.contextPath}/index.jsp"><i
                        class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="${pageContext.request.contextPath}/role/findAll.do">角色管理</a></li>
                <li class="active">角色表单</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <%--    ============================================================================    --%>


        <!-- 正文区域 -->

        <section class="content"> <!--产品信息-->
            <form action="${pageContext.request.contextPath}/role/add" method="post">
                <div class="panel panel-default">
                    <div class="panel-heading">角色信息</div>
                    <div class="row data-type">
                        <div class="col-md-2 title">角色名称</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="roleName"
                                   placeholder="角色名称" value="">
                        </div>
                        <div class="col-md-2 title">角色描述</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="roleDesc"
                                   placeholder="角色描述" value="">
                        </div>


                    </div>
                </div>
                <!--订单信息/--> <!--工具栏-->
                <div class="box-tools text-center">
                    <button type="submit" class="btn bg-maroon">保存</button>
                    <button type="button" class="btn bg-default"
                            onclick="history.back(-1);">返回
                    </button>
                </div>
            </form>
            <!--工具栏/-->
        </section>
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
