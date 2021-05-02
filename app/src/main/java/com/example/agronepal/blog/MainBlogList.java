package com.example.agronepal.blog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.agronepal.R;
import com.example.agronepal.agronews.news;

public class MainBlogList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_blog_list);
        RelativeLayout bRelativeLayout = (RelativeLayout) findViewById(R.id.blog_relative_layout_1);
        bRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(getApplicationContext(), Rice.class);
                startActivity(startActivityIntent);
            }
        });
        RelativeLayout wRelativeLayout = (RelativeLayout) findViewById(R.id.blog_relative_layout_2);
        wRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(getApplicationContext(), Wheat.class);
                startActivity(startActivityIntent);

            }
        });
    }
}