package com.wechat.dao;

import com.wechat.dao.pojo.FOrderDishRelation;
import java.util.List;

public interface FOrderDishRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FOrderDishRelation record);

    int insertSelective(FOrderDishRelation record);

    FOrderDishRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FOrderDishRelation record);

    int updateByPrimaryKey(FOrderDishRelation record);

    List<FOrderDishRelation> selectByCondition(FOrderDishRelation record);

    List<FOrderDishRelation> selectAll();
}