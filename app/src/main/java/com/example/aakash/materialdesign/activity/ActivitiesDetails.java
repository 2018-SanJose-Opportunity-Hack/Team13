package com.example.aakash.materialdesign.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aakash.materialdesign.R;
import com.example.aakash.materialdesign.adapter.DetailsAdapter;
import com.example.aakash.materialdesign.model.DetailsModel;

import java.util.ArrayList;
import java.util.List;

public class ActivitiesDetails extends AppCompatActivity {

    WebView webView;
    ImageView imageView;
    TextView textView, textView1;
    RecyclerView recyclerView;
    List<DetailsModel> detailsModelList;
    RecyclerView.LayoutManager linearlayoutManager;
    DetailsAdapter detailsAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent i = getIntent();
        String text = i.getStringExtra("text");
        Log.e("detail", text + "");

        webView = findViewById(R.id.activity_details_wv);
        imageView = findViewById(R.id.activity_details_iv);
        textView = findViewById(R.id.action_details_tv_1);
        textView1 = findViewById(R.id.action_details_tv);
        recyclerView = findViewById(R.id.activity_details_rv);
        Activities act = new Activities();

        switch (text) {
            case "Music":
                act.Music();
                break;
            case "Dance":
                act.Dance();
                break;
            case "Sports":
                act.Sports();
                break;
            case "Camps":
                act.Camps();
                break;
            case "Adult Activity":
                act.Adult();
                break;
            case "Art and Craft":
                act.ArtCraft();
                break;
            case "Fitness":
                act.Fitness();
                break;
            case "Therapeutic":
                act.Therapeutics();
                break;
            case "Aquatic":
                act.Aquatic();
                break;
            case "PreSchool":
                act.preschool();
                break;


        }
    }


    protected class Activities {

        public void Music() {
            webView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);

            String frameVideo = "<html><body><iframe width=100% height=\"300\" src=\"https://www.youtube.com/embed/LIpJJtAV4A4\" frameborder=\"0\" ></iframe></body></html>";

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadData(frameVideo, "text/html", "utf-8");

            textView1.setText(R.string.music_title);
            textView.setText(R.string.music_desc);

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Opportunity Hack_Music", "August 19", "12:00", "1234", "Pay Pal", "http://sjregistration.com"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();

        }

        public void Dance() {
            webView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);

            String frameVideo = "<html><body><iframe width=100% height=\"300\" src=\"https://www.youtube.com/embed/LfxMZ-SOe_A\" frameborder=\"0\" ></iframe></body></html>";

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadData(frameVideo, "text/html", "utf-8");

            textView1.setText(R.string.dance_title);
            textView.setText(R.string.dance_desc);

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Opportunity Hack_Dance", "August 19", "12:00", "1234", "Pay Pal", "http://sjregistration.com"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();

        }

        public void Sports() {
            webView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);

            String frameVideo = "<html><body><iframe width=100% height=\"300\" src=\"https://www.youtube.com/embed/-bFMjV1wup8\" frameborder=\"0\" ></iframe></body></html>";

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadData(frameVideo, "text/html", "utf-8");

            textView1.setText(R.string.sports_title);
            textView.setText(R.string.music_desc);

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Opportunity Hack_Sports", "August 19", "12:00", "1234", "Pay Pal", "http://sjregistration.com"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();

        }

        public void Camps() {
            webView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);

            String frameVideo = "<html><body><iframe width=100% height=\"300\" src=\"https://www.youtube.com/embed/RYBl_LMVFtk\" frameborder=\"0\" ></iframe></body></html>";

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadData(frameVideo, "text/html", "utf-8");

            textView1.setText(R.string.camp_title);
            textView.setText(R.string.camp_desc);

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Opportunity Hack_Camps", "August 19", "12:00", "1234", "Pay Pal", "http://sjregistration.com"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();

        }

        public void Adult() {
            webView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);

            String frameVideo = "<html><body><iframe width=100% height=\"300\" src=\"https://www.youtube.com/embed/yunuDNVAqJE\" frameborder=\"0\" ></iframe></body></html>";

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadData(frameVideo, "text/html", "utf-8");

            textView1.setText(R.string.adult_title);
            textView.setText(R.string.adult_desc);

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Opportunity Hack_Adults", "August 19", "12:00", "1234", "Pay Pal", "http://sjregistration.com"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();
        }
        public void ArtCraft(){
            webView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);

            /*String frameVideo = "<html><body>Video From YouTube<br><iframe width=100% height=\"300\" src=\"\"\"https://www.youtube.com/embed/yunuDNVAqJE\" frameborder=\"0\" ></iframe></body></html>";

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadData(frameVideo, "text/html", "utf-8");*/
            imageView.setImageResource(R.drawable.art_craft);

            textView1.setText(R.string.art_craft_title);
            textView.setText(R.string.art_craft_desc);

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Opportunity Hack_Arts n Crafts", "August 19", "12:00", "1234", "Pay Pal", "http://sjregistration.com"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();

        }

        public void Fitness(){
            webView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);

            /*String frameVideo = "<html><body>Video From YouTube<br><iframe width=100% height=\"300\" src=\"\"\"https://www.youtube.com/embed/yunuDNVAqJE\" frameborder=\"0\" ></iframe></body></html>";

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadData(frameVideo, "text/html", "utf-8");*/
            imageView.setImageResource(R.drawable.fitness);

            textView1.setText(R.string.fitness_title);
            textView.setText(R.string.fitness_desc);

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Opportunity Hack_Fitness", "August 19", "12:00", "1234", "Pay Pal", "http://sjregistration.com"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();


        }
        public void Therapeutics(){
            webView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);

            /*String frameVideo = "<html><body>Video From YouTube<br><iframe width=100% height=\"300\" src=\"\"\"https://www.youtube.com/embed/yunuDNVAqJE\" frameborder=\"0\" ></iframe></body></html>";

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadData(frameVideo, "text/html", "utf-8");*/
            imageView.setImageResource(R.drawable.therapeutic_detail);

            textView1.setText(R.string.therapeutics_title);
            textView.setText(R.string.therapeutics_desc);

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Opportunity Hack_therapeutics", "August 19", "12:00", "1234", "Pay Pal", "http://sjregistration.com"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();


        }

        public void Aquatic(){
            webView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);

            /*String frameVideo = "<html><body>Video From YouTube<br><iframe width=100% height=\"300\" src=\"\"\"https://www.youtube.com/embed/yunuDNVAqJE\" frameborder=\"0\" ></iframe></body></html>";

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadData(frameVideo, "text/html", "utf-8");*/
            imageView.setImageResource(R.drawable.aquatic_detail);

            textView1.setText(R.string.aquatic_title);
            textView.setText(R.string.Aquatic_desc);

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Opportunity Hack_Aquatic", "August 19", "12:00", "1234", "Pay Pal", "http://sjregistration.com"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();


        }

        public void preschool(){
            webView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);

            /*String frameVideo = "<html><body>Video From YouTube<br><iframe width=100% height=\"300\" src=\"\"\"https://www.youtube.com/embed/yunuDNVAqJE\" frameborder=\"0\" ></iframe></body></html>";

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadData(frameVideo, "text/html", "utf-8");*/
            imageView.setImageResource(R.drawable.preschool_detail);

            textView1.setText(R.string.preschool_title);
            textView.setText(R.string.preschool_desc);

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Opportunity Hack_preschool", "August 19", "12:00", "1234", "Pay Pal", "http://sjregistration.com"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();


        }

    }
}
