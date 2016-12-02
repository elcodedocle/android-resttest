package com.github.elcodedocle.android_resttest;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ArrayAdapter;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

class AsyncRetrieveTask extends AsyncTask<String, Void, List<App>> {

    private MainActivity activity;

    AsyncRetrieveTask(MainActivity activity){
        this.activity = activity;
    }

    protected List<App> doInBackground(String... urls) {

        JSONArray array;
        ArrayList<App> appList;
        try {
            array = JsonTest.parseJsonFromUrl(urls[0]);
            appList = new ArrayList<>(JsonTest.getAppList(array));
        } catch (Exception ex){
            Log.e("json_consumer_error", "cannot retrieve app list", ex);
            appList = new ArrayList<>();
        }
        return appList;
    }

    protected void onPostExecute(List<App> appList) {
        String[] listItems = new String[appList.size()];
        for(int i = 0; i < appList.size(); i++){
            App app = appList.get(i);
            listItems[i] = app.getTitle();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this.activity, android.R.layout.simple_list_item_1, listItems);
        adapter.notifyDataSetChanged();
        activity.getmListView().setAdapter(adapter);
    }
}
