package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.databinding.Adapter.RecyclerAdapter;
import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.model.StudentModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        populateData();
    }

    public void populateData() {
        List<StudentModel> sList = new ArrayList<>();
        sList.add(new StudentModel("Anup Gautam", "MBBS"));
        sList.add(new StudentModel("Rupak Gauchan", "MBA"));
        sList.add(new StudentModel("Yubak Thakali", "MBS"));
        sList.add(new StudentModel("Joel Rai", "BALLB"));
        sList.add(new StudentModel("Peter Rai", "MIT"));
        sList.add(new StudentModel("Kailash Tamang", "MCA"));
        sList.add(new StudentModel("Anup Gautam", "MBBS"));
        sList.add(new StudentModel("Anup Gautam", "MBBS"));
        sList.add(new StudentModel("Rupak Gauchan", "MBA"));
        sList.add(new StudentModel("Rupak Gauchan", "MBA"));
        sList.add(new StudentModel("Yubak Thakali", "MBS"));
        sList.add(new StudentModel("Joel Rai", "BALLB"));
        sList.add(new StudentModel("Joel Rai", "BALLB"));
        sList.add(new StudentModel("Joel Rai", "BALLB"));
        sList.add(new StudentModel("Peter Rai", "MIT"));
        sList.add(new StudentModel("Peter Rai", "MIT"));
        sList.add(new StudentModel("Peter Rai", "MIT"));
        sList.add(new StudentModel("Peter Rai", "MIT"));
        sList.add(new StudentModel("Kailash Tamang", "MCA"));
        sList.add(new StudentModel("Kailash Tamang", "MCA"));


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        RecyclerAdapter adapter = new RecyclerAdapter(sList);
        binding.recyclerView.setAdapter(adapter);
    }


}