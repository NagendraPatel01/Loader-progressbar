package com.example.loaderprogrss;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.leo.simplearcloader.ArcConfiguration;
import com.leo.simplearcloader.SimpleArcDialog;
import com.leo.simplearcloader.SimpleArcLoader;

public class MainActivity extends AppCompatActivity {

    SimpleArcLoader loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* ProgressDialog progressBar = new ProgressDialog(this);
        progressBar.setMessage("loading.......");
        progressBar.setCancelable(true);
        progressBar.setProgressStyle(ProgressDialog.THEME_TRADITIONAL);
        progressBar.show();
*/
        loader = findViewById(R.id.loader);

        loader.start();

        Handler ab=new Handler();

        ab.postDelayed(new Runnable() {
            @Override
            public void run() {
                loader.stop();
                Intent a=new Intent(MainActivity.this,AnkitActivity.class);
                startActivity(a);
            }
        },5000);



    }
}
