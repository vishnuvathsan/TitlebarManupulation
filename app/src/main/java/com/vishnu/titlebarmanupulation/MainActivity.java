package com.vishnu.titlebarmanupulation;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity extends Activity {

    private ScrollView sv;
    private RelativeLayout rl;
    private TextView tv1;
    private TextView tv2;
    private ListView listView;
    private String[] designPatterns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view
//        this.sv = (ScrollView) findViewById(R.id.scrollView);
//        sv.setSmoothScrollingEnabled(true);
//        sv.setNestedScrollingEnabled(true);
        this.rl = (RelativeLayout) findViewById(R.id.rl);
        this.tv1 = (TextView) findViewById(R.id.textView1);
        this.tv2 = (TextView) findViewById(R.id.textView2);
        this.listView = (ListView) findViewById(R.id.listView);
//        listView.setSmoothScrollbarEnabled(true);
//        listView.setNestedScrollingEnabled(true);

        // Create the arrays
        this.designPatterns = getResources().getStringArray(R.array.design_patterns);

        for (String str: designPatterns) {
            Log.d("Array", str);
        }

        // Create an array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, designPatterns);
        listView.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
