package com.example.homework_33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeViewHolder> {


    public AnimeAdapter(ArrayList<String> animeList) {
        this.animeList = animeList;
    }
    private ArrayList<String> animeList;
    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {
        holder.bind(animeList.get(position));
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }
}
