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

import com.example.ucgames.DetailsActivity;
import com.example.ucgames.Models.Game;
import com.example.ucgames.R;

import java.util.List;

// This Adapter is used to set up the Recycler View for the Item Cards in the Main Activity.
public class ItemCardAdapter extends RecyclerView.Adapter<ItemCardAdapter.ItemCardViewHolder>{

    Context context;
    List<Game> itemCardList;
    final int recyclerItemLimit = 10; // Sets Up Limit of 10 Items in Best Selling and Most Viewed.


    public static class ItemCardViewHolder extends RecyclerView.ViewHolder {

        ImageView cardImages;
        TextView cardTitles;
        TextView ratings;
        TextView prices;

        public ItemCardViewHolder(@NonNull View itemView){
            super(itemView);

            cardImages = itemView.findViewById(R.id.image_view_card_image_main);
            cardTitles = itemView.findViewById(R.id.text_view_game_title_main);
            ratings = itemView.findViewById(R.id.rating_main);
            prices = itemView.findViewById(R.id.text_view_price_main);

        }
    }

    // Constructor for the class takes in the context of the current state of the app
    // Also takes in the List of ItemCards that has been set up in the DataProvider.
    public ItemCardAdapter(Context context, List<Game> itemCardList) {
        this.context = context;
        this.itemCardList = itemCardList;
    }


    @NonNull
    @Override
    public ItemCardAdapter.ItemCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_layouts, parent, false);

        return new ItemCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemCardAdapter.ItemCardViewHolder holder, final int position) {
        final Game game = itemCardList.get(position);


        //Set the attributed of list_view_number_item views
        int icon = this.context.getResources().getIdentifier(
                itemCardList.get(position).getHeaderFilename()+"_1", "drawable",
                context.getPackageName());
        //Setting the header

        holder.cardImages.setImageResource(icon);


        holder.cardTitles.setText(game.getGameName());
        holder.ratings.setText(game.getGameRating());
        holder.prices.setText(game.getGamePrice());

        // Passes required values onto the Details Activity
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("name", game.getGameName());
                i.putExtra("rating",game.getGameRating());
                i.putExtra("cost",game.getGamePrice());
                i.putExtra("publisher",game.getGamePublisher());
                i.putExtra("developer",game.getGameDeveloper());
                i.putExtra("description",game.getGameDescription());
                i.putExtra("rsr",game.getGameRsr());
                i.putExtra("image", game.getHeaderFilename());
                context.startActivity(i);

            }
        });
    }

    // Makes sure that there are not more than the limit of item cards in the
    // Best Selling and Most Viewed Recycler Views.
    @Override
    public int getItemCount() {
        if (itemCardList.size() > recyclerItemLimit){
            return recyclerItemLimit;
        }
        return itemCardList.size();
    }


}




