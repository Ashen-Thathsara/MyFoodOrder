package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.myapp.Adaptors.OrdersAdaptor;
import com.example.myapp.Models.OrdersModel;
import com.example.myapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "45567"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "45567"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "45567"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "45567"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "45567"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "45567"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "45567"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "45567"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "4", "45567"));

        OrdersAdaptor adaptor = new OrdersAdaptor(list, this);
        binding.orderRecclerView.setAdapter(adaptor);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecclerView.setLayoutManager(layoutManager);
    }
}