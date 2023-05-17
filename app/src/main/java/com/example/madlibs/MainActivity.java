package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNextPage = findViewById(R.id.btn_nextpage);

        Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);

        String sendThisString = "Whatever string I want to send";
        String sendThisToo = "The other string I want to send";

        secondActivity.putExtra("data1", sendThisString);
        secondActivity.putExtra("data2", sendThisToo);

        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(secondActivity);
            }
        });
    }
}