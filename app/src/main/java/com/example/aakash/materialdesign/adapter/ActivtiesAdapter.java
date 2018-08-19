package com.example.aakash.materialdesign.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aakash.materialdesign.R;
import com.example.aakash.materialdesign.model.ActivitiesModel;
import com.example.aakash.materialdesign.utils.CustomItemClickListener;

import java.util.List;

public class ActivtiesAdapter extends RecyclerView.Adapter<ActivtiesAdapter.ViewHolder> {

        int type;
        List<ActivitiesModel> activitiesModelList;
        CustomItemClickListener customItemClickListener;
        final int GRID = 0;

    public ActivtiesAdapter(int type, List<ActivitiesModel> activitiesModelList, CustomItemClickListener customItemClickListener) {
        this.type = type;
        this.activitiesModelList = activitiesModelList;
        this.customItemClickListener = customItemClickListener;
    }

    @Override
public ActivtiesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        if (viewType == GRID) {
        // Inflate the grid cell as a view item
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_activities, parent, false);
        } else {
        // Inflate the list row as a view item
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_activities, parent, false);
        }

        return new ViewHolder(itemView, viewType);
        }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ActivitiesModel activitiesModel = activitiesModelList.get(position);
        holder.textView.setText(activitiesModel.getText());
        holder.imageView.setImageResource(activitiesModel.getImageId());
        ApplyClickEvent(holder,position);
    }

    private void ApplyClickEvent(ViewHolder holder, final int position) {
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customItemClickListener.onItemClick(view,position);
            }
        });

    }

@Override
public int getItemViewType(int position) {
    if (type == GRID) {
        }
    return GRID;
}


@Override
public int getItemCount() {
        return activitiesModelList.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder {

   ImageView imageView;
   TextView textView;

    public ViewHolder(View itemView, int viewType) {
        super(itemView);
        if (type == GRID) {
            textView = itemView.findViewById(R.id.list_activities_tv);
            imageView = itemView.findViewById(R.id.list_activities_iv);
        }
    }
}
}

