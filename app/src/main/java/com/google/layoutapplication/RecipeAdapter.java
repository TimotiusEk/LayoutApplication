package com.google.layoutapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by TimotiusEk on 3/13/2017.
 */

public class RecipeAdapter extends ArrayAdapter<Recipe> {

    private int layout;
    public RecipeAdapter(Context context, ArrayList<Recipe> recipes, int layout) {
        super(context, 0, recipes);
        this.layout = layout;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Recipe recipe = getItem(position);
        if(convertView == null){
            if(layout == 1) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_layout_recipes, parent, false);
            } else if(layout == 2){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_layout_recipes_2, parent, false);
            } else if(layout == 3){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_layout_recipes_3, parent, false);
            }
        }

        if(layout == 1) {
            CircleImageView profilePic = (CircleImageView) convertView.findViewById(R.id.profile_pic);
            TextView foodName = (TextView) convertView.findViewById(R.id.food_name);
            TextView foodType = (TextView) convertView.findViewById(R.id.food_type);
            ImageView foodPic = (ImageView) convertView.findViewById(R.id.food_bg);
            TextView likesNumber = (TextView) convertView.findViewById(R.id.likes_number);

            profilePic.setImageResource(recipe.getProfile_pic());
            foodName.setText(recipe.getName());
            foodType.setText(recipe.getType());
            foodPic.setImageResource(recipe.getImage());
            likesNumber.setText(String.valueOf(recipe.getLikes()));
        } else if(layout == 2){
            TextView foodName = (TextView) convertView.findViewById(R.id.food_name_2);
            ImageView foodPic = (ImageView) convertView.findViewById(R.id.food_bg_2);
            TextView cookDuration = (TextView) convertView.findViewById(R.id.cook_duration);

            foodName.setText(recipe.getName());
            foodPic.setImageResource(recipe.getImage());
            cookDuration.setText(recipe.getDuration());
        } else if(layout == 3){


            ImageView foodPic = (ImageView) convertView.findViewById(R.id.food_bg_3);
            TextView foodName = (TextView) convertView.findViewById(R.id.food_name_3);
            TextView foodType = (TextView) convertView.findViewById(R.id.food_type_3);
            TextView foodDescription = (TextView) convertView.findViewById(R.id.food_description_3);
            CircleImageView profilePic = (CircleImageView) convertView.findViewById(R.id.profile_pic_3);
            TextView username = (TextView) convertView.findViewById(R.id.username_3);
            TextView likesNumber = (TextView) convertView.findViewById(R.id.likes_number_3);
            TextView chatsNumber = (TextView) convertView.findViewById(R.id.chats_number_3);
            ImageButton circleBtn = (ImageButton) convertView.findViewById(R.id.circle_btn);

            foodPic.setImageResource(recipe.getImage());
            foodName.setText(recipe.getName());
            foodType.setText(recipe.getType());
            foodDescription.setText(recipe.getDescription());
            profilePic.setImageResource(recipe.getProfile_pic());
            username.setText(recipe.getUsername());
            likesNumber.setText(String.valueOf(recipe.getLikes()));
            chatsNumber.setText(String.valueOf(recipe.getChats()));

            // Read your drawable from somewhere
            Drawable dr = getContext().getResources().getDrawable(R.drawable.ic_local_dining_white_18dp);
            Bitmap bitmap = ((BitmapDrawable) dr).getBitmap();
            // Scale it to 50 x 50
            Drawable d = new BitmapDrawable(getContext().getResources(), Bitmap.createScaledBitmap(bitmap, 160, 160, true));
            // Set your new, scaled drawable "d"
            circleBtn.setImageDrawable(d);
        }

        return convertView;
    }
}
