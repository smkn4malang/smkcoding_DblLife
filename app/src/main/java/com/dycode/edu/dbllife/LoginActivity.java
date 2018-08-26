package com.dycode.edu.dbllife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button btnSenData;
    private Button btnSenData1;
    private Button btnSenData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout. activity_login );

        btnSenData = (Button)findViewById(R.id.btn );
        btnSenData1 = (Button)findViewById(R.id.btn1);
        btnSenData2 = (Button)findViewById(R.id.btn2);


        btnSenData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUp.class);
                startActivity(intent);
            }
        });

        btnSenData1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ForgotActivity.class);
                startActivity(intent);
            }
        });

        btnSenData2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FragmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
