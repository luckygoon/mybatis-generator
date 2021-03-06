package com.group.db.group.mapper;

import com.group.db.group.model.OrderDetail;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated
     */
    OrderDetail selectByPrimaryKey(String detailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated
     */
    int insertSelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String detailId);

    List<OrderDetail> selectByCondition(OrderDetail record);

    List<OrderDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated
     */
    int deleteBySelective(OrderDetail record);
}