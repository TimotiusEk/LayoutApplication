package com.google.layoutapplication;


import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeFragment extends Fragment {
    private ListView listView;
    private Button nextBtn;
    private MainActivity main;
    private int layout;
    private View view;
    private Button prevBtn;
    private ImageButton circleBtn;

    RecipeFragment() {

    }

    public RecipeFragment(int layout) {
        this.layout = layout;
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        main = (MainActivity) getActivity();

        if (layout == 1) {
            view = inflater.inflate(R.layout.fragment_recipe, null);
            listView = (ListView) view.findViewById(R.id.lv_recipe);
            nextBtn = (Button) view.findViewById(R.id.next_layout_btn);
            ArrayList<Recipe> recipes = new ArrayList<Recipe>();
            recipes.add(new Recipe(R.drawable.p13, R.drawable.p11, "Strawberry & Cereals", "Breakfast", 2));
            recipes.add(new Recipe(R.drawable.p2, R.drawable.p12, "Salad Light", "Breakfast", 23));
            recipes.add(new Recipe(R.drawable.p1, R.drawable.p3, "Honey", "Lunch", 223));
            RecipeAdapter recipeAdapter = new RecipeAdapter(getActivity(), recipes, 1);
            listView.setAdapter(recipeAdapter);

            nextBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    main.changeFragment(new RecipeFragment(2));
                }
            });
        } else if (layout == 2) {
            view = inflater.inflate(R.layout.fragment_recipe2, null);
            listView = (ListView) view.findViewById(R.id.lv_recipe_2);
            ArrayList<Recipe> recipes = new ArrayList<>();
            prevBtn = (Button) view.findViewById(R.id.prev_layout_btn_2);
            nextBtn = (Button) view.findViewById(R.id.next_layout_btn_2);
            recipes.add(new Recipe(R.drawable.p4, "de Finibus Bonorum", "10 minutes"));
            recipes.add(new Recipe(R.drawable.p9, "os et accusamus", "1 hour 30 minutes"));
            recipes.add(new Recipe(R.drawable.p10, "Et harum quidem", "10 minutes"));
            RecipeAdapter recipeAdapter = new RecipeAdapter(getActivity(), recipes, 2);
            listView.setAdapter(recipeAdapter);

            prevBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    main.changeFragment(new RecipeFragment(1));
                }
            });

            nextBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    main.changeFragment(new RecipeFragment(3));
                }
            });
        } else if (layout == 3) {
            view = inflater.inflate(R.layout.fragment_recipe3, null);
            listView = (ListView) view.findViewById(R.id.lv_recipe_3);
            prevBtn = (Button) view.findViewById(R.id.prev_layout_btn_3);
            ArrayList<Recipe> recipes = new ArrayList<>();
            RecipeAdapter recipeAdapter = new RecipeAdapter(getActivity(), recipes,3);
            listView.setAdapter(recipeAdapter);

            recipes.add(new Recipe(R.drawable.p4, "de Finibus Bonorum", "Lunch","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum." ,R.drawable.p10, "Master Chef", 28, 120));
            recipes.add(new Recipe(R.drawable.p1, "os et accusamus", "Lunch","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum." ,R.drawable.p9, "Rookie Chef", 218, 1200));
            recipes.add(new Recipe(R.drawable.p3, "os et accusamus", "Lunch","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum." ,R.drawable.p11, "Rattatouile", 2, 0));

            prevBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    main.changeFragment(new RecipeFragment(2));
                }
            });
        }
        // Inflate the layout for this fragment
        return view;
    }

}
