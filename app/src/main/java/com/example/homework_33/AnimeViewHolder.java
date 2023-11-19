package com.example.homework_33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimeViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;

    public AnimeViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);
    }

    public void bind(String name) {
        tvName.setText(name);
    }
}
