package com.example.aakash.materialdesign.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.aakash.materialdesign.R;
import com.example.aakash.materialdesign.activity.ActivitiesDetails;
import com.example.aakash.materialdesign.adapter.ActivtiesAdapter;
import com.example.aakash.materialdesign.model.ActivitiesModel;
import com.example.aakash.materialdesign.utils.CustomItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ActivitesFragment extends Fragment implements CustomItemClickListener {

    List<ActivitiesModel> activitiesModelList;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager gridLayoutManager;
    ActivtiesAdapter activtiesAdapter;
    GridView gridView;
    final int GRID = 0;




    public ActivitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_activites, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.fragment_activities_rv);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);

        activitiesModelList = new ArrayList<>();
        activitiesModelList.add(new ActivitiesModel(R.drawable.music,"Music"));
        activitiesModelList.add(new ActivitiesModel(R.drawable.dance,"Dance"));
        activitiesModelList.add(new ActivitiesModel(R.drawable.sports,"Sports"));
        activitiesModelList.add(new ActivitiesModel(R.drawable.camps,"Camps"));
        activitiesModelList.add(new ActivitiesModel(R.drawable.adult_activity,"Adult Activity"));
        activitiesModelList.add(new ActivitiesModel(R.drawable.artncraft,"Art and Craft"));
        activitiesModelList.add(new ActivitiesModel(R.drawable.fitness_gym,"Fitness"));
        activitiesModelList.add(new ActivitiesModel(R.drawable.therapuetic,"Therapeutic"));
        activitiesModelList.add(new ActivitiesModel(R.drawable.aqautic,"Aquatic"));
        activitiesModelList.add(new ActivitiesModel(R.drawable.preschool,"PreSchool"));

        activtiesAdapter =new ActivtiesAdapter(GRID,activitiesModelList,this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(activtiesAdapter);
        activtiesAdapter.notifyDataSetChanged();
        Log.e("hello",activitiesModelList.size()+"");


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onItemClick(View v, int position) {
        ActivitiesModel activitiesModel = activitiesModelList.get(position);
        Intent intent=new Intent(getActivity(), ActivitiesDetails.class);
        //add data to the Intent object
        intent.putExtra("text", activitiesModelList.get(position).getText().toString());
        //start the second activity
        startActivity(intent);


    }
}
