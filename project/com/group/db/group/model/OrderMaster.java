package com.group.db.group.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class OrderMaster implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.order_id
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.buyer_name
     *
     * @mbg.generated
     */
    private String buyerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.buyer_phone
     *
     * @mbg.generated
     */
    private String buyerPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.buyer_address
     *
     * @mbg.generated
     */
    private String buyerAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.buyer_id
     *
     * @mbg.generated
     */
    private String buyerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.need_invoice
     *
     * @mbg.generated
     */
    private Short needInvoice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.invoice_type
     *
     * @mbg.generated
     */
    private Short invoiceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.groupon
     *
     * @mbg.generated
     */
    private Short groupon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.groupon_id
     *
     * @mbg.generated
     */
    private String grouponId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.groupon_count
     *
     * @mbg.generated
     */
    private Integer grouponCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.tax_number
     *
     * @mbg.generated
     */
    private String taxNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.company_address
     *
     * @mbg.generated
     */
    private String companyAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.bank_name
     *
     * @mbg.generated
     */
    private String bankName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.bank_account
     *
     * @mbg.generated
     */
    private String bankAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.order_amount
     *
     * @mbg.generated
     */
    private BigDecimal orderAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.order_status
     *
     * @mbg.generated
     */
    private Byte orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.tracking_number
     *
     * @mbg.generated
     */
    private String trackingNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.delivery_code
     *
     * @mbg.generated
     */
    private String deliveryCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.refund_trade_no
     *
     * @mbg.generated
     */
    private String refundTradeNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.pay_trade_no
     *
     * @mbg.generated
     */
    private String payTradeNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.pay_status
     *
     * @mbg.generated
     */
    private Byte payStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.contract
     *
     * @mbg.generated
     */
    private String contract;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_master.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_master
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}