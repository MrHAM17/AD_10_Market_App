package com.example.market;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    // 1. List to hold the data source for the RecyclerView.
    //    This list contains the data that will be displayed in the RecyclerView.
    //    Each item in the list corresponds to a single entry (e.g., a product or category).
    private List<Item> itemList;
    // 2. Click listener interface to handle item clicks.
    //    This allows the RecyclerView to handle user interaction events, such as clicking on a specific item.
    public ItemClickListner clickListner;

    // 3. Constructor to initialize the data source.
    //    The adapter is initialized with a list of data items (passed from the activity or fragment).

    public MyAdapter(List<Item>itemList){
        this.itemList = itemList;
    }

    // 4. Method to set the click listener.
    //    This method allows the parent activity or fragment to set a custom click listener
    //    to respond to item click events.
    public void setClickListener(ItemClickListner myListener){
        this.clickListner = myListener;
    }


    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 5. Inflate the layout for each item in the RecyclerView.
        //    This method creates a new ViewHolder by inflating the layout XML for a single item.
        //    It only creates enough ViewHolders to fit the visible screen and a few extra for smooth scrolling.
        // responsible for creating new view holders for your items
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        // 6. Bind data from the item list to the ViewHolder.
        //    This method sets the data for each view in the ViewHolder using the dataset at the given position.
        //    This ensures that the ViewHolder is updated with the correct data when recycled.
        // Binds the data from your dataset to the views within the view holder
        Item item = itemList.get(position);

        // Set the item's name, description, and image to the respective views in the layout.
        holder.title.setText(item.getItemName());
        holder.description.setText(item.getItemDesc());
        holder.imageView.setImageResource(item.getItemImg());
    }

    @Override
    public int getItemCount() {
        // 7. Return the total number of items in the dataset.
        //    This tells the RecyclerView how many items it needs to display.
        // Returns the total number of items in your dataset
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // 8. Define views for the item layout.
        //    The ViewHolder is a container for the views in a single item layout.
        //    It holds references to the views (e.g., ImageView, TextViews) that will display the data.
        // Holds references to the views within the item layout
        ImageView imageView;
        TextView title, description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // 9. Initialize the views for each item layout.
            //    This initialization happens for each visible item on the screen when the RecyclerView creates a ViewHolder.
            //    The RecyclerView only creates enough ViewHolders to fill the visible portion of the screen, plus a few extra for smooth scrolling.
            //    When items scroll off the screen, their ViewHolders are recycled and reused for new items coming into view.
            //    Therefore, this initialization ensures that the same ViewHolder can efficiently display different data as items are reused.

            imageView = itemView.findViewById(R.id.imageview);
            title = itemView.findViewById(R.id.title_txt);
            description = itemView.findViewById(R.id.description_text);

            // 10. Set the click listener for the item view.
            //     This ensures that the item reacts to user clicks and triggers the custom click listener in the adapter.
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // 11. Pass the click event to the custom listener.
            //     When an item is clicked, this method invokes the custom listener's onClick method
            //     and provides the position of the clicked item.
            if (clickListner != null){
                clickListner.onClick(v,getAdapterPosition());
            }
        }
    }
}
