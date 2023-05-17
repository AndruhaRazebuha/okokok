package com.example.car_repair_realese;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class SecondFragment extends Fragment {

    private ImageButton settingsButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

// Найти кнопку настройки по ее ID
        settingsButton = view.findViewById(R.id.button_settings);

// Установить обработчик событий для кнопки настройки
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Создать интент для перехода на активность SettingsProfileActivity
                Intent intent = new Intent(getActivity(), SettingsProfileActivity.class);
                startActivity(intent);
            }
        });
        // Найти кнопку "выполненные заказы" по ее ID
        Button doneOrdersButton = view.findViewById(R.id.button);

// Установить обработчик событий для кнопки "выполненные заказы"
        doneOrdersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Создать интент для перехода на активность DoneOrdersActivity
                Intent intent = new Intent(getActivity(), DoneOrdersActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}