package com.example.ucgames;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.ucgames.Adapters.GamesAdapter;
import com.example.ucgames.Data.DataProvider;
import com.example.ucgames.Models.Game;

import java.util.List;

public class ListActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    List<Game> games;
    GamesAdapter adapter;
    RecyclerView rvGames;
    String intentSearchString;
    SearchView searchView;
    TextView resultTextView;
    String searchString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Initialise searchView query to an empty string. If a saved instance exists then set
        // the string to that saved one.
        searchString = "";
        if(savedInstanceState != null){
            searchString = savedInstanceState.getString("searchQuery");
        }

        resultTextView = findViewById(R.id.result_text_view);

        //Set Intent
        Intent i = getIntent();
        intentSearchString = i.getStringExtra("name");

        // Lookup the recyclerview in activity layout
        rvGames = (RecyclerView) findViewById(R.id.recycler_view_game_list);

        // Initialize numbers
        games = DataProvider.getGames();

        // Create adapter passing in the sample number data
        adapter = new GamesAdapter(games);

        // Attach the adapter to the recyclerview to populate items
        rvGames.setAdapter(adapter);

        // Create a LayoutManager
        LinearLayoutManager lm = new LinearLayoutManager(this);


        // For a Horizontal RecyclerView use
        // LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        // Set layout manager to position the items
        rvGames.setLayoutManager(lm);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Configure the action bar
        MenuItem searchItem = menu.findItem(R.id.action_search);
        searchView = (SearchView) searchItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setOnQueryTextListener(this);
        searchItem.expandActionView();


        // Set default search values when first open depending on contexts
        if(!searchString.equals("")){
            searchView.setQuery(searchString,false);
        } else {
            searchView.setQuery(intentSearchString, false);
        }


        searchView.clearFocus();

        // Set a listener for the action bar
        searchItem.setOnActionExpandListener(new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                return false;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                Intent i = new Intent(ListActivity.this, MainActivity.class);
                startActivity(i);
                finish();

                return false;
            }
        });

        return true;
    }




    @Override
    protected void onSaveInstanceState(Bundle outState) {
        searchString = searchView.getQuery().toString();
        outState.putString("searchQuery", searchString);
        super.onSaveInstanceState(outState);
    }


    /** Normal filter NOT using Filterable, currently in use   */
    @Override
    public boolean onQueryTextChange(String query) {
        adapter.filter(query);
        updateSearchResult();
        return false;
    }

    /** Filter using Filterable, reserved for future use.   */
//    @Override
//    public boolean onQueryTextChange(String query) {
//        adapter.getFilter().filter(query);
//        return false;
//    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }


    private void updateSearchResult(){
        String message;

        int gameCount = adapter.getItemCount();
        int totalCount = adapter.getTotalItemCount();

        if(gameCount == totalCount){
            message = "Showing all results";
        } else {
            message = gameCount + " results found";
        }
        resultTextView.setText(message);

        rvGames.scrollToPosition(0);

    }



}