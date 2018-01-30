package com.google.layoutapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.wenchao.cardstack.CardStack;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {
    CardStack mCardStack;
    CardsDataAdapter mCardAdapter;
    private ImageView foodBg;

    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_explore, container, false);
        foodBg = (ImageView) v.findViewById(R.id.food_bg_fragment_explore);
        foodBg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ExploreActivity ea = new ExploreActivity();
//                if (getActivity() instanceof ExploreActivity){
                    ea.enablePaging();
//                }
                Log.d("getActivity", String.valueOf(getActivity()));
                return false;
            }
        });
        mCardStack = (CardStack) v.findViewById(R.id.card_stack);

        mCardStack.setContentResource(R.layout.card_content);
        mCardStack.setStackMargin(20);

        mCardStack.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                ExploreActivity exploreActivity = new ExploreActivity();

                    exploreActivity.enablePaging();

                return false;
            }
        });

        mCardAdapter = new CardsDataAdapter(getContext(),0);
        mCardAdapter.add("test1");
        mCardAdapter.add("test2");
        mCardAdapter.add("test3");
        mCardAdapter.add("test4");
        mCardAdapter.add("test5");

        mCardStack.setAdapter(mCardAdapter);
        // Inflate the layout for this fragment
        return v;
    }



}
