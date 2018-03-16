package com.wechat.dao;

import com.wechat.dao.pojo.FDesk;
import java.util.List;

public interface FDeskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FDesk record);

    int insertSelective(FDesk record);

    FDesk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FDesk record);

    int updateByPrimaryKey(FDesk record);

    List<FDesk> selectByCondition(FDesk record);

    List<FDesk> selectAll();
}