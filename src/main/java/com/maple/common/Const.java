package com.maple.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by Maple.Ran on 2017/5/23
 */
public class Const {
    public static final String CURRENT_USER = "current_user";

    public static final String USERNAME = "username";
    public static final String EMAIL = "email";
    public static final Integer CAR_CATEGORY_ID = 100001;
    public static final String JS_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    public enum PaymentType{
        DOWN_PAYMENT(2,"首付"),
        FINAL_PAYMENT(3,"尾款"),
        DEPOSIT(1,"定金"),
        TOTAL_PAYMENT(4,"全款");

        public static PaymentType codeOf(int code) {
            for (PaymentType paymentType : values()) {
                if (paymentType.getCode() == code) {
                    return paymentType;
                }
            }
            throw new RuntimeException("没有找到相应的枚举");
        }

        PaymentType( int code,String desc) {
            this.desc = desc;
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public int getCode() {
            return code;
        }

        private String desc;
        private int code;

    }

    public enum OrderStatus{
        CANCELED(0,"已取消"),
        NO_PAY(10,"未支付"),
        PAID(20,"已付款"),
        SHIPPED(40, "已发货"),
        ORDER_SUCCESS(50, "订单完成"),
        ORDER_CLOSE(60, "订单关闭"),
        ;

        OrderStatus(int code,String desc) {
            this.desc = desc;
            this.code = code;
        }

        public static OrderStatus codeOf(int code) {
            for (OrderStatus orderStatus : values()) {
                if (orderStatus.getCode() == code) {
                    return orderStatus;
                }
            }
            throw new RuntimeException("没有找到相应的枚举");
        }


        private String desc;
        private int code;

        public String getDesc() {
            return desc;
        }

        public int getCode() {
            return code;
        }
    }

    public enum CarStatus {
        NORMAL(1, "正常运营"),
        TRANSFERRED(2, "已过户"),
        STOCKING(0,"库存中"),
        REDEEMED(3, "已赎回"),;


        private int code;
        private String desc;

        public static CarStatus codeOf(int code) {
            for (CarStatus carStatus : CarStatus.values()) {
                if (carStatus.getCode() == code) {
                    return carStatus;
                }
            }
            throw new RuntimeException("没有找到相应的枚举");

        }
        CarStatus(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum PaymentPlatform {
        alipay(1, "支付宝"),
        wechat(2, "微信"),
        ccb(3, "建设银行"),
        pingan(4, "平安银行"),
        cmb(5, "招商银行"),
        pos(6, "POS机");


        private int code;
        private String desc;

        PaymentPlatform(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static PaymentPlatform codeOf(int code) {
            for (PaymentPlatform paymentPlatform : PaymentPlatform.values()) {
                if (paymentPlatform.getCode() == code) {
                    return paymentPlatform;
                }
            }
            throw new RuntimeException("没有找到相应的枚举");
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum PlatformStatus{
        PAID_NORMAL(1, "正常已付"),
        PAID_OVERDUE(2, "逾期已付"),
        UNCONFIRMED(0, "未确认"),
        ABANDONED(-1, "作废");

        private int code;
        private String desc;

        PlatformStatus(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public static PlatformStatus codeOf(int code) {
            for (PlatformStatus platformStatus : PlatformStatus.values()) {
                if (platformStatus.getCode() == code) {
                    return platformStatus;
                }
            }
            throw new RuntimeException("没有找到相应的枚举");
        }

    }

    public enum Branch {
        CD(0,"成都"),
        KM(1,"昆明");

        public static Branch codeOf(int code) {
            for (Branch branch : Branch.values()) {
                if (branch.getCode() == code) {
                    return branch;
                }
            }
            throw new RuntimeException("没有找到相应的枚举");
        }


        private int code;
        private String desc;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        Branch(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }


    public interface Role{
        int ROLE_SALESMAN =3;//业务员
        int ROLE_FINANCIAL =1;//财务人员
        int ROLE_MANAGER=2;//主管人员
        int ROLE_ADMIN=0;//管理员
    }

    public enum InsuranceType{
        mInsurance(1, "交强险"),
        cInsurance(2, "商业险"),;

        private int code;
        private String desc;


        public static InsuranceType codeOf(int code) {
            for (InsuranceType insuranceType : InsuranceType.values()) {
                if (insuranceType.getCode() == code) {
                    return insuranceType;
                }
            }
            throw new RuntimeException("没有找到相应枚举");
        }

        InsuranceType(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    public interface Folder{
        String IMG = "img";
        String QR_CODE = "QRCode";
        String DRIVER = "driver";
    }

    public interface Permission {
        Set<Integer> NORMAL_PERMISSION = Sets.newHashSet(0,1, 2, 3);
        Set<Integer> PRIMARY_PERMISSION = Sets.newHashSet(0, 2);

    }

    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc", "price_asc");
    }

    public enum DriverStatus{
        UNBOUND(0,"未绑定车辆"),
        NORMAL_DRIVER(1,"正常运营"),
        TERMINATED_DRIVER(2,"合作结束"),
        POTENTIAL_FREE(4, "无意向"),
        DELETED(5, "已删除");
        private int code;
        private String desc;

        public static DriverStatus codeOf(int code) {
            for (DriverStatus driverStatus : DriverStatus.values()) {
                if (driverStatus.getCode() == code) {
                    return driverStatus;
                }
            }
            throw new RuntimeException("没有找到相应枚举");
        }

        DriverStatus(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    public enum CoModel{
        FULL_PAYMENT(10,"全款"),
        RENT(20,"正常租赁"),
        HIRE_PURCHASE_MONTH(30, "租购-月供"),
        HIRE_PURCHASE_WEEK(40, "租购-周供"),;

        public static CoModel codeOf(int code) {
            for (CoModel coModel : CoModel.values()) {
                if (coModel.getCode() == code) {
                    return coModel;
                }
            }
            throw new RuntimeException("没有找到相应枚举");
        }

        private int code;
        private String desc;

        CoModel(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    public interface Cart{
        int CHECKED = 1;
        int UN_CHECKED = 0;


        String LIMIT_NUM_FAIL="LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCESS="LIMIT_NUM_SUCCESS";
    }

    public interface phoneStatus{
        int normal = 1;
        int unconnected = 0;
        int uncheck = 2;
    }

    public enum ProductStatus{
        ON_SALE(1, "在线"),
        OFF_SALE(2, "下架"),
        DELETED(3, "删除"),;


        private int code;
        private String desc;

        public static ProductStatus codeOf(int code) {
            for (ProductStatus productStatus : ProductStatus.values()) {
                if (productStatus.getCode() == code) {
                    return productStatus;
                }
            }
            throw new RuntimeException("没有找到相应枚举");
        }

        ProductStatus(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

}
