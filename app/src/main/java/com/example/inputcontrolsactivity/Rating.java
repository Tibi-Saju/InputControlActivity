package com.example.inputcontrolsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class Rating extends AppCompatActivity {
    RatingBar ratingbar;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        ratingbar=(RatingBar)findViewById(R.id.ratingBar);
        button=(Button)findViewById(R.id.button);
        //Performing action on Button Click
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                String rating=String.valueOf(ratingbar.getRating());
                Snackbar.make(arg0, "your rating "+rating+" "+".Thank you for your ratings!! ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });
    }
}