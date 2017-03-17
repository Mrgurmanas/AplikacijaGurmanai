package com.aplikacijagurmanai.aplikacijagurmanai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Recipes extends AppCompatActivity {

    TextView rec_pav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        rec_pav=(TextView)findViewById(R.id.rec_pav);
        rec_pav.setText(getIntent().getStringExtra("recipe_name"));
    }
}
