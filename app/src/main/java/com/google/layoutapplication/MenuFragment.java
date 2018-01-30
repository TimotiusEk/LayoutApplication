package com.google.layoutapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {
    private GridView gridView;
    private ArrayList<Recipe> recipes;
    private int layout;
    private ImageView categoryImg;
    private TextView categoryName;
    private TextView categoryDesc;


    public MenuFragment() {
        // Required empty public constructor
    }

    public MenuFragment(int layout) {
        this.layout = layout;
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu, null);
        recipes = new ArrayList<>();
        gridView = (GridView) view.findViewById(R.id.grid_view);

        categoryImg = (ImageView) view.findViewById(R.id.category_img);
        categoryName = (TextView) view.findViewById(R.id.category_name);
        categoryDesc = (TextView) view.findViewById(R.id.category_desc);

        MenuAdapter menuAdapter = new MenuAdapter(recipes, getActivity());

        if(layout == 1){
            inflateFirstLayout();
        } else if(layout == 2){
            inflateSecondLayout();
        } else if(layout == 3){
            inflateThirdLayout();
        } else if(layout == 4){
            inflateFourthLayout();
        }

        gridView.setAdapter(menuAdapter);
        // Inflate the layout for this fragment
        return view;
    }

    public void inflateFirstLayout(){
        categoryImg.setImageResource(R.drawable.p13);
        categoryName.setText("Salad");
        categoryDesc.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.");
        recipes.add(new Recipe(R.drawable.p4, "Lorem Ipsum", "10 minutes"));
        recipes.add(new Recipe(R.drawable.p2, "Lorem Ipsum", "1 hour and 30 minutes"));
        recipes.add(new Recipe(R.drawable.p1, "Lorem Ipsum", "3 hours and 25 minutes"));
    }

    public void inflateSecondLayout(){
        categoryImg.setImageResource(R.drawable.p9);
        categoryName.setText("Fruit");
        categoryDesc.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.");
        recipes.add(new Recipe(R.drawable.p3, "Lorem Ipsum", "10 minutes"));
        recipes.add(new Recipe(R.drawable.p5, "Lorem Ipsum", "1 hour and 30 minutes"));
        recipes.add(new Recipe(R.drawable.p6, "Lorem Ipsum", "3 hours and 25 minutes"));
    }

    public void inflateThirdLayout(){
        categoryImg.setImageResource(R.drawable.p7);
        categoryName.setText("Fish");
        categoryDesc.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.");
        recipes.add(new Recipe(R.drawable.p7, "Lorem Ipsum", "10 minutes"));
        recipes.add(new Recipe(R.drawable.p8, "Lorem Ipsum", "1 hour and 30 minutes"));
        recipes.add(new Recipe(R.drawable.p9, "Lorem Ipsum", "3 hours and 25 minutes"));
    }

    public void inflateFourthLayout(){
        categoryImg.setImageResource(R.drawable.p1);
        categoryName.setText("Chicken");
        categoryDesc.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.");
        recipes.add(new Recipe(R.drawable.p10, "Lorem Ipsum", "10 minutes"));
        recipes.add(new Recipe(R.drawable.p11, "Lorem Ipsum", "1 hour and 30 minutes"));
        recipes.add(new Recipe(R.drawable.p12, "Lorem Ipsum", "3 hours and 25 minutes"));
    }

}
