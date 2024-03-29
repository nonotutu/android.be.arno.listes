package be.arno.listes;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import be.arno.listes.NewsItem;


public class CustomListAdapter extends BaseAdapter {

    private ArrayList<NewsItem> listData;

    private LayoutInflater layoutInflater;

    public CustomListAdapter(Context context, ArrayList<NewsItem> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }
 
    @Override
    public int getCount() {
        return listData.size();
    }
 
    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_row_layout, null);
            holder = new ViewHolder();
            holder.headlineView = (TextView) convertView.findViewById(R.id.title);
            //holder.reporterNameView = (TextView) convertView.findViewById(R.id.reporter);
            holder.ratingView = (RatingBar) convertView.findViewById(R.id.rating);
            holder.reportedDateView = (TextView) convertView.findViewById(R.id.date);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
 
        holder.headlineView.setText(listData.get(position).getHeadline());
        holder.ratingView.setRating(listData.get(position).getRating());
        //holder.reporterNameView.setText("By, " + listData.get(position).getReporterName());
        holder.reportedDateView.setText(listData.get(position).getDate());
 
        return convertView;
    }
 
    static class ViewHolder {
        TextView headlineView;
        RatingBar ratingView;
        //TextView reporterNameView;
        TextView reportedDateView;
    }
 
}