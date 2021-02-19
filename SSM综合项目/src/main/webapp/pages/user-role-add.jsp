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
                用户管理 <small>添加角色表单</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="${pageContext.request.contextPath}/index.jsp"><i
                        class="fa fa-dashboard"></i> 首页</a></li>
                <li><a
                        href="${pageContext.request.contextPath}/user/findAll.do">用户管理</a></li>
                <li class="active">添加角色表单</li>
            </ol>
        </section>

        <!-- 内容头部 /-->

        <%--    ============================================================================    --%>


        <!-- 正文区域 -->

        <form action="${pageContext.request.contextPath}/user/addRoleToUser"
              method="post">
            <!-- 正文区域 -->
            <section class="content">

                <input type="hidden" name="userId" value="${user.id}">

                <table id="dataList"
                       class="table table-bordered table-striped table-hover dataTable">
                    <thead>
                    <tr>
                        <th class="" style="padding-right: 0px">
                            <input id="selall"
                                   type="checkbox" class="icheckbox_square-blue"></th>
                        <th class="sorting_asc">ID</th>
                        <th class="sorting">角色名称</th>
                        <th class="sorting">角色描述</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${roleList}" var="role">
                        <tr>
                            <td>

                                <input name="ids" type="checkbox" value="${role.id}">

                            </td>
                            <td>${role.id}</td>
                            <td>${role.roleName }</td>
                            <td>${role.roleDesc}</td>

                        </tr>
                    </c:forEach>
                    </tbody>

                </table>
                <!--订单信息/--> <!--工具栏-->
                <div class="box-tools text-center">
                    <button type="submit" class="btn bg-maroon">保存</button>
                    <button type="button" class="btn bg-default"
                            onclick="history.back(-1);">返回
                    </button>
                </div>
                <!--工具栏/--> </section>
            <!-- 正文区域 /-->
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


<script></script>
</body>
</html>
