package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.myapp.Adaptors.MainAdaptor;
import com.example.myapp.Models.MainModel;
import com.example.myapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger, "Burger" , "5" , "Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.pizza, "Pizza" , "12" , "Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.hotdog, "Hot Dog" , "6" , "Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.sandwich, "Sandwich" , "4" , "Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.frenchfries, "FrenchFires" , "10" , "Chicken Burger with Extra Cheese"));

        MainAdaptor adaptor = new MainAdaptor (list, this);
        binding.recylerview.setAdapter(adaptor);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);
    }
}