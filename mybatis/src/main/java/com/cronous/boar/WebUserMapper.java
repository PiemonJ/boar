package com.cronous.boar;

import com.cronous.boar.entity.WebUser;

public interface WebUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WebUser record);

    int insertSelective(WebUser record);

    WebUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebUser record);

    int updateByPrimaryKey(WebUser record);
}