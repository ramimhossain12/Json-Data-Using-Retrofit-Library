package com.example.jsondatausingretrofitlibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {


    private List<OurDataSet> list;
    private Context context;

    public DataAdapter(List<OurDataSet> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {

        OurDataSet currendata = list.get(position);
        holder.name.setText(currendata.getName());
        holder.hobby.setText(currendata.getHobby());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
