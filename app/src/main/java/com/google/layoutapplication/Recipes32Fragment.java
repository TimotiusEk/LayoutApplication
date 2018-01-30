package com.google.layoutapplication;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Recipes32Fragment extends Fragment {
    private ImageView foodBg;
    private ImageView circleBg;
    private ImageView categoryIcon;
    private LinearLayout cardView;
    private TextView headline;
    private TextView description;
    private String category = "SALAD";

    public Recipes32Fragment() {
        // Required empty public constructor
    }

    public Recipes32Fragment(String category) {
        // Required empty public constructor
        this.category = category;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recipes32, container, false);

        foodBg = (ImageView) v.findViewById(R.id.food_bg_recipes32);
        circleBg = (ImageView) v.findViewById(R.id.category_icon_bg_recipes32);
        categoryIcon = (ImageView) v.findViewById(R.id.category_icon_recipes32);
        cardView = (LinearLayout) v.findViewById(R.id.first_cardview);
        headline = (TextView) v.findViewById(R.id.headline_recipes32);
        description = (TextView) v.findViewById(R.id.food_description_recipes32);

        populateData(category);
        // Inflate the layout for this fragment
        return v;
    }

    private void populateData(String category){
        if(category.equalsIgnoreCase("SALAD")){
            setDataToLayout(R.drawable.p10, getResources().getString(R.color.colorPrimary), R.drawable.ic_access_time_white_18dp, "Healthy Food", "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium.");
        } else if(category.equalsIgnoreCase("DESSERT")){
            setDataToLayout(R.drawable.p5, "#a4c100", R.drawable.ic_local_dining_white_18dp, "Sweet", "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium.");
        }
    }

    private void setDataToLayout(int foodBgImg, String circleColor, int categoryIconImg, String headlineText, String descriptionText){
        foodBg.setImageResource(foodBgImg);
        circleBg.setColorFilter(Color.parseColor(circleColor));
        categoryIcon.setImageResource(categoryIconImg);
        cardView.setBackgroundColor(Color.parseColor(circleColor));
        headline.setText(headlineText);
        description.setText(descriptionText);
    }

}
