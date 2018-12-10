package com.example.navin.yoyo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    String url;
    EditText urlinput;
    Button uploadbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        urlinput = (EditText) findViewById(R.id.urlinput);
        uploadbutton = (Button) findViewById(R.id.uploadbutton);
        uploadbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = urlinput.getText().toString();
            }
        });


    }
}
