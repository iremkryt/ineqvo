package com.example.winnovation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SirketActivity extends AppCompatActivity {

    Button btnnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sirket);

        butontanimlamaa();

        btnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isci = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(isci);
            }
        });

    }
    public void butontanimlamaa(){
        btnnn=findViewById(R.id.geri);
    }
}