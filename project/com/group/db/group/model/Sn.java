package com.group.db.group.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Sn implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sn.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sn.last_value
     *
     * @mbg.generated
     */
    private Long lastValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sn.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sn.modify_date
     *
     * @mbg.generated
     */
    private Date modifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sn
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}