package com.codeandsee.basicmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean mLove = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.item_love:
                mLove = !mLove;
                item.setIcon(mLove ? R.drawable.baseline_favorite_white_48 : R.drawable.baseline_favorite_border_white_48);
                item.setTitle(mLove ? "Not Love" : "Love");
                return true;
            case R.id.sub_item_1:
                Toast.makeText(this, "Sub Item 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sub_item_2:
                Toast.makeText(this, "Sub Item 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sub_item_3:
                Toast.makeText(this, "Sub Item 3", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
