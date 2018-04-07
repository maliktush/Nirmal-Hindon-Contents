package com.tusharmalik.nirmal1.Event;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tusharmalik.nirmal1.MainActivity;
import com.tusharmalik.nirmal1.R;
import com.tusharmalik.nirmal1.curr;
import com.tusharmalik.nirmal1.future;

public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Button b1,b2,bb;
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        bb=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Event.this,curr.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Event.this,future.class);
                startActivity(i);
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Event.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}
