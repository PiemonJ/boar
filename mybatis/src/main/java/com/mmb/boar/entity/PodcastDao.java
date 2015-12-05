package com.mmb.boar.entity;

import java.util.Date;

public class PodcastDao {
    private Long id;

    private String title;

    private String feed;

    private Date insertionDate;

    private String description;

    private String linkOnPodcastpedia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed == null ? null : feed.trim();
    }

    public Date getInsertionDate() {
        return insertionDate;
    }

    public void setInsertionDate(Date insertionDate) {
        this.insertionDate = insertionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLinkOnPodcastpedia() {
        return linkOnPodcastpedia;
    }

    public void setLinkOnPodcastpedia(String linkOnPodcastpedia) {
        this.linkOnPodcastpedia = linkOnPodcastpedia == null ? null : linkOnPodcastpedia.trim();
    }
}