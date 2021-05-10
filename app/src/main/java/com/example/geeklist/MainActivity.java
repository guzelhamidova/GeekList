package com.example.geeklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> list;

    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        createList();
        initRecycler();
    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.addItems(list);
        recyclerView.setAdapter(adapter);
    }

    private void createList() {
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Заголовок","Описание",System.currentTimeMillis()));
        list.add(new Model("Конец","Конец",System.currentTimeMillis()));
    }

}