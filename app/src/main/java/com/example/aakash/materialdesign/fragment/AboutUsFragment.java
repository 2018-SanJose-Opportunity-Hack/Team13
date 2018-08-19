package com.example.aakash.materialdesign.fragment;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aakash.materialdesign.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {

    TextView textView, textView1;

    public AboutUsFragment() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_about_us, container, false);
        textView =   view.findViewById(R.id.vision_tv_1);
        textView1 = view.findViewById(R.id.vision_tv_2);

        textView.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        textView1.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);

        return view;
    }

}
