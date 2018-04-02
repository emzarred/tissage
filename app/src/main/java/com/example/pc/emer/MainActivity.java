package com.example.pc.emer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button ges;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ges= (Button) findViewById(R.id.b2);
        ges.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent( MainActivity.this,gestion.class);
        startActivity(i);
    }
}
