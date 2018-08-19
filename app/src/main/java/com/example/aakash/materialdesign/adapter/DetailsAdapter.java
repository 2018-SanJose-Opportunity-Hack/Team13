package com.example.aakash.materialdesign.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.aakash.materialdesign.R;
import com.example.aakash.materialdesign.model.DetailsModel;
import com.example.aakash.materialdesign.utils.CustomItemClickListener;

import java.util.List;

public class DetailsAdapter  extends RecyclerView.Adapter<DetailsAdapter.ViewHolder> {

    Context mContext;
    List<DetailsModel> detailsModels;
    //CustomItemClickListener customItemClickListener;


    public DetailsAdapter(Context mContext, List<DetailsModel> detailsModels) {
        this.mContext = mContext;
        this.detailsModels = detailsModels;
    }

    public DetailsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the list row as a view item
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activities_list, parent, false);

        final ViewHolder mViewHolder = new ViewHolder(itemView);

        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final DetailsModel detailsModel = detailsModels.get(position);
        holder.classTitle.setText(detailsModel.getTitle());
        holder.time_date.setText(detailsModel.getDate() + " - " +  detailsModel.getTime());
        holder.classId.setText(detailsModel.getClassId());
        holder.location.setText(detailsModel.getLocation());

        holder.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(detailsModel.getRegisterUrl()));
                mContext.startActivity(browserIntent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return detailsModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

       TextView classTitle,time_date,classId,location;
       Button register;

        public ViewHolder(View itemView) {
            super(itemView);
            classTitle = itemView.findViewById(R.id.class_title);
            time_date = itemView.findViewById(R.id.class_time);
            classId = itemView.findViewById(R.id.class_id);
            location = itemView.findViewById(R.id.class_location);
            register = itemView.findViewById(R.id.register_btn);

        }
    }
    }


