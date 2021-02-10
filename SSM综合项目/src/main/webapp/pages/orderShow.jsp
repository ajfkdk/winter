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
            <input type="text" class="form-control" placeholder="订单编号" value="" name="productNum">
        </div>

        <div class="col-md-2 title">下单时间</div>
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

        <div class="col-md-4 data">
            <select class="form-control" name="productStatusStr">
                <option>开启</option>
                <option>关闭</option>
            </select>
        </div>

        <div class="col-md-2 title rowHeight2x">其他信息</div>
        <div class="col-md-10 data rowHeight2x">
            <textarea class="form-control" rows="3" placeholder="请输入其他信息..." name="productDesc"></textarea>
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



                    <tr>

                        <td>成人</td>
                        <td>张首</td>
                        <td>男</td>
                        <td>15159871144</td>
                        <td>军官证</td>
                        <td>证件号码</td>

                    </tr>
                    <tr>

                        <td>成人</td>
                        <td>张首</td>
                        <td>男</td>
                        <td>15159871144</td>
                        <td>军官证</td>
                        <td>证件号码</td>

                    </tr>
                    <tr>

                        <td>成人</td>
                        <td>张首</td>
                        <td>男</td>
                        <td>15159871144</td>
                        <td>军官证</td>
                        <td>证件号码</td>

                    </tr>
                    <tr>

                        <td>成人</td>
                        <td>张首</td>
                        <td>男</td>
                        <td>15159871144</td>
                        <td>军官证</td>
                        <td>证件号码</td>

                    </tr>


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
           潇洒哥
        </div>

        <div class="col-md-2 title">联系人</div>
        <div class="col-md-4 data text">
            战三
        </div>

        <div class="col-md-2 title">手机号码</div>
        <div class="col-md-4 data text">
           1888888888
        </div>

        <div class="col-md-2 title">邮箱</div>
        <div class="col-md-4 data text">
            zdkfajlk@163.com
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
            在线支付--支付宝
        </div>
        <div class="col-md-2 title">金额</div>
        <div class="col-md-4 data text">
            ￥12345
        </div>
        </div>
    </div>
<%--    /费用信息    --%>

        <!-- 正文区域 /-->

    <button type="button" class=" btn  btn-info btn-lg btn-block">返回</button>
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
