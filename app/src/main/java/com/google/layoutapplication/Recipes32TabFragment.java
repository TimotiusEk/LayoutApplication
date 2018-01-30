package com.google.layoutapplication;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.astuetz.PagerSlidingTabStrip;


/**
 * A simple {@link Fragment} subclass.
 */
public class Recipes32TabFragment extends Fragment {
    private PagerSlidingTabStrip tabLayout;
    private ViewPager viewPager;
    private static int int_items = 2;


    public Recipes32TabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recipes32_tab, container, false);
        tabLayout = (PagerSlidingTabStrip ) v.findViewById(R.id.tabs_recipes32);
        viewPager = (ViewPager) v.findViewById(R.id.viewpager_recipes32);

        viewPager.setAdapter(new MyAdapter(getActivity().getSupportFragmentManager()));

        tabLayout.setViewPager(viewPager);


        tabLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.EDGE_LEFT || motionEvent.getAction() == MotionEvent.EDGE_RIGHT) {
                    Toast.makeText(getActivity(), "scrolled", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
        // Inflate the layout for this fragment
        return v;
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return fragment with respect to Position .
         */

        @Override
        public Fragment getItem(int position)
        {
            switch (position){
                case 0 : return new Recipes32Fragment("SALAD");
                case 1 : return new Recipes32Fragment("DESSERT");
            }
            return null;
        }

        @Override
        public int getCount() {

            return int_items;

        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position){
                case 0 :
                    return "SALAD";
                case 1 :
                    return "DESSERT";
            }
            return null;
        }

    }

}
