package com.example.car_repair_realese;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {

    private Button btnNew, btnActive;
    private NewButtonFragment newFragment;
    private ActiveButtonFragment activeFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        btnNew = view.findViewById(R.id.new_button);
        btnActive = view.findViewById(R.id.active_button);
        newFragment = new NewButtonFragment();
        activeFragment = new ActiveButtonFragment();

        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(newFragment);
                btnNew.setTextColor((ContextCompat.getColor(requireContext(),R.color.Blue_ptoject)));
                btnActive.setTextColor((ContextCompat.getColor(requireContext(),R.color.Grey_project)));
            }
        });

        btnActive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(activeFragment);
                btnNew.setTextColor((ContextCompat.getColor(requireContext(),R.color.Grey_project)));
                btnActive.setTextColor((ContextCompat.getColor(requireContext(),R.color.Blue_ptoject)));
            }
        });

        return view;
    }

    private void openFragment(Fragment fragment) {
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.containear, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
