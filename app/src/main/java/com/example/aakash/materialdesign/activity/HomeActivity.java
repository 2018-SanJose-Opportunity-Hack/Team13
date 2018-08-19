package com.example.aakash.materialdesign.activity;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.aakash.materialdesign.R;
import com.example.aakash.materialdesign.adapter.SlidingImage_Adapter;
import com.example.aakash.materialdesign.fragment.ActivitesFragment;
import com.example.aakash.materialdesign.fragment.FragmentDrawer;
import com.example.aakash.materialdesign.fragment.ProfileFragment;
import com.example.aakash.materialdesign.model.ImageModel;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class HomeActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

    private Toolbar mtoolbar;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<ImageModel> imageModelArrayList;
    private int[] myImageList = new int[]{R.drawable.slide1, R.drawable.slide2, R.drawable.slide3,
            R.drawable.slide4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);
        Button mIdButtonHome = (Button)findViewById(R.id.redirect1);
        mIdButtonHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Create_Account"));
                startActivity(browserIntent);
            }
        });

        mtoolbar = findViewById(R.id.toolbar);
        imageModelArrayList = new ArrayList<>();
        imageModelArrayList = populateList();

        init();
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        FragmentDrawer drawerFragment = (FragmentDrawer) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mtoolbar);
        drawerFragment.setDrawerListener(this);

    }

    private ArrayList<ImageModel> populateList(){

        ArrayList<ImageModel> list = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            ImageModel imageModel = new ImageModel();
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;
    }

    private void init() {

        mPager =  findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(HomeActivity.this,imageModelArrayList));

        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        android.support.v4.app.Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new ProfileFragment();
                title = getString(R.string.title_home);
                break;
            case 1:
                fragment = new ActivitesFragment();
                title = getString(R.string.title_friends);
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }
}
