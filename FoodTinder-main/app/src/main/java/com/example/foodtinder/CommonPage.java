package com.example.foodtinder;


import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class CommonPage extends Fragment {

    public CommonPage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_common_page, container, false);

        ImageButton iButt = (ImageButton) view.findViewById(R.id.friend1);
        TextView topText = (TextView) view.findViewById(R.id.F1R1);
        TextView btmText = (TextView) view.findViewById(R.id.F1R2);
        topText.setVisibility(View.INVISIBLE);
        btmText.setVisibility(View.INVISIBLE);
        iButt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                topText.setVisibility(View.INVISIBLE);
                btmText.setVisibility(View.INVISIBLE);
                topText.setText("Buffalo Wild Wings");
                btmText.setText("Pizza Hut");
                topText.setVisibility(View.VISIBLE);
                btmText.setVisibility(View.VISIBLE);
            }
        });
        ImageButton iButt2 = (ImageButton) view.findViewById(R.id.friend2);
        iButt2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                topText.setVisibility(View.INVISIBLE);
                btmText.setVisibility(View.INVISIBLE);
                topText.setText("Poor Calvin's");
                btmText.setText("Tin Lizzy's");
                topText.setVisibility(View.VISIBLE);
                btmText.setVisibility(View.VISIBLE);
            }
        });
        ImageButton iButt3 = (ImageButton) view.findViewById(R.id.friend3);
        iButt3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                topText.setVisibility(View.INVISIBLE);
                btmText.setVisibility(View.INVISIBLE);
                topText.setText("McDonald's");
                btmText.setText("");
                topText.setVisibility(View.VISIBLE);

            }
        });
        return view;
    }
}