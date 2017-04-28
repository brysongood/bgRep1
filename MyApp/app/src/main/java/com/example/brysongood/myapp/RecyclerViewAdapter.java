package com.example.brysongood.myapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by brysongood on 4/26/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    String[][] SubjectValues;
    Context context;
    View view1;
    ViewHolder viewHolder1;
    TextView textView;

    public RecyclerViewAdapter(Context context1, String[][] SubjectValues1){

        SubjectValues = SubjectValues1;
        context = context1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView vHikeName;
        public TextView vHikeLocation;
        public TextView vHikeDistance;

        public ViewHolder(View v){

            super(v);

            vHikeName = (TextView)v.findViewById(R.id.subject_hike_name);
            vHikeLocation = (TextView)v.findViewById(R.id.subject_hike_location);
            vHikeDistance = (TextView)v.findViewById(R.id.subject_hike_distance);
        }
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        view1 = LayoutInflater.from(context).inflate(R.layout.recyclerview_items,parent,false);

        viewHolder1 = new ViewHolder(view1);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){

        holder.vHikeName.setText(SubjectValues[position][0]);
        holder.vHikeLocation.setText(SubjectValues[position][1]);
        holder.vHikeDistance.setText(SubjectValues[position][2]);
    }

    @Override
    public int getItemCount(){

        return SubjectValues.length;
    }
}
