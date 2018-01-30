package com.google.layoutapplication;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by TimotiusEk on 3/15/2017.
 */

public class CardsDataAdapter extends ArrayAdapter<String> {
    public CardsDataAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, final View contentView, ViewGroup parent){
        //supply the layout for your card
        final TextView v = (TextView)(contentView.findViewById(R.id.content));
        CardView cv = (CardView) contentView.findViewById(R.id.cardview);

        cv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ExploreActivity exploreActivity = new ExploreActivity();
                exploreActivity.disablePaging();
                return false;
            }
        });
        v.setText(getItem(position));
        return contentView;
    }
}
