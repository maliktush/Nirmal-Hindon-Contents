package com.tusharmalik.nirmal1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Button b1,b2;
        b1=findViewById(R.id.fb1);
        b2=findViewById(R.id.fb2);

        b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(feedback.this,MainActivity.class);
                        startActivity(i);
                    }
                });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(feedback.this, "Your response has been submitted "+"          THANK YOU!!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(feedback.this,MainActivity.class);
                startActivity(i);
            }
        });
            }
}
