package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etname;
    EditText etage;
    EditText etnoun;
    EditText etactivity;
    EditText etverb;
    EditText etverb2;
    EditText name2;
    EditText song;
    EditText adjective;
    EditText name3;
    EditText adjective2;


    Button btnNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.et_name);
        etage = findViewById(R.id.et_age);
        etnoun = findViewById(R.id.et_noun);
        etactivity = findViewById(R.id.et_activity);
        etverb = findViewById(R.id.et_verb);
        etverb2 = findViewById(R.id.et_verb2);
        etname2 = findViewById(R.id.et_name2);
        etsong = findViewById(R.id.et_song);
        etadjective = findViewById(R.id.et_adjective);
        etname3 = findViewById(R.id.et_name3);
        etadjective2 = findViewById(R.id.et_adjective2);




        Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);

        String sendThisString = "Whatever string I want to send";
        String sendThisToo = "The other string I want to send";

        secondActivity.putExtra("data1", sendThisString);
        secondActivity.putExtra("data2", sendThisToo);

        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 String story = "The Birthday Party!";
                 story += "\n Yesterday I went to" + etname + "'s" + etage + "th" + "birthday party. ";
                 story += "\n I got him/her a" + etnoun + ".";
                 story += "\n We started by playing" + etactivity + " and then there was a"+ etverb + " party.";
                 story += "\n Before cutting the cake everyone " + etverb2 + ". " + etname2 "Started to sing" + etsong + ". ";
                 story += "\n I had a" + etadjective + " time at the party and enjoyed celebrating" + etname3;
                 story += "\n He/She is such a" + etadjective2 + "friend.";

                 secondActivity.putExtra("story",story);



                startActivity(secondActivity);
            }
        });
    }
}