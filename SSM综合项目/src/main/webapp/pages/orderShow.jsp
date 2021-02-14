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


        <!-- 内容头部 /-->

        <%--    ============================================================================    --%>


        <!-- 正文区域 -->
        <%--    产品信息的展示   --%>
        <div class="box-header">
            <i class="fa fa-newspaper-o"></i>
            <h3 class="box-title">产品信息</h3>
        </div>
        <div class="row data-type">

            <div class="col-md-2 title">订单编号</div>
            <div class="col-md-4 data text">
                <input type="text" class="form-control" readonly="readonly" value="${OrderList.product.productNum} ">
            </div>

            <div class="col-md-2 title">下单时间</div>
            <div class="col-md-4 data text">
                <input type="text" class="form-control" readonly="readonly"
                       value="${OrderList.product.departureTimeStr} ">
            </div>

            <div class="col-md-2 title">路线名称</div>
            <div class="col-md-4 data text">
                <input type="text" class="form-control" readonly="readonly"
                       value="${OrderList.product.productName} ">
            </div>

            <div class="col-md-2 title">出发城市</div>
            <div class="col-md-4 data text">
                <input type="text" class="form-control" readonly="readonly"
                       value="${OrderList.product.cityName} ">
            </div>

            <div class="col-md-2 title">产品价格</div>
            <div class="col-md-4 data text">
                <input type="text" class="form-control" readonly="readonly"
                       value="${OrderList.product.productPrice} ">
            </div>

            <div class="col-md-2 title">产品状态</div>

            <div class="col-md-4 data">
                <input type="text" class="form-control" readonly="readonly"
                       value="${OrderList.product.productStatusStr} ">
            </div>

            <div class="col-md-2 title rowHeight2x">其他信息</div>
            <div class="col-md-10 data rowHeight2x">
                <input type="text" class="form-control" readonly="readonly"
                       value="${OrderList.product.productDesc} ">
            </div>

        </div>
        <%--    /产品信息的展示--%>
        <%--    游客信息的展示 --%>
        <div class="box box-primary">
            <div class="box-header with-border">
                <h3 class="box-title">游客信息</h3>
            </div>

            <div class="box-body">

                <!-- 数据表格 -->
                <div class="table-box">


                    <!--数据列表-->
                    <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
                        <thead>
                        <tr>


                            <th class="">人群</th>
                            <th class="">姓名</th>
                            <th class="">性别</th>
                            <th class="">手机号码</th>
                            <th class="">证件类型</th>
                            <th class="">证件号码</th>


                        </tr>
                        </thead>
                        <tbody>

<c:forEach items="${OrderList.travellers}" var="traveller">
                        <tr>

                            <td>${traveller.travellerTypeStr}</td>
                            <td>${traveller.NAME}</td>
                            <td>${traveller.sex}</td>
                            <td>${traveller.phoneNum}</td>
                            <td>${traveller.credentialsTypeStr}</td>
                            <td>${traveller.credentialsNum}</td>

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


        </div>
        <%--    /游客信息的展示 --%>


        <%--联系人信息--%>
        <div class="box box-primary">
            <div class="box-header with-border">
                <h3 class="box-title">联系人信息</h3>
            </div>
        </div>
        <div class="row data-type">

            <div class="col-md-2 title">会员</div>
            <div class="col-md-4 data text">
                ${OrderList.menber.nickname}
            </div>

            <div class="col-md-2 title">联系人</div>
            <div class="col-md-4 data text">
                ${OrderList.menber.NAME}
            </div>

            <div class="col-md-2 title">手机号码</div>
            <div class="col-md-4 data text">
                ${OrderList.menber.phoneNum}
            </div>

            <div class="col-md-2 title">邮箱</div>
            <div class="col-md-4 data text">
                ${OrderList.menber.email}
            </div>


        </div>


        <%--/联系人信息--%>
        <%--    费用信息    --%>
        <div class="box box-primary">
            <div class="box-header with-border">
                <h3 class="box-title">费用信息</h3>
            </div>
            <div class="row data-type">

                <div class="col-md-2 title">支付方式</div>
                <div class="col-md-4 data text">
                    ${OrderList.payTypeStr}
                </div>
                <div class="col-md-2 title">金额</div>
                <div class="col-md-4 data text">
                    ${OrderList.product.productPrice}
                </div>
            </div>
        </div>
        <%--    /费用信息    --%>

        <!-- 正文区域 /-->
<%--            <a href="${pageContext.request.contextPath}/order/findByid?id=${order.id}">--%>
        <a href="${pageContext.request.contextPath}/order/findAll"><button type="button" class=" btn  btn-info btn-lg btn-block">返回</button></a>
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
