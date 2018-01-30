package com.google.layoutapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TimotiusEk on 3/15/2017.
 */

public class MenuAdapter extends BaseAdapter{
    private ArrayList<Recipe> recipes;
    private Context mContext;
    private LayoutInflater inflater;

    public MenuAdapter(ArrayList<Recipe> recipes, Context c){
        this.recipes = recipes;
        mContext = c;
    }

    @Override
    public int getCount() {
        return recipes.size();
    }

    @Override
    public Object getItem(int i) {
        return recipes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        Recipe recipe = (Recipe) getItem(i);
        View view;
        inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            view = inflater.inflate(R.layout.row_layout_menu_fragment, null);
            ImageView foodBg = (ImageView) view.findViewById(R.id.food_bg_fragment_menu);
            TextView foodName = (TextView) view.findViewById(R.id.food_name_fragment_menu);
            TextView cookingDuration = (TextView) view.findViewById(R.id.cook_duration_fragment_menu);

            foodBg.setImageResource(recipe.getImage());
            foodName.setText(recipe.getName());
            cookingDuration.setText(recipe.getDuration());
        } else {
            view = (View) convertView;
        }
        return view;
    }
}
