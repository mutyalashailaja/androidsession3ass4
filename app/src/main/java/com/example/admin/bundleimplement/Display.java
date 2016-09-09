package com.example.admin.bundleimplement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        tv=(TextView)findViewById(R.id.tvusername);
        String username=getIntent().getStringExtra("Username");
        TextView tv=(TextView)findViewById(R.id.tvusername);
        tv.setText(username);

    }


}

