package com.github.elcodedocle.android_resttest;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    static final String SERVICE_URL = "http://elcodedocle-jsontest.herokuapp.com/apps";
    private ListView mListView;
    SwipeRefreshLayout mSwipeRefreshLayout;

    public String getServiceUrl(){
        return SERVICE_URL;
    }

    public ListView getmListView() {
        return mListView;
    }

    private void populateListView(){
        new AsyncRetrieveTask(this).execute(getServiceUrl());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeToRefresh);
        mListView = (ListView) findViewById(R.id.app_list_view);

        populateListView();

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                populateListView();
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
