package com.example.ucgames.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ucgames.ListActivity;
import com.example.ucgames.R;
import com.example.ucgames.Models.Category;

import java.util.List;

// This Adapter is used to set up the Recycler View for the Categories of Games
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    Context context;
    List<Category> categoryList;

    public static class CategoryViewHolder extends RecyclerView.ViewHolder{

        ImageView categoryImage;
        TextView categoryName;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryImage = itemView.findViewById(R.id.image_view_category_main);
            categoryName = itemView.findViewById(R.id.text_view_category_name_main);

        }
    }

    // Constructor for the class takes in the context of the current state of the app
    // Also takes in the List of Categories that has been set up in the DataProvider.
    public CategoryAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.category_row_items, parent, false);

        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, final int position) {

        holder.categoryImage.setImageResource(categoryList.get(position).getImageUrl());
        holder.categoryName.setText(categoryList.get(position).getCategoryName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(context, ListActivity.class);
                i.putExtra("name", categoryList.get(position).getCategoryName());
                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }



}
