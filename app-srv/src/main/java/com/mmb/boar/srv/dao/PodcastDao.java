package com.mmb.boar.srv.dao;

import com.mmb.boar.srv.entities.Podcast;

import java.util.List;

/**
 * 
 * @author ama
 * @see <a href="http://www.codingpedia.org/ama/spring-mybatis-integration-example/">http://www.codingpedia.org/ama/spring-mybatis-integration-example/</a>
 */
public interface PodcastDao {
	
	public List<Podcast> getPodcasts();

	/**
	 * Returns a podcast given its id
	 * 
	 * @param id
	 * @return
	 */
	public Podcast getPodcastById(Long id);

	public Long deletePodcastById(Long id);

	public Long createPodcast(Podcast podcast);

	public int updatePodcast(Podcast podcast);

	/** removes all podcasts */
	public void deletePodcasts();	

}
