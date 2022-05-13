package com.example.winnovation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class VoteActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btnnnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);
        butontanimlamaaa();

        radioGroup = findViewById(R.id.radioGroup);
        Button gonderr = findViewById(R.id.gonder);
        gonderr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                gonderr.setText("Oyunuz Gönderildi");
            }
        });

        btnnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iscii = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(iscii);
            }
        });
    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Toast.makeText(this, "Verilen Puan:" + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

    public void butontanimlamaaa(){

        btnnnn=findViewById(R.id.geriii);
    }
}