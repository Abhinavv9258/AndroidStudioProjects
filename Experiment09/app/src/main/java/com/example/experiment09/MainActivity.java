package com.example.experiment09;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        int id = item.getItemId();
        if (id == R.id.search_item) {
            return true;
        } else if (id == R.id.upload_item) {
            return true;
        } else if (id == R.id.copy_item) {
            return true;
        } else if (id == R.id.print_item) {
            return true;
        } else if (id == R.id.share_item) {
            return true;
        } else if (id == R.id.bookmark_item) {
            return true;
        } else{
            return super.onOptionsItemSelected(item);
        }
    }
}
