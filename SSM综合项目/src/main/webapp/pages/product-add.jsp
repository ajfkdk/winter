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
            <li><a href="../index.jsp"><i
                    class="fa fa-dashboard"></i> 首页</a></li>
            <li><a
                    href="../user/findAll.do">基础数据</a></li>
            <li class="active">订单管理</li>
        </ol>
    </section>


        <!-- 内容头部 /-->

<%--    ============================================================================    --%>


        <!-- 正文区域 -->

<form action="${pageContext.request.contextPath}/product/add" method="post">
    <div class="row data-type">

        <div class="col-md-2 title">订单编号</div>
        <div class="col-md-4 data text">
            <input type="text" class="form-control" placeholder="订单编号" value="" name="productNum">
        </div>

        <div class="col-md-2 title">下单时间</div><%--需要类型转换--%>
        <div class="col-md-4 data text">
            <div class="input-group date">
                <div class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                </div>
                <input type="text" class="form-control pull-right" id="dateTimePicker" name="departureTime">
            </div>
        </div>

        <div class="col-md-2 title">路线名称</div>
        <div class="col-md-4 data text">
            <input type="text" class="form-control" placeholder="路线名称" value="" name="productName">
        </div>

        <div class="col-md-2 title">出发城市</div>
        <div class="col-md-4 data text">
            <input type="text" class="form-control" placeholder="出发城市" value="" name="cityName">
        </div>

        <div class="col-md-2 title">产品价格</div>
        <div class="col-md-4 data text">
            <input type="text" class="form-control" placeholder="产品价格" value="" name="productPrice">
        </div>

        <div class="col-md-2 title">产品状态</div>

        <div class="col-md-4 data" >
            <select class="form-control" name="productStatusStr">
                <option>开启</option>
                <option>关闭</option>
            </select >
        </div>

        <div class="col-md-2 title rowHeight2x">其他信息</div>
        <div class="col-md-10 data rowHeight2x">
            <textarea class="form-control" rows="3" placeholder="请输入其他信息..." name="productDesc"></textarea>
        </div>
        <div class="col-md-10 data text-center">
            <button type="submit" class="btn bg-maroon">保存</button>
            <button type="button" class="btn bg-default" >返回</button>
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
<%--    日期选择器  --%>
    $(document).ready(function() {
        // 日期选择器
        $('#dateTimePicker').datetimepicker({
            format: "yyyy/mm/dd - hh:ii",
            autoclose: true,
            todayBtn: true,
            language: 'zh-CN'
        });

        // 激活导航位置
        setSidebarActive("需要亮起的tag的id");

        // 列表按钮
        $("#dataList td input[type='checkbox']").iCheck({
            checkboxClass: 'icheckbox_square-blue',
            increaseArea: '20%'
        });
        // 全选操作
        $("#selall").click(function() {
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
