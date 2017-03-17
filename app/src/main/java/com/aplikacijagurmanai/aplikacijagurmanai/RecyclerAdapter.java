package com.aplikacijagurmanai.aplikacijagurmanai;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Recipes_infoViewHolder> {

    ArrayList<Recipes_info> recipes_infos= new ArrayList<Recipes_info>();
    Context ctx;

    public RecyclerAdapter(ArrayList<Recipes_info>recipes_infos,Context ctx){
        this.recipes_infos=recipes_infos;
        this.ctx=ctx;

    }
    @Override
    public Recipes_infoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_adapter,parent,false);
       //  return new Recipes_infoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_adapter,parent,false));
        Recipes_infoViewHolder recipes_infoViewHolder=new Recipes_infoViewHolder(view,ctx,recipes_infos);
        return recipes_infoViewHolder;
    }

    @Override
    public void onBindViewHolder(Recipes_infoViewHolder holder, int position) {
        Recipes_info reci=recipes_infos.get(position);
        holder.recipe_name.setText(reci.getRecipe_name());
    }

    @Override
    public int getItemCount() {
        return recipes_infos.size();
    }

    public static class Recipes_infoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView recipe_name;
        ArrayList<Recipes_info> recipes_infos=new ArrayList<Recipes_info>();
        Context ctx;
        public Recipes_infoViewHolder(View view,Context ctx,ArrayList<Recipes_info>recipes_infos) {
            super(view);
            this.recipes_infos=recipes_infos;
            this.ctx=ctx;
            view.setOnClickListener(this);
            recipe_name=(TextView)view.findViewById(R.id.recipe_name);

        }

        @Override
        public void onClick(View v) {
        int position=getAdapterPosition();
            Recipes_info recipes_info= this.recipes_infos.get(position);
            Intent intent=new Intent(this.ctx,Recipes.class);
            intent.putExtra("recipe_name",recipes_info.getRecipe_name());
            this.ctx.startActivity(intent);
        }
    }
}
