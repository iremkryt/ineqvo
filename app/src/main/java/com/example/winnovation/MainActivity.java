package com.example.winnovation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btnn;
    Button btnnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butontanimlama();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sirket = new Intent(getApplicationContext(), SirketActivity.class);
                startActivity(sirket);
            }
        });
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oy = new Intent(getApplicationContext(), VoteActivity.class);
                startActivity(oy);
            }
        });

    }
    public void butontanimlama(){
        btn=findViewById(R.id.sirket);
        btnn=findViewById(R.id.oyisci);
        btnnn=findViewById(R.id.geri);
    }
}