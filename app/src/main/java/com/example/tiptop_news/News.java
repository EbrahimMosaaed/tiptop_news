package com.example.tiptop_news;

public class News {
    private final String mNewsTopic;
    private final String mNewsContent;
    private final String mNewsDate;
    private String mNewsPillar;
    private final String mUrl;
    private final String mAuthor;

    public News(String category, String content, String time, String pillar, String url, String author) {
        mNewsTopic = category;
        mNewsContent = content;
        mNewsDate = time;
        mNewsPillar = pillar;
        mUrl = url;
        mAuthor = author;


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

    public String getAuthor() {
        return mAuthor;
    }
}