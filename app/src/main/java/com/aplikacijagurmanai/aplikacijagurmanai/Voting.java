package com.aplikacijagurmanai.aplikacijagurmanai;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Voting extends AppCompatActivity {

    String[] challenges_theme;
    int[] challenges_pictures;
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);

        Resources res=getResources();
        challenges_theme=res.getStringArray(R.array.challenges_theme);
        challenges_pictures=res.getIntArray(R.array.challenges_pictures);

        l=(ListView)findViewById(R.id.l);
        vAdapter adapter=new vAdapter(this,challenges_theme,challenges_pictures);
        l.setAdapter(adapter);
    }
}
class vAdapter extends ArrayAdapter<String> {
    Context context;
    int[]challenge_picture;
    String[]theme;
    vAdapter(Context c,String[]challenges_theme, int challenges_pictures[])
    {
        super(c,R.layout.list_item,R.id.ctheme,challenges_theme);
        this.context=c;
        this.challenge_picture=challenges_pictures;
        this.theme=challenges_theme;

    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View row=convertView;
        if(row==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item, parent, false);
        }
        ImageView challenges_pictures= (ImageView)row.findViewById(R.id.challenges_pictures);
        TextView challenges_theme=(TextView)row.findViewById(R.id.ctheme);

        challenges_pictures.setImageResource(challenge_picture[position]);
        challenges_theme.setText(theme[position]);

        return row;
    }
}