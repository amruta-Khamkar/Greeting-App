package com.example.greeting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                String s=editText.getText().toString();
                int hourofday = cal.get(Calendar.HOUR_OF_DAY);
                if(hourofday>=4 && hourofday<12){
               textView.setText("Good Morning "+s +" !");
                }
                else if(hourofday>=12 && hourofday<16){
               textView.setText("Good Afternoon "+s+" !");
                }
                else if(hourofday>=16 && hourofday<20){
               textView.setText("Good Evening "+s+" !");
                }
                else{
                    textView.setText("Good Night "+s+" !");
                }

            }
        });


    }
}