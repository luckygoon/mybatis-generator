package com.wechat.dao;

import com.wechat.dao.pojo.FOrder;
import java.util.List;

public interface FOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FOrder record);

    int insertSelective(FOrder record);

    FOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FOrder record);

    int updateByPrimaryKey(FOrder record);

    List<FOrder> selectByCondition(FOrder record);

    List<FOrder> selectAll();
}