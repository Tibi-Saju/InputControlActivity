package com.example.inputcontrolsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Questiontwo extends AppCompatActivity {
    CheckBox opt1,opt2,opt3;
    Button buttonOrder;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questiontwo);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        //Getting instance of CheckBoxes and Button from the activty_main.xml file
        opt1=(CheckBox)findViewById(R.id.checkBox);
        opt2=(CheckBox)findViewById(R.id.checkBox2);
        opt3=(CheckBox)findViewById(R.id.checkBox3);
        buttonOrder=(Button)findViewById(R.id.button);

        //Applying the Listener on the Button click
        buttonOrder.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                if(opt1.isChecked()){
                    result.append("\nMS Dhoni: Correct Answer");
                }
                if(opt2.isChecked()){
                    result.append("\nSourav Ganguly: Correct Answer");
                }
                if(opt3.isChecked()){
                    result.append("\nAbhinav Bindra: Wrong Answer");
                }
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
        submit = findViewById(R.id.end);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Questiontwo.this, Rating.class);
                startActivity(intent);
            }
        });
    }
}