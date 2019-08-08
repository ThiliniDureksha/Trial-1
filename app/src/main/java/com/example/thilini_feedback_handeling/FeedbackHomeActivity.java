package com.example.thilini_feedback_handeling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FeedbackHomeActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private ImageButton imageButton1;
    private ImageButton imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_home);

        imageButton=(ImageButton) findViewById(R.id.btnSugges);
        imageButton1=(ImageButton)findViewById(R.id.btnComplain);
        imageButton2=(ImageButton)findViewById(R.id.btnContact);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start_suggestion();
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start_complains();
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start_contactUs();
            }
        });
    }

    public void start_suggestion(){

        Intent intent = new Intent(this,Suggestion_Activity.class);
        startActivity(intent);

    }

    public void start_complains(){

        Intent intent=new Intent(this,Complain_activity.class);
        startActivity(intent);
    }

    public void start_contactUs(){

        Intent intent=new Intent(this,ContactUS_activity.class);
        startActivity(intent);

    }
}
