package com.dycode.edu.dbllife;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentActivity extends AppCompatActivity {
    private Button btnSenData;
    Button btn;
    View viewLayout;

    @BindView(R.id.pager)
    ViewPager pager;
    @BindView(R.id.tab)
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment);
        btn = (Button) findViewById(R.id.like);
        LayoutInflater layoutInflater = getLayoutInflater();
        viewLayout = layoutInflater.inflate(R.layout.custom_float,(ViewGroup) findViewById(R.id.custom_layout));
        ButterKnife.bind(this);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(viewPagerAdapter);
        tab.setupWithViewPager(pager);

        btnSenData = (Button)findViewById(R.id.search );


        btnSenData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Searching.class);
                startActivity(intent);
            }
        });

    }
    public void  btnClick(View v){
        Toast toast1 = Toast.makeText(this, "Toast:Gravity.TOP", Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0,0);
        toast1.setView(viewLayout);
        toast1.show();
    }

    public void ssss(View view) {
        Intent intent = new Intent (FragmentActivity.this,ProfilActivity.class);
        startActivity(intent);
    }
    public void haha (View view){
        Intent intent = new Intent(FragmentActivity.this, CommentActivity.class);
        startActivity(intent);
    }
}
