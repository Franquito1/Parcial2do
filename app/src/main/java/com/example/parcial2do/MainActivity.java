package com.example.parcial2do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton1;

    private EditText EditText1;

    private TextView EditText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText1=findViewById(R.id.User);
        EditText2=findViewById(R.id.Pass);
        boton1=findViewById(R.id.buttonLog);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent4);
            }
        });
    }
}