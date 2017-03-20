package com.aplikacijagurmanai.aplikacijagurmanai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Recipes_info> list=new ArrayList<Recipes_info>();
    String[]recipe_name;

    ProgressBar prg;
    ImageButton imageButton;

    int i=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipe_name=getResources().getStringArray(R.array.recipe_name);
        int count = 0;
        for(String repNam:recipe_name){
            Recipes_info recipes_info = new Recipes_info(recipe_name[count]);
            count++;
            list.add(recipes_info);
        }

        recyclerView =(RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager =new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        prg=(ProgressBar)findViewById(R.id.progressBar);
        imageButton=(ImageButton)findViewById(R.id.imageButton);

        recyclerView.setHasFixedSize(true);

        adapter=new RecyclerAdapter(list,this);
        recyclerView.setAdapter(adapter);




        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ProfileScreen.class));
               /*i+=10;
                prg.setProgress(i);
                if(i==100){
                    startActivity(new Intent(MainActivity.this, Recipes.class));
                }*/
            }
        });
    }
}
