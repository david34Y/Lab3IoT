package com.example.lab3copilot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab3copilot.databinding.FragmentReBinding;


public class ReFragment extends Fragment {

    FragmentReBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentReBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}