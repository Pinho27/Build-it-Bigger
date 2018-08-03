package com.example.joketellerandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        TextView tv_jokes = findViewById(R.id.tv_jokes);
        tv_jokes.setText(getIntent().getStringExtra("jokes"));
    }
}
