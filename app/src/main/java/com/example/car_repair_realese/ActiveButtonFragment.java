package com.example.car_repair_realese;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ActiveButtonFragment extends Fragment {


    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_active_button, container, false);

        button = view.findViewById(R.id.button_order);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Обработка события щелчка кнопки
                navigateToAnotherActivity();
            }
        });

        return view;
    }

    private void navigateToAnotherActivity() {
// Создание Intent для перехода на другую активность
        Intent intent = new Intent(getActivity(), InfoOrdersActivity.class);

// Запуск активности
        startActivity(intent);
    }
}