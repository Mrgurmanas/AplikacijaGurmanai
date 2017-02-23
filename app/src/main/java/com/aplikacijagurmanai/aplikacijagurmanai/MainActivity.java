package com.aplikacijagurmanai.aplikacijagurmanai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar prg;
    ImageButton imageButton;
    int i=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView =(RecyclerView)findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        ArrayList<String> arrayList =new ArrayList<>();
        arrayList.add("Recipe:1");
        arrayList.add("Recipe:2");
        arrayList.add("Recipe:3");
        arrayList.add("Recipe:4");


        recyclerView.setAdapter(new RecyclerAdapter(arrayList));
        prg=(ProgressBar)findViewById(R.id.progressBar);
        imageButton=(ImageButton)findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i+=10;
                prg.setProgress(i);
            }
        });
    }
}
