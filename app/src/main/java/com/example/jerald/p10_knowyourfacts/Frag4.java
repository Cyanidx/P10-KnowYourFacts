package com.example.jerald.p10_knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag4 extends Fragment {
    ImageView iv;
    Button btnChange;

    public Frag4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag4, container, false);
        iv = (ImageView)view.findViewById(R.id.iv);
        String imageUrl = "http://68.media.tumblr.com/6961bf4827c1626518e156cd8df6fe62/tumblr_otq1x9z3EK1roqv59o1_500.png";
        Picasso.with(getActivity()).load(imageUrl).into(iv);
        btnChange = (Button)view.findViewById(R.id.btnChange);


        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getView().setBackgroundColor(getRandomColor());
            }
        });
        return view;
    }
    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

}
