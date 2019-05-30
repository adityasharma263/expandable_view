package com.example.upsc;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.LinkedHashMap;
import java.util.List;

public class MyExpandbleListAdapter extends BaseExpandableListAdapter {
    private LinkedHashMap<String, List<String>> mStringListLinkedHashMap;
    private String[] mListHeaderGroup;

    public MyExpandbleListAdapter(LinkedHashMap<String, List<String>> mStringListLinkedHashMap) {
        this.mStringListLinkedHashMap = mStringListLinkedHashMap;
        this.mListHeaderGroup = mStringListLinkedHashMap.keySet().toArray(new String[0]);

    }


    @Override
    public int getGroupCount() {
        return mListHeaderGroup.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mStringListLinkedHashMap.get(mListHeaderGroup[groupPosition]).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return mListHeaderGroup[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mStringListLinkedHashMap.get(mListHeaderGroup[groupPosition]).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return groupPosition*childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView1, ViewGroup parent) {
        View convertView;
        if (getGroup(groupPosition) == null)
        {

            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.ad, parent, false);

        }
        else {
                convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.question, parent, false);
//        Log.d("position", String.valueOf(groupPosition));
            TextView textView = convertView.findViewById(R.id.questionTextView);
            textView.setText(String.valueOf(getGroup(groupPosition)));
        }

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.answer, parent, false);
        TextView textView = convertView.findViewById(R.id.answerTextView);
        textView.setText(String.valueOf(getChild(groupPosition, childPosition)));

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
