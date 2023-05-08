package com.example.lab3copilot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab3copilot.databinding.FragmentHistBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class HistFragment extends Fragment {

   FragmentHistBinding binding;

   ListaMascotasAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHistBinding.inflate(inflater,container,false);
        ArrayList<Mascota> lista = new ArrayList<>();

        // Inflate the layout for this fragment

        adapter = new ListaMascotasAdapter();


        MascotaViewModel viewModel = new ViewModelProvider(this).get(MascotaViewModel.class);
        viewModel.getListaMascotas().observe(getViewLifecycleOwner(), new Observer<ArrayList<Mascota>>() {
            @Override
            public void onChanged(ArrayList<Mascota> mascotas) {
                binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                binding.recyclerView.setAdapter(adapter);
                adapter.setContext(getContext());
                adapter.setListaMascotas(mascotas);
            }
        });

        return binding.getRoot();
    }
}