package com.example.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
private EditText password;
private LinearLayout mLinearLayout;
private Button bt2;
private EditText ET;
private TextView TV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mLinearLayout=findViewById(R.id.L1);
    bt2=findViewById(R.id.bT1);
    ET=findViewById(R.id.eT1);
    TV=findViewById(R.id.Tv);
    password=findViewById((R.id.eT2));

    bt2.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            String objeto =ET.getText().toString();
            TV.setText(objeto);

        }
    });

    bt2.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            String objeto =password.getText().toString();
            TV.setText(objeto);
            return false;
        }
    });
    }


}
