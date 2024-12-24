package com.example.market;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerView extends AppCompatActivity implements ItemClickListner {

    // 1. Declare RecyclerView to display the list of items.
    RecyclerView myRecyclerView;

    // 2. Declare a data source to hold the list of items.
    List<Item> itemList;

    // 3. Declare the adapter to bridge data and RecyclerView.
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);

        // 4. Initialize the RecyclerView.
        myRecyclerView = findViewById(R.id.myRecyclerView);

        // 5. Prepare the data source by creating a list of items.
        itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.fruit, "Fruits", "Fresh Fruits from the Garden"));
        itemList.add(new Item(R.drawable.vegitables, "Vegetables", "Delicious Vegetables"));
        itemList.add(new Item(R.drawable.bread, "Bakery", "Bread, Wheat, and Beans"));
        itemList.add(new Item(R.drawable.beverage, "Beverage", "Juice, Tea, Coffee, and Soda"));
        itemList.add(new Item(R.drawable.milk, "Milk", "Milk, Shakes, and Yogurt"));
        itemList.add(new Item(R.drawable.popcorn, "Snacks", "Pop Corn, Donut, and Drinks"));

        // 6. Set the layout manager for the RecyclerView.
        // LinearLayoutManager is used for a vertical list.
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(layoutManager);

        // 7. Initialize the adapter and pass the data source to it.
        myAdapter = new MyAdapter(itemList);

        // 8. Set the adapter to the RecyclerView.
        myRecyclerView.setAdapter(myAdapter);

        // 9. Set the click listener for handling item clicks.
        myAdapter.setClickListener(this);
    }

    @Override
    public void onClick(View v, int pos) {
        // 10. Handle item click events.
        Toast.makeText(this,
                "You chose: " + itemList.get(pos).getItemName(),
                Toast.LENGTH_SHORT).show();
    }
}
