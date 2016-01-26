package com.aashish.myappportfolio;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);



        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                DisplayText(getResources().getString(R.string.SpotifyText));
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                DisplayText(getResources().getString(R.string.ScoresText));
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                DisplayText(getResources().getString(R.string.LibraryText));
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                DisplayText(getResources().getString(R.string.BuilditText));
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                DisplayText(getResources().getString(R.string.ReaderText));
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                DisplayText(getResources().getString(R.string.CapstoneText));
            }
        });


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

    void DisplayText(String s){
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}
