package com.test.dao;

import com.test.domain.ECase;
import java.util.List;

public interface ECaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ECase record);

    int insertSelective(ECase record);

    ECase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ECase record);

    int updateByPrimaryKey(ECase record);

    List<ECase> selectByCondition(ECase record);

    List<ECase> selectAll();
}