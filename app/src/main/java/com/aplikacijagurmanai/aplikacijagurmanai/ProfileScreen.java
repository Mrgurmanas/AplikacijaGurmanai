package com.aplikacijagurmanai.aplikacijagurmanai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class ProfileScreen extends AppCompatActivity {

    EditText textnick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);

        textnick=(EditText) findViewById(R.id.textnick);
    }
}
