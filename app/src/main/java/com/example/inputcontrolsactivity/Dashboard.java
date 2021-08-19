package com.example.inputcontrolsactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    TextView header_text;
    CardView cardProfile;
    CardView cardContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Intent intent = getIntent();
        String text = intent.getStringExtra(Intent.EXTRA_TEXT);
        // use the text in a TextView
        TextView textView = (TextView) findViewById(R.id.name);
        textView.setText(text);
        header_text = findViewById(R.id.header);
        cardProfile = findViewById(R.id.cardProfile);
        cardContact = findViewById(R.id.cardContact);

        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Dashboard.this, Rules.class);
                startActivity(i);
            }
        });
        cardContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Dashboard.this, contactus.class);
                startActivity(i);
            }
        });


    }
}
