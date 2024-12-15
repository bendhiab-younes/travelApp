package com.example.projet2209;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projet2209.adapters.DestinationAdapter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] destinations = {"Paris", "New York", "Tokyo", "Rome", "Istanbul"};
        int[] photos = {R.drawable.paris, R.drawable.newyork, R.drawable.tokyo, R.drawable.rome, R.drawable.istanbul};

        List<Integer> photoList = IntStream.of(photos).boxed().collect(Collectors.toList());

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DestinationAdapter adapter = new DestinationAdapter(this, Arrays.asList(destinations), photoList);
        recyclerView.setAdapter(adapter);
    }
}