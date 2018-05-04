package com.sikhismknowledge.sikhismknowledge;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemAdaper extends ArrayAdapter<ListItem> {

    public ListItemAdaper(Activity context, ArrayList<ListItem> items) {

        super(context, 0, items);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ListItem currentItem = getItem(position);

        ImageView image =  listItemView.findViewById(R.id.listImageView);

        image.setImageResource(currentItem.getmImage());

        return listItemView;


    }
}



