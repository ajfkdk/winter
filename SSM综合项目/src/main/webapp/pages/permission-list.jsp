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
                权限管理 <small>全部权限</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="${pageContext.request.contextPath}/index.jsp"><i
                        class="fa fa-dashboard"></i> 首页</a></li>
                <li><a
                        href="${pageContext.request.contextPath}/role/findAll.do">资源权限管理</a></li>

                <li class="active">全部权限</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <%--    ============================================================================    --%>


        <!-- 正文区域 -->

        <section class="content"> <!-- .box-body -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">列表</h3>
                </div>

                <div class="box-body">

                    <!-- 数据表格 -->
                    <div class="table-box">

                        <!--工具栏-->
                        <div class="pull-left">
                            <div class="form-group form-inline">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-default" title="新建"
                                            onclick="location.href='${pageContext.request.contextPath}/pages/permission-add.jsp'">
                                        <i class="fa fa-file-o"></i> 新建
                                    </button>

                                    <button type="button" class="btn btn-default" title="刷新">
                                        <i class="fa fa-refresh"></i> 刷新
                                    </button>
                                </div>
                            </div>
                        </div>
                        <%--                    <div class="box-tools pull-right">--%>
                        <%--                        <div class="has-feedback">--%>
                        <%--                            <input type="text" class="form-control input-sm"--%>
                        <%--                                   placeholder="搜索"> <span--%>
                        <%--                                class="glyphicon glyphicon-search form-control-feedback"></span>--%>
                        <%--                        </div>--%>
                        <%--                    </div>--%>
                        <!--工具栏/-->

                        <!--数据列表-->
                        <table id="dataList"
                               class="table table-bordered table-striped table-hover dataTable">
                            <thead>
                            <tr>
                                <th class="" style="padding-right: 0px"><input
                                        id="selall" type="checkbox" class="icheckbox_square-blue">
                                </th>
                                <th class="sorting_asc">ID</th>
                                <th class="sorting_desc">权限名称</th>
                                <th class="sorting_asc sorting_asc_disabled">权限描述</th>
                                <%--                            <th class="text-center">操作</th>--%>
                            </tr>
                            </thead>
                            <tbody>

                            <c:forEach items="${permissionList}" var="p">
                                <tr>
                                    <td><input name="ids" class="icheckbox_square-blue" type="checkbox"></td>
                                    <td>${p.id }</td>
                                    <td>${p.permissionName }</td>
                                    <td>${p.url }</td>
                                        <%--                                <td class="text-center">--%>
                                        <%--                                    <a href="${pageContext.request.contextPath}/p/findById.do?id=${p.id}" class="btn bg-olive btn-xs">详情</a>--%>
                                        <%--                                    <a href="${pageContext.request.contextPath}/user/findUserByIdAndAllRole.do?id=${p.id}" class="btn bg-olive btn-xs">添加角色</a>--%>
                                        <%--                                </td>--%>
                                </tr>
                            </c:forEach>
                            </tbody>
                            <!--
                        <tfoot>
                        <tr>
                        <th>Rendering engine</th>
                        <th>Browser</th>
                        <th>Platform(s)</th>
                        <th>Engine version</th>
                        <th>CSS grade</th>
                        </tr>
                        </tfoot>-->
                        </table>
                        <!--数据列表/-->

                    </div>
                    <!-- 数据表格 /-->

                </div>
                <!-- /.box-body -->

                <!-- .box-footer-->
                <%--            <div class="box-footer">--%>
                <%--                <div class="pull-left">--%>
                <%--                    <div class="form-group form-inline">--%>
                <%--                        总共2 页，共14 条数据。 每页 <select class="form-control">--%>
                <%--                        <option>1</option>--%>
                <%--                        <option>2</option>--%>
                <%--                        <option>3</option>--%>
                <%--                        <option>4</option>--%>
                <%--                        <option>5</option>--%>
                <%--                    </select> 条--%>
                <%--                    </div>--%>
                <%--                </div>--%>

                <%--                <div class="box-tools pull-right">--%>
                <%--                    <ul class="pagination">--%>
                <%--                        <li><a href="#" aria-label="Previous">首页</a></li>--%>
                <%--                        <li><a href="#">上一页</a></li>--%>
                <%--                        <li><a href="#">1</a></li>--%>
                <%--                        <li><a href="#">2</a></li>--%>
                <%--                        <li><a href="#">3</a></li>--%>
                <%--                        <li><a href="#">4</a></li>--%>
                <%--                        <li><a href="#">5</a></li>--%>
                <%--                        <li><a href="#">下一页</a></li>--%>
                <%--                        <li><a href="#" aria-label="Next">尾页</a></li>--%>
                <%--                    </ul>--%>
                <%--                </div>--%>

                <%--            </div>--%>
                <!-- /.box-footer-->

            </div>

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
    $(document).ready(function () {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
    });


    $(document).ready(function () {


        // // 列表按钮
        // $("#dataList td input[type='checkbox']").iCheck({
        //     checkboxClass: 'icheckbox_square-blue',
        //     increaseArea: '20%'
        // });
        // 全选操作
        $("#selall").click(function () {
            var clicks = $(this).is(':checked');
            if (!clicks) {
                $("#dataList td input[type='checkbox']").iCheck("uncheck");
            } else {
                $("#dataList td input[type='checkbox']").iCheck("check");
            }
            $(this).data("clicks", !clicks);
        });
    });

</script>
</body>
</html>
