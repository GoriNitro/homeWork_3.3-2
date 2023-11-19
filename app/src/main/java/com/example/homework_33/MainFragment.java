package com.example.homework_33;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rvAnime;
    private AnimeAdapter adapter;
    private ArrayList<String> animeList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initAdapter();

    }
    private void initAdapter() {
        adapter = new AnimeAdapter(animeList);
        rvAnime.setAdapter(adapter);
    }

    private void loadData() {
        animeList.add("Милый во франксе");
        animeList.add("Мягия и мускулы");
        animeList.add("Звездное дитя");
        animeList.add("Адский рай");
        animeList.add("Владыка демонов");
        animeList.add("Оверлорд");
        animeList.add("Тетрадь смерти");
        animeList.add("Берсерк");
        animeList.add("Блич");
        animeList.add("Обещанный неверленд");
        animeList.add("Шарлота");
        animeList.add("7 смертных грехов");
        animeList.add("Дхд");
        animeList.add("Нежить и неудача");
        animeList.add("Моя геройская академияф");
        animeList.add("Магическая битва");
        animeList.add("Атака титанов");
        animeList.add("Ван пис");
        animeList.add("Мастера меча онлайн");
        animeList.add("Клинок рассекающий демонов");
        animeList.add("Драгонболл");
        animeList.add("Ван панч мен");
        animeList.add("Наруто");
        animeList.add("Лукизм");
    }

    private void initView() {
        rvAnime = requireActivity().findViewById(R.id.rv_anime);
    }
}
