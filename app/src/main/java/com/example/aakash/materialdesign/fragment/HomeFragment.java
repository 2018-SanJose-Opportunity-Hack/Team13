package com.example.aakash.materialdesign.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.aakash.materialdesign.R;
import com.example.aakash.materialdesign.adapter.SlidingImage_Adapter;
import com.example.aakash.materialdesign.model.ImageModel;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {

    private static ViewPager mPager;
    CirclePageIndicator indicator;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<ImageModel> imageModelArrayList;
    private int[] myImageList = new int[]{R.drawable.slide1, R.drawable.slide2, R.drawable.slide3, R.drawable.slide4};
    View view;
    TextView tv1,tv2;
    Button btn;
    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mPager = view.findViewById(R.id.pager);
        tv2 = view.findViewById(R.id.fragment_home_tv_2);
        indicator = (CirclePageIndicator)
                view.findViewById(R.id.indicator);
        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.fragment_home_tv);
       tv2.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        textView.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        imageModelArrayList = new ArrayList<>();
        imageModelArrayList = populateList();


        init();

    }

        private ArrayList<ImageModel> populateList () {

            ArrayList<ImageModel> list = new ArrayList<>();

            for (int i = 0; i < 4; i++) {
                ImageModel imageModel = new ImageModel();
                imageModel.setImage_drawable(myImageList[i]);
                list.add(imageModel);
            }

            return list;
        }

        private void init() {


            mPager.setAdapter(new SlidingImage_Adapter(getActivity(),imageModelArrayList));



            indicator.setViewPager(mPager);

            final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
            indicator.setRadius(5 * density);

            NUM_PAGES =imageModelArrayList.size();

            // Auto start of viewpager
            final Handler handler = new Handler();
            final Runnable Update = new Runnable() {
                public void run() {
                    if (currentPage == NUM_PAGES) {
                        currentPage = 0;
                    }
                    mPager.setCurrentItem(currentPage++, true);
                }
            };
            Timer swipeTimer = new Timer();
            swipeTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    handler.post(Update);
                }
            }, 1500, 1500);

            // Pager listener over indicator
            indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                @Override
                public void onPageSelected(int position) {
                    currentPage = position;

                }

                @Override
                public void onPageScrolled(int pos, float arg1, int arg2) {

                }

                @Override
                public void onPageScrollStateChanged(int pos) {

                }
            });

        }



    }

