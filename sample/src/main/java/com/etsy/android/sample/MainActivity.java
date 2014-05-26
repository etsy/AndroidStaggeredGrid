package com.etsy.android.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SGV Sample");
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_sgv).setOnClickListener(this);
        findViewById(R.id.btn_sgv_fragment).setOnClickListener(this);
        findViewById(R.id.btn_sgv_empty_view).setOnClickListener(this);
        findViewById(R.id.btn_listview).setOnClickListener(this);
    }


    @Override
    public void onClick(final View v) {
        if (v.getId() == R.id.btn_sgv) {
            startActivity(new Intent(this, StaggeredGridActivity.class));
        }
        else if (v.getId() == R.id.btn_sgv_fragment) {
            startActivity(new Intent(this, StaggeredGridActivityFragment.class));
        }
        else if (v.getId() == R.id.btn_sgv_empty_view) {
            startActivity(new Intent(this, StaggeredGridEmptyViewActivity.class));
        }
        else if (v.getId() == R.id.btn_listview) {
            startActivity(new Intent(this, ListViewActivity.class));
        }
    }
}
