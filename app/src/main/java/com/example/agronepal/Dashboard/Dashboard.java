package com.example.agronepal.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agronepal.AboutPage.about;
import com.example.agronepal.Identify.FlowerClassify;
import com.example.agronepal.R;
import com.example.agronepal.agronews.news;
import com.example.agronepal.blog.MainBlogList;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
         RelativeLayout mRelativeLayout = (RelativeLayout) findViewById(R.id.relative_layout_1);
        mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(getApplicationContext(), news.class);
                startActivity(startActivityIntent);
            }
        });

        RelativeLayout nRelativeLayout = (RelativeLayout) findViewById(R.id.relative_layout_2);
        nRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(getApplicationContext(), MainBlogList.class);
                startActivity(startActivityIntent);

            }
        });
        RelativeLayout oRelativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
        oRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(getApplicationContext(), FlowerClassify.class);
                startActivity(startActivityIntent);

            }
        });

        RelativeLayout aRelativeLayout = (RelativeLayout) findViewById(R.id.relative_layout_3);
        aRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(getApplicationContext(), about.class);
                startActivity(startActivityIntent);
            }
        });
    }

}