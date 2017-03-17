package com.aplikacijagurmanai.aplikacijagurmanai;

public class Recipes_info {
    public Recipes_info(String recipe_name){
        this.setRecipe_name(recipe_name);

    }

    private String recipe_name;

    public String getRecipe_name() {
        return recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }
}