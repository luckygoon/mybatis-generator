package com.group.db.group.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Goods implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.sn
     *
     * @mbg.generated
     */
    private String sn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.model
     *
     * @mbg.generated
     */
    private String model;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.caption
     *
     * @mbg.generated
     */
    private String caption;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.image
     *
     * @mbg.generated
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.is_delivery
     *
     * @mbg.generated
     */
    private Boolean isDelivery;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.is_marketable
     *
     * @mbg.generated
     */
    private Boolean isMarketable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.campaign
     *
     * @mbg.generated
     */
    private Integer campaign;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.groupon_count
     *
     * @mbg.generated
     */
    private Integer grouponCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.weight
     *
     * @mbg.generated
     */
    private Float weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.unit
     *
     * @mbg.generated
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.product_category_id
     *
     * @mbg.generated
     */
    private Long productCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}