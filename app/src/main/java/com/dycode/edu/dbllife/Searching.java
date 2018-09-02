package com.dycode.edu.dbllife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class Searching extends AppCompatActivity implements SearchView.OnQueryTextListener {
    ListView lv;
    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] data = {"Clicker Bassketball",
            "Row Bassketball",
            "Nike Bassketball",
            "Yoeto Bassketball",
            "Siapi Bassketball",
            "Licker Bassketball",
            "Archa Bassketball",
            "Indonesia Bassketball",
            "Malay Bassketball",
            "Clock Bassketball",
            "Bigger Bassketball"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);
        lv = (ListView) findViewById(R.id.listview);
        searchView = (SearchView) findViewById(R.id.idsearch);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
        searchView.setOnQueryTextListener(this);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v , menuInfo);
        menu.setHeaderTitle("Select the Action");
        menu.add(0,v.getId(),0,"Delete");
        menu.add(0,v.getId(),0,"UpperCase");
        menu.add(0,v.getId(),0,"LowerCase");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Delete"){
            Toast.makeText(this, "Delete was pressed",Toast.LENGTH_SHORT).show();
        }else if(item.getTitle()=="UpperCase") {
            Toast.makeText(this, "UpperCase was pressed", Toast.LENGTH_SHORT).show();
        }else if(item.getTitle()=="LowerCase") {
            Toast.makeText(this, "LowerCase was pressed", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
    @Override
    public boolean onQueryTextSubmit(String query){
        return false;
    }
    @Override
    public boolean onQueryTextChange(String newText){
        String text = newText;
        adapter.getFilter().filter(newText);
        //Toast.makeText(this,"Query is"+ text,Toast.LENGTH_SHORT).show();
        return false;
    }

    public void click(View view) {
        Intent Click = new Intent(Searching.this, ClubActivity.class);
        startActivity(Click);
    }
}
