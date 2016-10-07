package ca.bcit.dmccadden.myapplication;

import android.app.ListActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String[] androidColors = new String[] {
        "BLACK",
        "BLUE",
        "CYAN",
        "DARKGRAY",
        "GRAY",
        "GREEN",
        "LIGHTGRAY",
        "MAGENTA",
        "RED",
        "TRANSPARENT",
        "WHITE",
        "YELLOW",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, androidColors);

        setListAdapter(adapter);
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);

        // ListView Clicked item value
        String  itemValue    = (String) l.getItemAtPosition(position);

        try{
            v.setBackgroundColor(Color.parseColor(itemValue));
        } catch(Exception e){
            Log.d("TAG", "bad color");
        }
    }
}
