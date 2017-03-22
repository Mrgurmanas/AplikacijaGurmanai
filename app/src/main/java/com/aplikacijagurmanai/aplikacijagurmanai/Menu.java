package com.aplikacijagurmanai.aplikacijagurmanai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    CardView Recipes,Challenges,Voting,Search;
    ImageButton imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        Recipes=(CardView)findViewById(R.id.Recipes);
        Challenges=(CardView)findViewById(R.id.Challenges);
        Voting=(CardView)findViewById(R.id.Voting);
        Search=(CardView)findViewById(R.id.Paieska);

        imgProfile=(ImageButton)findViewById(R.id.imgProfile);

        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, ProfileScreen.class));

            }
        });

        Recipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, MainActivity.class));

                Toast.makeText(getApplicationContext(),"Recipes",Toast.LENGTH_LONG).show();
            }
        });
        Challenges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, Challenges.class));

                Toast.makeText(getApplicationContext(),"Challenges",Toast.LENGTH_LONG).show();
            }
        });
        Voting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, Voting.class));
                Toast.makeText(getApplicationContext(),"Voting",Toast.LENGTH_LONG).show();
            }
        });
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, Search.class));
                Toast.makeText(getApplicationContext(),"COMING SOON",Toast.LENGTH_LONG).show();
            }
        });
    }
}
