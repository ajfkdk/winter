package itheima.domain;

import itheima.util.dataUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.util.Date;

public class Product {
        private int id; // 主键
        private String productNum; // 编号 唯一
        private String productName; // 名称
        private String cityName; // 出发城市
    @DateTimeFormat(pattern = "yyyy/mm/dd - HH:mm")
        private Date departureTime; // 出发时间
        private String departureTimeStr;
        private double productPrice; // 产品价格
        private String productDesc; // 产品描述
        private Integer productStatus; // 状态 0 关闭 1 开启
        private String productStatusStr;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productNum='" + productNum + '\'' +
                ", productName='" + productName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", departureTime=" + departureTime +
                ", departureTimeStr='" + departureTimeStr + '\'' +
                ", productPrice=" + productPrice +
                ", productDesc='" + productDesc + '\'' +
                ", productStatus=" + productStatus +
                ", productStatusStr='" + productStatusStr + '\'' +
                '}';
    }

    public Product(int id, String productNum, String productName, String cityName, Date departureTime, String departureTimeStr, double productPrice, String productDesc, Integer productStatus, String productStatusStr) {
        this.id = id;
        this.productNum = productNum;
        this.productName = productName;
        this.cityName = cityName;
        this.departureTime = departureTime;
        this.departureTimeStr = departureTimeStr;
        this.productPrice = productPrice;
        this.productDesc = productDesc;
        this.productStatus = productStatus;
        this.productStatusStr = productStatusStr;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDepartureTime(){
        return departureTime;
    }
    dataUtil dataUtil = new dataUtil();
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
        String s=null;
        try {
            s = dataUtil.Data2String(departureTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setDepartureTimeStr(s);
    }

    public String getDepartureTimeStr()  {
        return departureTimeStr;
    }

    public void setDepartureTimeStr(String departureTimeStr) {

        this.departureTimeStr = departureTimeStr;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductStatus() {
        if (productStatusStr.equals("开启")) {
            productStatus=1;
        } else if (productStatusStr.equals("关闭")) {
            productStatus=0;
        }
        productStatusStr=null;
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        if (productStatus == 1) {
            this.productStatusStr="开启";
        } else if (productStatus == 0||productStatus==null) {
            this.productStatusStr="关闭";
        }
        this.productStatus = productStatus;
    }

    public String getProductStatusStr() {
        return productStatusStr;
    }

    public void setProductStatusStr(String productStatusStr) {
        this.productStatusStr = productStatusStr;
    }
}
