package com.example.aakash.materialdesign.activity;

import android.content.Intent;
import android.net.Uri;
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
import android.widget.Button;
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
    Button morebtn;

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
        morebtn = findViewById(R.id.btnmoreclasses);
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
            morebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=24&isSearch=true&applyFiltersDefaultValue=true"));
                    startActivity(browserIntent);
                }
            });
            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Beginning Piano & Keyboards", "Sept 12", "05:15", "212.2.0601", "Room 3", "https://apm.activecommunities.com/sanjoseparksandrec/ActiveNet_Login?params=aHR0cHM6Ly9hcG0uYWN0aXZlY29tbXVuaXRpZXMuY29tL3Nhbmpvc2VwYXJrc2FuZHJlYy9BY3RpdmVOZXRfUGFydGljaXBhbnQ/YWN0aXZpdHlfaWQ9NzYwNzc%3D"));
            detailsModelList.add(new DetailsModel("Continuing Guitar (Youth)", "Sept 13", "04:30", "214.2.0602", "Evergreen Cmty Ctr", "https://apm.activecommunities.com/sanjoseparksandrec/ActiveNet_Login?params=aHR0cHM6Ly9hcG0uYWN0aXZlY29tbXVuaXRpZXMuY29tL3Nhbmpvc2VwYXJrc2FuZHJlYy9BY3RpdmVOZXRfUGFydGljaXBhbnQ/YWN0aXZpdHlfaWQ9NzYzMDI%3D"));
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

            morebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=22&isSearch=true&applyFiltersDefaultValue=true"));
                    startActivity(browserIntent);
                }
            });

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Baby Ballet", "Sept 14", "10:10", "212.2.0201", "Room 2", "https://apm.activecommunities.com/sanjoseparksandrec/ActiveNet_Login?params=aHR0cHM6Ly9hcG0uYWN0aXZlY29tbXVuaXRpZXMuY29tL3Nhbmpvc2VwYXJrc2FuZHJlYy9BY3RpdmVOZXRfUGFydGljaXBhbnQ/YWN0aXZpdHlfaWQ9NzYwNzQ%3D"));
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

            morebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=19&isSearch=true&applyFiltersDefaultValue=true"));
                    startActivity(browserIntent);
                }
            });

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Advanced Futsal 7 to 8", "Nov 08", "04:30", "296.2.0820", "Bascom Cmty Ctr", "https://apm.activecommunities.com/sanjoseparksandrec/ActiveNet_Login?params=aHR0cHM6Ly9hcG0uYWN0aXZlY29tbXVuaXRpZXMuY29tL3Nhbmpvc2VwYXJrc2FuZHJlYy9BY3RpdmVOZXRfUGFydGljaXBhbnQ/YWN0aXZpdHlfaWQ9NzcwMzg%3D"));
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

            morebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=16&isSearch=true&applyFiltersDefaultValue=true"));
                    startActivity(browserIntent);
                }
            });

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

            morebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=31&isSearch=true&applyFiltersDefaultValue=true"));
                    startActivity(browserIntent);
                }
            });

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Antiques & Collectibles", "Oct 09", "01:00", "257.2.1802", "Camden Cmty Ctr", "https://apm.activecommunities.com/sanjoseparksandrec/ActiveNet_Login?params=aHR0cHM6Ly9hcG0uYWN0aXZlY29tbXVuaXRpZXMuY29tL3Nhbmpvc2VwYXJrc2FuZHJlYy9BY3RpdmVOZXRfUGFydGljaXBhbnQ/YWN0aXZpdHlfaWQ9NzY4NDE%3D"));
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

            morebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=14&isSearch=true&applyFiltersDefaultValue=true"));
                    startActivity(browserIntent);
                }
            });

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Art Start (child only", "Sept 11", "12:00", "252.2.0107", "Almaden Cmty Ctr", "https://apm.activecommunities.com/sanjoseparksandrec/ActiveNet_Login?params=aHR0cHM6Ly9hcG0uYWN0aXZlY29tbXVuaXRpZXMuY29tL3Nhbmpvc2VwYXJrc2FuZHJlYy9BY3RpdmVOZXRfUGFydGljaXBhbnQ/YWN0aXZpdHlfaWQ9NzY3ODE%3D"));
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

            morebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=23&isSearch=true&applyFiltersDefaultValue=true"));
                    startActivity(browserIntent);
                }
            });

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Gym Stars", "Sept 12", "05:00", "212.2.0808", "Multi-Purpose Room", "https://apm.activecommunities.com/sanjoseparksandrec/ActiveNet_Login?params=aHR0cHM6Ly9hcG0uYWN0aXZlY29tbXVuaXRpZXMuY29tL3Nhbmpvc2VwYXJrc2FuZHJlYy9BY3RpdmVOZXRfUGFydGljaXBhbnQ/YWN0aXZpdHlfaWQ9NzYwOTI%3D"));
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

            morebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=25&isSearch=true&applyFiltersDefaultValue=true"));
                    startActivity(browserIntent);
                }
            });

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Adapted Aerobics", "Sept 11", "10:30", "231.2.4110", "Seven Trees Cmty Ctr", "https://apm.activecommunities.com/sanjoseparksandrec/ActiveNet_Login?params=aHR0cHM6Ly9hcG0uYWN0aXZlY29tbXVuaXRpZXMuY29tL3Nhbmpvc2VwYXJrc2FuZHJlYy9BY3RpdmVOZXRfUGFydGljaXBhbnQ/YWN0aXZpdHlfaWQ9NzYyNjc%3D"));
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

            morebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=13&isSearch=true&applyFiltersDefaultValue=true"));
                    startActivity(browserIntent);
                }
            });

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("Adult Child Swim Lessons", "Aug 13", "03:00", "403.1.3718", "Camden Pool", "https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=13&isSearch=true&applyFiltersDefaultValue=true"));
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

            morebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://apm.activecommunities.com/sanjoseparksandrec/Activity_Search?ActivityCategoryID=20&isSearch=true&applyFiltersDefaultValue=true"));
                    startActivity(browserIntent);
                }
            });

            linearlayoutManager = new LinearLayoutManager(getApplicationContext());
            detailsModelList = new ArrayList<>();
            detailsModelList.add(new DetailsModel("SJ Rec Preschool Sess 1", "Aug 27", "09:00", "294.5.0314", "Calabazas Portable 1201 S. Blaney Avenue", "https://apm.activecommunities.com/sanjoseparksandrec/ActiveNet_Login?params=aHR0cHM6Ly9hcG0uYWN0aXZlY29tbXVuaXRpZXMuY29tL3Nhbmpvc2VwYXJrc2FuZHJlYy9BY3RpdmVOZXRfUGFydGljaXBhbnQ/YWN0aXZpdHlfaWQ9NzUzNzEmZTRxPTBjYzAwZGQwLTg5YTktNGRlMC1iZTUxLWJlOGY5ZDI3NTk5MCZlNHA9MGQwOTIyYTktOWY5Ny00MjJkLTk5YTktZjY5NTk2OWEwZjljJmU0dHM9MTUzNDY4ODQyNSZlNGM9YWN0aXZlJmU0ZT1zbmFuMTAwMDAwMDAwJmU0cnQ9U2FmZXR5bmV0JmU0aD0yYTE5NjY2OTk3MGIwOTZlMGE0MmFlOGViNmQyNmJjZg%3D%3D"));
            detailsAdapter = new DetailsAdapter(getApplicationContext(), detailsModelList);
            recyclerView.setLayoutManager(linearlayoutManager);
            recyclerView.setAdapter(detailsAdapter);
            detailsAdapter.notifyDataSetChanged();


        }

    }
}
