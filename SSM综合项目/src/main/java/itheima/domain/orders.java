package itheima.domain;

import itheima.util.dataUtil;

import java.util.Date;
import java.util.List;

public class orders {
    private dataUtil util=new dataUtil();
    private Integer id;
    private String orderNum;
    private Date orderTime;
    //    时间yyyy/MM/dd HH:mm
    private String orderTimeStr;

    public orders() {
    }

    @Override
    public String toString() {
        return "orders{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", orderTime=" + orderTime +
                ", orderTimeStr='" + orderTimeStr + '\'' +
                ", peopleCount=" + peopleCount +
                ", orderDesc='" + orderDesc + '\'' +
                ", payType=" + payType +
                ", payTypeStr='" + payTypeStr + '\'' +
                ", orderStatus=" + orderStatus +
                ", orderStatusStr='" + orderStatusStr + '\'' +
                ", productId=" + productId +
                ", memberId=" + memberId +
                ", product=" + product +
                ", travellers=" + travellers +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderTimeStr() {
        if (orderTime != null) {
            orderTimeStr = util.Data2String(orderTime);
        }
        return orderTimeStr;
    }

    public void setOrderTimeStr(String orderTimeStr) {
        this.orderTimeStr = orderTimeStr;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayTypeStr() {
        if (payType != null) {
            if (payType == 1) {
                payTypeStr = "微信";
            }
            if (payType == 0) {
                payTypeStr = "支付宝";
            }
            if (payType == 2) {
                payTypeStr = "其他";
            }
        }
        return payTypeStr;
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusStr() {
        return orderStatusStr;
    }

    public void setOrderStatusStr(String orderStatusStr) {
        this.orderStatusStr = orderStatusStr;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<traveller> travellers) {
        this.travellers = travellers;
    }

    public orders(Integer id, String orderNum, Date orderTime, String orderTimeStr, Integer peopleCount, String orderDesc, Integer payType, String payTypeStr, Integer orderStatus, String orderStatusStr, Integer productId, Integer memberId, Product product, List<traveller> travellers) {
        this.id = id;
        this.orderNum = orderNum;
        this.orderTime = orderTime;
        this.orderTimeStr = orderTimeStr;
        this.peopleCount = peopleCount;
        this.orderDesc = orderDesc;
        this.payType = payType;
        this.payTypeStr = payTypeStr;
        this.orderStatus = orderStatus;
        this.orderStatusStr = orderStatusStr;
        this.productId = productId;
        this.memberId = memberId;
        this.product = product;
        this.travellers = travellers;
    }

    private Integer peopleCount;
    private String orderDesc;
    private Integer payType;
    //    （0代表支付表 1代表微信 2代表其他）
    private String payTypeStr;
    private Integer orderStatus;
    private String orderStatusStr;//(0代表未支付 1代表支付）
    private Integer productId;//外键
    private Integer memberId;//外键
    //    另外一个表
    private Product product;
//    游客表（一个订单可以有多个游客）
    private List<traveller> travellers;
}
