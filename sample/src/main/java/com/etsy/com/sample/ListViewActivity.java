package com.etsy.com.sample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.etsy.android.grid.StaggeredGridView;

import java.util.List;

public class ListViewActivity extends Activity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        setTitle("ListView");
        mListView = (ListView) findViewById(R.id.list_view);

        LayoutInflater layoutInflater = getLayoutInflater();

        View header = layoutInflater.inflate(R.layout.list_item_header_footer, null);
        View footer = layoutInflater.inflate(R.layout.list_item_header_footer, null);
        TextView txtHeaderTitle = (TextView) header.findViewById(R.id.txt_title);
        TextView txtFooterTitle =  (TextView) footer.findViewById(R.id.txt_title);
        txtHeaderTitle.setText("THE HEADER!");
        txtFooterTitle.setText("THE FOOTER!");

        mListView.addHeaderView(header);
        mListView.addFooterView(footer);
//        mGridView.setClipToPadding(true);

        final SampleAdapter adapter = new SampleAdapter(this, R.id.txt_line1);
        mListView.setAdapter(adapter);

        final List<String> sampleData = SampleData.generateSampleData();
        for (String data : sampleData) {
            adapter.add(data);
        }
    }

}
