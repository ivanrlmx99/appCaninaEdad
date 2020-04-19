package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView answerText=(TextView)findViewById(R.id.text_answer);
        final EditText ageDog=(EditText) findViewById(R.id.edit_text);

        Button myBoton=(Button)findViewById(R.id.my_botton);


        myBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ageString=ageDog.getText().toString();
                int edadInt=Integer.parseInt(ageString);
                answerText.setText("SI FUERAS PERRO TU EDAD SERIA:"+(edadInt*6));
            }
        });


    }
}
