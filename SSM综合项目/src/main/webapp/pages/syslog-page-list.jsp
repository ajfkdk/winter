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
                日志管理 <small>全部日志</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="${pageContext.request.contextPath}/pages/main.jsp"><i
                        class="fa fa-dashboard"></i> 首页</a></li>
                <li><a
                        href="${pageContext.request.contextPath}/log/findAll">日志管理</a></li>

                <li class="active">全部日志</li>
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
                                    <button type="button" class="btn btn-default" title="刷新"
                                            onclick="window.location.reload();">
                                        <i class="fa fa-refresh"></i> 刷新
                                    </button>
                                </div>
                            </div>
                        </div>

                        <!--工具栏/-->

                        <!--数据列表-->
                        <table id="dataList"
                               class="table table-bordered table-striped table-hover dataTable">
                            <thead>
                            <tr>
                                <th class="" style="padding-right: 0px"><input id="selall"
                                                                               type="checkbox"
                                                                               class="icheckbox_square-blue"></th>
                                <th class="sorting_asc">ID</th>
                                <th class="sorting">访问时间</th>
                                <th class="sorting">访问用户</th>
                                <th class="sorting">访问IP</th>
                                <th class="sorting">资源URL</th>
                                <th class="sorting">执行时间</th>
                                <th class="sorting">访问方法</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${pageinfo.list}" var="syslog">
                                <tr>
                                    <td><input name="ids" type="checkbox"></td>
                                    <td>${syslog.id}</td>
                                    <td>${syslog.visitTimeStr }</td>
                                    <td>${syslog.username }</td>
                                    <td>${syslog.ip }</td>
                                    <td>${syslog.url}</td>
                                    <td>${syslog.executionTime}毫秒</td>
                                    <td>${syslog.method}</td>
                                </tr>
                            </c:forEach>
                            </tbody>

                        </table>
                        <!--数据列表/-->

                        <!--工具栏-->
                        <div class="pull-left">
                            <div class="form-group form-inline">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-default" title="刷新"
                                            onclick="window.location.reload();">
                                        <i class="fa fa-refresh"></i> 刷新
                                    </button>
                                </div>
                            </div>
                        </div>

                        <!--工具栏/-->


                    </div>
                    <!-- 数据表格 /-->

                </div>
                <!-- /.box-body -->

                <!-- .box-footer-->
                <div class="box-footer">
                    <div class="pull-left">
                        <div class="form-group form-inline">
                            总共${pageinfo.pages} 页，共${pageinfo.total} 条数据。 每页 <select id="changPage"
                                                                                     onchange="changePageSize()"
                                                                                     class="form-control">
                            <option>5</option>
                            <option>10</option>
                            <option>15</option>
                            <option>20</option>
                        </select> 条
                        </div>
                    </div>
                    <div class="box-tools pull-right">
                        <ul class="pagination">
                            <li>
                                <a href="${pageContext.request.contextPath}/log/findAll?page=1&size=${pageinfo.pageSize}"
                                   aria-label="Previous">首页</a></li>
                            <li>
                                <a href="${pageContext.request.contextPath}/log/findAll?page=${pageinfo.prePage}&size=${pageinfo.pageSize}">上一页</a>
                            </li>
                            <c:forEach begin="1" end="${pageinfo.pages}" var="count">
                                <li>
                                    <a href="${pageContext.request.contextPath}/log/findAll?page=${count}&size=${pageinfo.pageSize}">${count}</a>
                                </li>
                            </c:forEach>
                            <li>
                                <a href="${pageContext.request.contextPath}/log/findAll?page=${pageinfo.nextPage}&size=${pageinfo.pageSize}">下一页</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/log/findAll?page=${pageinfo.pages}&size=${pageinfo.pageSize}"
                                   aria-label="Next">尾页</a></li>
                        </ul>
                    </div>
                </div>


            </div>
            <!-- /.box-footer-->


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
    <%--    选择页面大小的操作--%>

    function changePageSize() {
//    获取下拉框的值
        var pagesize = $("#changPage").val();

//    向服务器发送请求
        location.href = "${pageContext.request.contextPath}/log/findAll?page=${pageInfo.nextPage}&size=" + pagesize;

    }

    <%--    全选操作--%>
    $("#selall").click(function () {
        var clicks = $(this).is(':checked');
        if (!clicks) {
            $("#dataList td input[type='checkbox']").iCheck("uncheck");
        } else {
            $("#dataList td input[type='checkbox']").iCheck("check");
        }
        $(this).data("clicks", !clicks);
    });
</script>
</body>
</html>
