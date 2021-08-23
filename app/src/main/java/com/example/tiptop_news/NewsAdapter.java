package com.example.tiptop_news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        News currentNews = getItem(position);

        TextView newsContents = (TextView) listItemView.findViewById(R.id.news_content);
        newsContents.setText(currentNews.getNewsContent());

        TextView newsTopic = (TextView) listItemView.findViewById(R.id.news_topic);
        newsTopic.setText(currentNews.getNewsTopic());

        TextView newsPillar = (TextView) listItemView.findViewById(R.id.news_pillar);
        if (currentNews.getNewsPillar() != "") {
            newsPillar.setText(currentNews.getNewsPillar());
            newsPillar.setVisibility(View.VISIBLE);
        } else {
            newsPillar.setVisibility(View.GONE);
        }

        TextView newsDate = listItemView.findViewById(R.id.news_date);
        newsDate.setText(currentNews.getNewsDate());

        return listItemView;
    }
}
