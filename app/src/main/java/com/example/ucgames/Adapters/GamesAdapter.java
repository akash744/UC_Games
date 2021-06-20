package com.example.ucgames.Adapters;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ucgames.DetailsActivity;
import com.example.ucgames.Models.Game;
import com.example.ucgames.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.ViewHolder> implements Filterable {


    private Context mContext;
    //private MediaPlayer mediaPlayer;
    private List<Game> mGames;           //List of dataset, may be reduced
    private List<Game> mGamesFull;       //List of Full dataset, always full

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView nameTextView;
        public TextView publisherTextView;
        public ImageView iconImageView;
        public ImageView headerImageView;
        public CheckBox favouriteCheckBox;

        public ViewHolder(View currentRecyclerViewItem){
            super(currentRecyclerViewItem);

            iconImageView = (ImageView) currentRecyclerViewItem.findViewById(R.id.list_view_game_icon);
            headerImageView = (ImageView) currentRecyclerViewItem.findViewById(R.id.list_view_game_header);
            nameTextView = (TextView) currentRecyclerViewItem.findViewById(R.id.list_view_game_name_text);
            publisherTextView = (TextView) currentRecyclerViewItem.findViewById(R.id.list_view_game_publisher_text);
            favouriteCheckBox = (CheckBox) currentRecyclerViewItem.findViewById(R.id.list_view_favourite_checkbox);
        }
    }


    public GamesAdapter(List<Game> mGames){
        this.mGames = mGames;
        this.mGamesFull = new ArrayList<>(mGames);  // Make a copy of object list to be used
    }

    // Inflating a layout from XML and returning the holder
    @Override
    public GamesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        this.mContext = parent.getContext();

        // Inflate the custom layout
        LayoutInflater inflater = LayoutInflater.from(this.mContext);
        View numberView = inflater.inflate(R.layout.recycler_view_games_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(numberView);

        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(final GamesAdapter.ViewHolder vh, final int position){
        // Get the data model based on position
        final Game game = mGames.get(position);

        // Set item views based on views and data model
        populateGameName(vh, game);
        populateGamePublisher(vh, game);
        populateGameIcon(vh, game);
        populateGameHeaderImage(vh, game);
        populateFavouriteButton(vh);



        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Singleton might not be ideal, hence we use Intent Extras for now.
                // May consider Parcelable or persistent object in the future.
                Intent i = new Intent(mContext, DetailsActivity.class);
                i.putExtra("name", game.getGameName());
                i.putExtra("image", game.getHeaderFilename());
                i.putExtra("rating",game.getGameRating());
                i.putExtra("cost",game.getGamePrice());
                i.putExtra("publisher",game.getGamePublisher());
                i.putExtra("developer",game.getGameDeveloper());
                i.putExtra("description",game.getGameDescription());
                i.putExtra("rsr",game.getGameRsr());

                mContext.startActivity(i);
            }
        });

    }

    // Returns the total count of items in the current list
    @Override
    public int getItemCount(){
        return mGames.size();
    }

    // Returns the total count of items in the FULL list
    public int getTotalItemCount(){
        return  mGamesFull.size();
    }

    @Override
    public Filter getFilter() {
        return mGamesFilter;
    }

    /** No animations filter but has a worker thread
     */
    // Not the best way to do a search filter. But Filter.FilterResults is slightly more robust than making
    // a filter method. We have a free worker thread doing it this way without the need of AsyncTask
    // or Concurrency
    private Filter mGamesFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Game> filteredList = new ArrayList<>();

            if(constraint == null || constraint.length() == 0){
                filteredList.addAll(mGamesFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Game item : mGamesFull) {
                    if (item.getGameName().toLowerCase().contains(filterPattern) || item.getGameRating().toLowerCase().contains(filterPattern)){
                        filteredList.add(item);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            mGames.clear();
            mGames.addAll((List<Game>) results.values);
            notifyDataSetChanged();         //This thing is an expensive operation.

        }
    };
    /**********************************************************************************************/


    /** Animated filter with no worker
     */
    public void filter(CharSequence query){

        int completeListIndex = 0;
        int filteredListIndex = 0;

        //Converts to lower case and removes the space character
        String filterPattern = query.toString().toLowerCase().replace(" ","");


        // Loop through each game in the mGamesFull list, then compare the query to some strings in the list.
        // If match then add to the mGames list. Else remove from the mGames list.
        // Not the best way to implement a filter but can ultilise the notifyItem methods.
        // The notifyItem / notifyData ... are expensive operations but we use it for now!
        while (completeListIndex < mGamesFull.size()){
            Game item = mGamesFull.get(completeListIndex);

            //Converts to lower case and removes the space character
            String gameName = item.getGameName().toLowerCase().replace(" ","");
            String gamePublisher = item.getGamePublisher().toLowerCase().replace(" ","");
            String gameCategory = item.getGameCategory().toLowerCase().replace(" ","");


            // Main comparison logic
            if(gameName.contains(filterPattern) || gamePublisher.contains(filterPattern) || gameCategory.contains(filterPattern))  {

                if(filteredListIndex < mGames.size()) {          // Check when index < current size
                    Game filter = mGames.get(filteredListIndex);
                    if (item.getGameID() != (filter.getGameID())) {
                        updateAddGame(filteredListIndex, item);
                    }
                } else {                                         // Check when index > current size
                    updateAddGame(filteredListIndex, item);
                }
                filteredListIndex++;
            }

            else if(filteredListIndex < mGames.size()){          // Logic to remove unwanted games
                Game filter = mGames.get(filteredListIndex);
                if (item.getGameID() == (filter.getGameID())) {
                    updateRemoveGame(filteredListIndex);
                }
            }
            completeListIndex++;
        }
    }
    /**********************************************************************************************/



    private void populateGameName(ViewHolder vh, Game game){
        TextView textViewName = vh.nameTextView;
        textViewName.setText(game.getGameName());
    }

    private void  populateGamePublisher(ViewHolder vh, Game game){
        TextView textViewPublisher = vh.publisherTextView;
        if(game.getGamePublisher() != ""){
            textViewPublisher.setText(game.getGamePublisher());
        }  else {
            textViewPublisher.setText("");
        }
    }

    private void populateGameIcon(ViewHolder vh, Game game){
        ImageView imageViewIcon = vh.iconImageView;
        //Set the attributed of list_view_game_item views
        int icon = this.mContext.getResources().getIdentifier(
                game.getIconFileName(), "drawable",
                mContext.getPackageName());
        //Setting the icon
        imageViewIcon.setImageResource(icon);
    }

    private void  populateGameHeaderImage(ViewHolder vh, Game game){
        ImageView imageViewHeader = vh.headerImageView;
        //Set the attributed of list_view_number_item views
        int header = this.mContext.getResources().getIdentifier(
                game.getHeaderFilename()+"_1", "drawable",
                mContext.getPackageName());
        //Setting the header
        imageViewHeader.setImageResource(header);
    }

    private void populateFavouriteButton(ViewHolder vh){
        CheckBox checkboxFavourite = vh.favouriteCheckBox;
        checkboxFavourite.setButtonDrawable(R.drawable.ic_baseline_favorite_border_24);
    }

    private void updateAddGame(int filteredListIndex, Game item ){
        mGames.add(filteredListIndex, item);
        notifyItemInserted(filteredListIndex);
    }

    private void updateRemoveGame(int filteredListIndex){
        mGames.remove(filteredListIndex);
        notifyItemRemoved(filteredListIndex);
    }
}
