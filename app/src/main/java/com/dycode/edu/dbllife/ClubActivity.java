package com.dycode.edu.dbllife;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ClubActivity extends AppCompatActivity {

    //Deklarasi Variable
    private TextView GetNama ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        getSupportActionBar().setTitle("Data Mahasiswa");
        GetNama = findViewById(R.id.getNama);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");
        switch (nama){
            case "Clicker Bassketball":
                GetNama.setText("Nama:Clicker Bassketball");
                break;

            case "Row Bassketball":
                GetNama.setText("Nama:Row Bassketball");
                break;

            case "Nike Bassketball":
                GetNama.setText("Nama: Nike Bassketball");
                break;

            case "Yoeto Bassketball":
                GetNama.setText("Nama: Yoeto Bassketball");
                break;
        }
    }
}
