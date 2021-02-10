<%--
  Created by IntelliJ IDEA.
  User: 86151
  Date: 2021/2/4
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
            基础数据 <small>订单管理</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="../index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li><a href="../product/findAll.do">基础数据</a></li>
            <li class="active">订单管理</li>
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

                        </div>
                    </div>
                    <div class="pull-left">
                        <div class="form-group form-inline">
                            <div class="btn-group">
                                <button type="button" class="btn btn-default" title="新建"><i class="fa fa-file-o"></i> 新建</button>
                                <button type="button" class="btn btn-default" title="删除"><i class="fa fa-trash-o"></i> 删除</button>
                                <button type="button" class="btn btn-default" title="开启"><i class="fa fa-check"></i> 开启</button>
                                <button type="button" class="btn btn-default" title="屏蔽"><i class="fa fa-ban"></i> 屏蔽</button>
                                <button type="button" class="btn btn-default" title="刷新"><i class="fa fa-refresh"></i> 刷新</button>
                            </div>

                        </div>
                    </div>
                    <div class="box-tools pull-right">
                        <div class="has-feedback">
                            <input type="text" class="form-control input-sm" placeholder="搜索">
                            <span class="glyphicon glyphicon-search form-control-feedback"></span>
                        </div>
                    </div>
                    <!--工具栏/-->
                    <!--数据列表-->
                    <table id="dataList" class="table table-bordered table-striped table-hover dataT
able">
                        <thead>
                        <tr>
                            <th class="" style="padding-right: 0px"><input id="selall" type="checkbox" class="icheckbox_square-blue"></th>
                            <th class="sorting_asc">ID</th>
                            <th class="sorting">订单编号</th>
                            <th class="sorting">订单名称</th>
                            <th class="sorting">金额</th>
                            <th class="sorting">下单时间</th>
                            <th class="sorting">订单状态</th>
                            <th class="text-center">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="order" items="${pageInfo.list}">
                        <tr>
                            <td><input name="ids" class="icheckbox_square-blue" type="checkbox"></td>
                            <td>${order.id}</td>
                            <td>${order.orderNum}</td>
                            <td>${order.product.productName}</td>
                            <td>${order.product.productPrice}</td>
                            <td>${order.orderTimeStr}</td>
                            <td>${order.payTypeStr}</td>
                            <td class="text-center">
                                <button type="button" class="btn bg-olive btn-xs" >订单</button>
                                <button type="button" class="btn bg-olive btn-xs" >详情</button>
                                <button type="button" class="btn bg-olive btn-xs" >编辑</button>
                            </td>
                        </tr>
                        </c:forEach>

                        </tbody>
                    </table>
                    <!--数据列表/-->

                </div>
                <!-- 数据表格 /-->
            </div>
            <!-- /.box-body -->
            <!-- .box-footer-->
            <div class="box-footer">
                <div class="pull-left">
                    <div class="form-group form-inline">
                        总共${pageInfo.pages} 页，共${pageInfo.total} 条数据。 每页 <select id="changPage"  onchange="changePageSize()" class="form-control">
                        <option>2</option>
                        <option>5</option>
                        <option>10</option>
                    </select> 条
                    </div>
                </div>
                <div class="box-tools pull-right">
                    <ul class="pagination">
                        <li><a href="${pageContext.request.contextPath}/order/findAll?page=1&size=${pageInfo.pageSize}" aria-label="Previous">首页</a></li>
                        <li><a href="${pageContext.request.contextPath}/order/findAll?page=${pageInfo.prePage}&size=${pageInfo.pageSize}">上一页</a></li>
                        <c:forEach begin="1" end="${pageInfo.pages}" var="count">
                        <li><a href="${pageContext.request.contextPath}/order/findAll?page=${count}&size=${pageInfo.pageSize}">${count}</a></li>
                        </c:forEach>
                        <li><a href="${pageContext.request.contextPath}/order/findAll?page=${pageInfo.nextPage}&size=${pageInfo.pageSize}">下一页</a></li>
                        <li><a href="${pageContext.request.contextPath}/order/findAll?page=${pageInfo.pages}&size=${pageInfo.pageSize}" aria-label="Next">尾页</a></li>
                    </ul>
                </div>
            </div>
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
        <strong>Copyright &copy; 2020-2021 <a href="http://www.4399.com">研究院研发部</a>.</strong> All rights reserved.
    </footer>
    <!-- 底部导航 /-->

</div>
<%--底部的Script--%>
<jsp:include page="footerScript.jsp"></jsp:include>


<script>
<%--    选择页面大小的操作--%>

function changePageSize() {
//    获取下拉框的值
    var pagesize =$("#changPage").val();

//    向服务器发送请求
    location.href="${pageContext.request.contextPath}/order/findAll?page=${pageInfo.nextPage}&size="+pagesize;

}
<%--    全选操作--%>
    $("#selall").click(function() {
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
