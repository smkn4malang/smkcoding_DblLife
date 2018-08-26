package com.dycode.edu.dbllife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Forgot2 extends AppCompatActivity {
    public static final String EXTRA_DATA = "EXTRA_DATA";
    private Button btnSenData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout. activity_forgot2 );

        btnSenData = (Button)findViewById(R.id.btn );


        btnSenData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
