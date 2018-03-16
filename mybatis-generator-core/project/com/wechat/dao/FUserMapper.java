package com.wechat.dao;

import com.wechat.dao.pojo.FUser;
import java.util.List;

public interface FUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FUser record);

    int insertSelective(FUser record);

    FUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FUser record);

    int updateByPrimaryKey(FUser record);

    List<FUser> selectByCondition(FUser record);

    List<FUser> selectAll();
}