package com.example.paragjain.firebaseauthentication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Pradeep on 12-Nov-17.
 */

public class ListAdapter extends ArrayAdapter<List> {
    public ListAdapter(Context context, ArrayList<List> listHolder) {
        super(context, 0, listHolder);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        List li = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        TextView listNameView = (TextView) convertView.findViewById(R.id.list_title);
        TextView listIDView = (TextView) convertView.findViewById(R.id.list_id);
        TextView taskOne = (TextView) convertView.findViewById(R.id.item_1);
        TextView taskTwo = (TextView) convertView.findViewById(R.id.item_2);
        TextView taskThree = (TextView) convertView.findViewById(R.id.item_3);
        CheckBox shareable = (CheckBox) convertView.findViewById(R.id.list_shareable);
        listNameView.setText(li.listName);
        listIDView.setText(li.listID);
        taskOne.setText(li.taskOne);
        taskTwo.setText(li.taskTwo);
        taskThree.setText(li.taskThree);
        shareable.setChecked(li.isPublic);

        return convertView;
    }
}
