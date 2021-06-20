package com.example.ucgames;

import com.example.ucgames.Models.Game;
import com.example.ucgames.Adapters.CategoryAdapter;
import com.example.ucgames.Adapters.ItemCardAdapter;
import com.example.ucgames.Models.Category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.KeyEvent;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.example.ucgames.Data.DataProvider;

public class MainActivity extends AppCompatActivity{

    private LinearLayout topPart;


    RecyclerView categoryRecyclerView;
    CategoryAdapter categoryAdapter;
    List<Category> categoryList;

    RecyclerView bestSellingRecyclerView;
    ItemCardAdapter bestSellingAdapter;
    List<Game> bestSellingList;

    RecyclerView mostViewedRecyclerView;
    ItemCardAdapter mostViewedAdapter;
    List<Game> mostViewedList;

    EditText searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topPart = (LinearLayout) findViewById(R.id.custom_search_bar_main);
        topPart.setBackgroundColor(Color.parseColor("#060DD9"));

        categoryRecyclerView = findViewById(R.id.recycler_view_categories_main);
        bestSellingRecyclerView = findViewById(R.id.recycler_view_best_selling_main);
        mostViewedRecyclerView = findViewById(R.id.recycler_view_most_viewed_main);

        Animation slideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        categoryRecyclerView.startAnimation(slideUp);

        Animation slideUp1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        bestSellingRecyclerView.startAnimation(slideUp);

        Animation slideUp2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        mostViewedRecyclerView.startAnimation(slideUp);

        searchView = (EditText) findViewById(R.id.custom_search_view_main);
        searchView.clearFocus();



        searchView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
             @Override
             public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                 String searchText = searchView.getText().toString();
                 if (actionId == EditorInfo.IME_ACTION_DONE && !searchText.equals("")) {

                     searchView.clearFocus();

                     Intent i = new Intent(MainActivity.this, ListActivity.class);
                     i.putExtra("name", searchText);
                     startActivity(i);
                     finish();

                     return true;
                 }

                 searchView.clearFocus();
                 hideKeyboard();

                 return true;
             }

            });



        categoryList = DataProvider.getMainCategories();
        bestSellingList = DataProvider.getCardStuff();
        mostViewedList = DataProvider.getCardStuff();


        setCategoryRecycler(categoryList);

        /* Note that for the bestSelling and mostViewed items, we assume the data will be provided by
           the DataProvider server. This means this client app will not handle any sorting algorithms
           to conserve battery life.
         */
        setBestSellingRecycler(bestSellingList);
        setMostViewedRecycler(mostViewedList);
    }

    // Sets up the Categories Recycler View
    private void setCategoryRecycler(List<Category> categoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }

    // Sets up the Best Selling Recycler View
    private void setBestSellingRecycler(List<Game> bestsellingDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        bestSellingRecyclerView.setLayoutManager(layoutManager);
        bestSellingAdapter = new ItemCardAdapter(this,bestsellingDataList);
        bestSellingRecyclerView.setAdapter(bestSellingAdapter);
    }

    // Sets up the Most Viewed Recycler View
    private void setMostViewedRecycler(List<Game> mostViewedDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mostViewedRecyclerView.setLayoutManager(layoutManager);
        mostViewedAdapter = new ItemCardAdapter(this,mostViewedDataList);
        mostViewedRecyclerView.setAdapter(mostViewedAdapter);
    }

    private void hideKeyboard(){
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(searchView.getWindowToken(), 0);
    }
}