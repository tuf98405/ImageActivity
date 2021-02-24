package edu.temple.imageactivity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter{

    Context context;
    ArrayList<String> items;

    public ImageAdapter (Context context, ArrayList items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(context);

        if (convertView == null) {
            textView = new TextView((context));
        }
        else {
            textView = (TextView) convertView;
        }

        textView.setText(String.format("%d: %s", position, items.get(position)));

        return textView;
    }

    public View getDropDownView(){
        return null;
    }

}
