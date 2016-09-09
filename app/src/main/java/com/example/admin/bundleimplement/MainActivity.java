package com.example.admin.bundleimplement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Login;
    EditText a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login=(Button)findViewById(R.id.button);
        Login.setOnClickListener(this);
        a=(EditText)findViewById(R.id.editText);
    }

    @Override
    public void onClick(View v) {
       EditText a=(EditText)findViewById(R.id.editText);
        Intent i=new Intent(MainActivity.this,Display.class);

        String message = a.getText().toString();
        i.putExtra("Username",message);

        startActivity(i);



    }
}
