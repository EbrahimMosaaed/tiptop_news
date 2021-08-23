package com.example.tiptop_news;

public class News {
    private final String mNewsTopic;
    private final String mNewsContent;
    private final String mNewsDate;
    private String mNewsPillar;
    private final String mUrl;

    public News(String category, String content, String time, String author, String url) {
        mNewsTopic = category;
        mNewsContent = content;
        mNewsDate = time;
        mNewsPillar = author;
        mUrl = url;
    }

    public String getNewsTopic() {
        return mNewsTopic;
    }

    public String getNewsContent() {
        return mNewsContent;
    }

    public String getNewsDate() {
        return mNewsDate;
    }

    public String getNewsPillar() {
        return mNewsPillar;
    }

    public String getUrl() {
        return mUrl;
    }
}