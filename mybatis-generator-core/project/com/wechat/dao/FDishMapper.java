package com.wechat.dao;

import com.wechat.dao.pojo.FDish;
import java.util.List;

public interface FDishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FDish record);

    int insertSelective(FDish record);

    FDish selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FDish record);

    int updateByPrimaryKey(FDish record);

    List<FDish> selectByCondition(FDish record);

    List<FDish> selectAll();
}