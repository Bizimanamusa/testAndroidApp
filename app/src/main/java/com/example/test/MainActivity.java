package com.example.test;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //TextView to display "Hello, World!"
        TextView textView = new TextView(this);
        textView.setText("Hello, World! How are you ");
        textView.setTextSize(24);

        setContentView(textView);
    }

}
