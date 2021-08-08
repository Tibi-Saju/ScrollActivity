package com.example.scrollactivity;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn_view);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast=Toast.makeText(getApplicationContext(),"Proud to an Indian. \nJai Hind!",Toast.LENGTH_LONG);
                View view=toast.getView();
                TextView view1=(TextView)view.findViewById(android.R.id.message);
                view1.setTextColor(Color.WHITE);
                view.setBackgroundResource(R.color.black);
                toast.show();

            }
        });

    }
}
