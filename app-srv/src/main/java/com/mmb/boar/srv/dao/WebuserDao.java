package com.mmb.boar.srv.dao;

import com.mmb.boar.srv.entities.Webuser;

public interface WebuserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Webuser record);

    int insertSelective(Webuser record);

    Webuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Webuser record);

    int updateByPrimaryKey(Webuser record);
}