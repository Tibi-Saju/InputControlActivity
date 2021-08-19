package com.example.inputcontrolsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.Intent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Questionone extends AppCompatActivity {
    private Button submit;
    Button button;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionone);

        radioGroup = findViewById(R.id.activity_main_answers);

        submit = findViewById(R.id.activity_main_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int answerRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if (answerRadioButtonId != -1) {
                    RadioButton answer = findViewById(answerRadioButtonId);
                    if (answer.getText().equals(getResources().getString(R.string.answer3))) {
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct_answer), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.incorrect_answer), Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.missing_answer), Toast.LENGTH_LONG).show();
                }
            }
        });
        FloatingActionButton mAddUserFab=findViewById(R.id.next);
        mAddUserFab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View y){
                startActivity(new Intent(y.getContext(), Questiontwo.class));
            }
        });
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // start the SecondActivity
                Intent intent = new Intent(Questionone.this, Rating.class);
                startActivity(intent);
            }
        });
    }
}