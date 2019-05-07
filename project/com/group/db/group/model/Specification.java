package com.group.db.group.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class Specification implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column specification.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column specification.parent_id
     *
     * @mbg.generated
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column specification.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column specification.order
     *
     * @mbg.generated
     */
    private Integer order;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column specification.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column specification.category_id
     *
     * @mbg.generated
     */
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table specification
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}