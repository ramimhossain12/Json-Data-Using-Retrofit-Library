package com.example.jsondatausingretrofitlibrary;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder extends RecyclerView.ViewHolder {

    TextView name,hobby;
    public DataViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.nameID);
        hobby = itemView.findViewById(R.id.hobbyID);
    }
}
