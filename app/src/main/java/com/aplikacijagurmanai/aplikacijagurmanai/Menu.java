package com.aplikacijagurmanai.aplikacijagurmanai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    CardView Recipes,Challenges,Settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        Recipes=(CardView)findViewById(R.id.Recipes);
        Challenges=(CardView)findViewById(R.id.Challenges);
        Settings=(CardView)findViewById(R.id.Settings);

        Recipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, MainActivity.class));
                finish();
                Toast.makeText(getApplicationContext(),"Recipes",Toast.LENGTH_LONG).show();
            }
        });
        Challenges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Challenges",Toast.LENGTH_LONG).show();
            }
        });
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Setting",Toast.LENGTH_LONG).show();
            }
        });
    }
}
