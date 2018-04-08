package com.wechat.dao;

import com.wechat.dao.pojo.Order;
import java.util.List;

public interface OrderMapper {
    Order selectByPrimaryKey(Integer id);

    int insertSelective(Order record);

    int updateByPrimaryKeySelective(Order record);

    int deleteByPrimaryKey(Integer id);

    List<Order> selectByCondition(Order record);

    List<Order> selectAll();

    int deleteBySelective(Order record);
}