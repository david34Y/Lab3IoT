package com.example.lab3copilot;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab3copilot.databinding.FragmentHistBinding;
import com.example.lab3copilot.databinding.FragmentPrimeBinding;


public class PrimeFragment extends Fragment {

    FragmentPrimeBinding binding;
    NavController navController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPrimeBinding.inflate(inflater,container,false);

        navController = NavHostFragment.findNavController(PrimeFragment.this);

        // Configurar el botón de retorno
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        binding.button.setOnClickListener(view -> navController.navigate(R.id.action_primeFragment_to_reFragment));

        binding.button2.setOnClickListener(view -> navController.navigate(R.id.action_primeFragment_to_emFragment));

        binding.button3.setOnClickListener(view -> navController.navigate(R.id.action_primeFragment_to_histFragment));
        return binding.getRoot();
    }

}