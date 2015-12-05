package com.mmb.boar;

import com.mmb.boar.entity.PodcastDao;

public interface PodcastDaoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PodcastDao record);

    int insertSelective(PodcastDao record);

    PodcastDao selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PodcastDao record);

    int updateByPrimaryKey(PodcastDao record);
}