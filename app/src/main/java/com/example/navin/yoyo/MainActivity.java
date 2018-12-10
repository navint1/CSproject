package com.example.navin.yoyo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    String url;
    EditText urlinput;
    Button uploadbutton;
    Button howbutton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        urlinput = (EditText) findViewById(R.id.urlinput);
        uploadbutton = (Button) findViewById(R.id.uploadbutton);
        howbutton = (Button) findViewById(R.id.howbutton);

        uploadbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = urlinput.getText().toString();
                System.out.println(url);
            }
        });

        howbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this, Instructions.class);
                startActivity(int1);
            }
        });



    }
}
