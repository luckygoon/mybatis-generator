package com.group.db.group.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SysCaptcha implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_captcha.uuid
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_captcha.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_captcha.expire_time
     *
     * @mbg.generated
     */
    private Date expireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_captcha
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}